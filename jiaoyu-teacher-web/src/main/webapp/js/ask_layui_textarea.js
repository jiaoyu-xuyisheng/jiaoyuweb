$(function(){
	layui.use(['form', 'layedit', 'laydate'], function() {
		
        var form = layui.form
          , layer = layui.layer
          , layedit = layui.layedit
          , laydate = layui.laydate;
      //上传图片,必须放在 创建一个编辑器前面
      layedit.set({
          uploadImage: {
               url: 'http://localhost:8092/up/upload.do' //接口url
              ,type: 'post' //默认post
          }
      });
      //创建一个编辑器
      var editIndex = layedit.build('content',{
              height:200
          }
      );
      
    //编辑器外部操作
      var active = {
        content: function(){
          return layedit.getContent(editIndex); //获取编辑器内容
        }
      
      };
    
 	$("#askbtn").on('click',function(){
 		var askContainer=active.content();
 		var askTitle=$("#asktitle").val();
 		$.post("http://localhost:8092/login/add.do",{"keId":keid,"askTitle":askTitle,"askContainer":askContainer},function(data){
 			if(data.message==null){
 				layer.msg("亲！你先登录一下！再刷新一下就好了！！");
 			}else{
 				layer.msg(data.message);
 			}
 		})
 	})
      
});
})

$(function(){
	layui.use(['form', 'layedit', 'laydate'], function() {
		
        var form = layui.form
          , layer = layui.layer
          , layedit = layui.layedit
          , laydate = layui.laydate;
      //上传图片,必须放在 创建一个编辑器前面
      layedit.set({
          uploadImage: {
               url: 'http://localhost:8092/up/upload.do' //接口url
              ,type: 'post' //默认post
          }
      });
      //创建一个编辑器
      var editIndex = layedit.build('LAY_demo2',{
              height:200
          }
      );
      
    //编辑器外部操作
      var active = {
        content: function(){
          return layedit.getContent(editIndex); //获取编辑器内容
        }
      
      };
    
 	$("#pinjiabtn").on('click',function(){
 		var pjContainer=active.content();
 		var pjselect=$("#pjselect option:selected").text();
 		console.log("%c%s",
            "color: red; background: yellow; font-size: 24px;",
            pjContainer+"\n"+pjselect)
 		$.post("http://localhost:8092/login/addpj.do",{"keId":keid,"comcontent":pjContainer,"start":pjselect},function(data){
 			if(data.message==null){
 				layer.msg("亲！你先登录一下！再刷新一下就好了！！");
 			}else{
 				layer.msg(data.message);
 			}
 		})
 	})
      
});
})
