package com.jiaoyu.teacher.controller;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import com.alibaba.fastjson.JSONObject;
import util.FastDFSClient;

@RestController
@RequestMapping("/up")
public class UploadController {

	@Value("${FILE_SERVER_URL}")
	private String FILE_SERVER_URL;//文件服务器地址
	
	 private static String ffmpeg = "D:\\BaiduNetdiskDownload\\Rar\\ffmpeg-4.1.3-win64-static\\bin\\ffmpeg";
	
	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	public String upload(MultipartFile file) {
		System.out.println("accosse the upload!!");
		String originalFilename = file.getOriginalFilename();
		String extName = originalFilename.substring(originalFilename.lastIndexOf(".")+1);	    
		Map<String,Object> map = new HashMap<String,Object>();
	    Map<String,Object> map2 = new HashMap<String,Object>();
		
		try {
			FastDFSClient fastDFSClient=new FastDFSClient("classpath:config/fdfs_client.conf");
			String path = fastDFSClient.uploadFile(file.getBytes(),extName,null);
			String url=FILE_SERVER_URL+path;		
			map.put("code",0);//0表示成功，1失败
			map.put("msg","上传成功");//提示消息
			map.put("data",map2);
			map2.put("src",url);//图片url
			map2.put("title",extName);//图片名称，这个会显示在输入框里			
		    String result = new JSONObject(map).toString();
			System.out.println(result);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			map.put("code",1);//0表示成功，1失败
			map.put("msg","上传失败");//提示消息
			map2.put("src","");//图片url
			map2.put("title",extName);//图片名称，这个会显示在输入框里	
		     String result = new JSONObject(map).toString();
			return result;
		}
	}
	
	
	@RequestMapping(value = "/upload2", method = RequestMethod.POST)
	public String upload2(MultipartFile file) {
		System.out.println("accosse the upload!!");
		String originalFilename = file.getOriginalFilename();

		String extName = originalFilename.substring(originalFilename.lastIndexOf(".")+1);	    
		Map<String,Object> map = new HashMap<String,Object>();
	    Map<String,Object> map2 = new HashMap<String,Object>();
		try {
			FastDFSClient fastDFSClient=new FastDFSClient("classpath:config/fdfs_client.conf");
			String path = fastDFSClient.uploadFile(file.getBytes(),extName,null);
			String url=FILE_SERVER_URL+path;		
			path=path.substring(path.lastIndexOf("/")+1);
			String url2=path.substring(0, path.length()-3)+"mp4";
			boolean b = transfer(url,url2);
			System.out.println(b);
			map.put("code",0);//0表示成功，1失败
			map.put("msg","上传成功");//提示消息
			map.put("data",map2);
			map2.put("src",url);//图片url
			map2.put("title",url2);//图片名称，这个会显示在输入框里			
		    String result = new JSONObject(map).toString();
			System.out.println(result);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			map.put("code",1);//0表示成功，1失败
			map.put("msg","上传失败");//提示消息
			map2.put("src","");//图片url
			map2.put("title",extName);//图片名称，这个会显示在输入框里	
		     String result = new JSONObject(map).toString();
			return result;
		}
	}
	
    public  boolean transfer(String infile,String outfile) {
    	
    	 String h264tomp4 = ffmpeg + " -r 5 -i "+infile+" -vcodec copy -f mp4 -y "+outfile;
        try {
            Runtime rt = Runtime.getRuntime();
            Process proc = rt.exec(h264tomp4);
            InputStream stderr = proc.getErrorStream();
            InputStreamReader isr = new InputStreamReader(stderr);
            BufferedReader br = new BufferedReader(isr);
            String line = null;

            while ( (line = br.readLine()) != null) {
                System.out.println(line);
            }
            int exitVal = proc.waitFor();
            System.out.println("Process exitValue: " + exitVal);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
	
	
}
