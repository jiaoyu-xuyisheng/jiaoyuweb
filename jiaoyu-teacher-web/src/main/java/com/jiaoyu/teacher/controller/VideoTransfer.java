package com.jiaoyu.teacher.controller;


	
	import java.io.*;


	public class VideoTransfer {

	     //ffmepg文件 安装目录
	     private static String ffmpeg = "D:\\开发常用工具\\ffmpeg-20181018-f72b990-win64-static\\bin\\ffmpeg";
	     
	     public static void main(String args[]) {
	        String infile = "d://2//64891541678_181026061053_97_02.264";
	        String outfile = "d://2//64891541678_181026061053_97_02.mp4";

	        if(transfer(infile, outfile)) {
	            System.out.println("the transfer is ok!");
	        } else {
	            System.out.println("the transfer is error!");
	        }
	    }
	     
	    public static boolean transfer(String infile,String outfile) {
//	        String avitoflv = "ffmpeg -i "+infile+" -ar 22050 -ab 56 -f flv -y -s 320x240 "+outfile;
//	        String flvto3gp = "ffmpeg -i " + infile + " -ar 8000 -ac 1 -acodec amr_nb -vcodec h263 -s 176x144 -r 12 -b 30 -ab 12 " + outfile;
//	        String avito3gp = "ffmpeg -i " + infile + " -ar 8000 -ac 1 -acodec amr_nb -vcodec h263 -s 176x144 -r 12 -b 30 -ab 12 " + outfile;
//	        String avitojpg = "ffmpeg -i " + infile + " -y -f image2 -ss 00:00:10 -t 00:00:01 -s 350x240 " + outfile;
//	        String h264tomp4 = ffmpeg + " -i "+infile+" -vcodec copy -f mp4 -y "+outfile;
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


