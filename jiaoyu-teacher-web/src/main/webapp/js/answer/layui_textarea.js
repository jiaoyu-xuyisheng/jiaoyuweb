 //文本编辑器
    layui.use('layedit', function(){
        var layedit = layui.layedit
            ,$ = layui.jquery;

        layedit.set({
            uploadImage: {
                url: 'http://localhost:8092/up/upload.do' //接口url
                ,type: 'post' //默认post
            },
            height:200
        });
        //构建一个默认的编辑器
        var index = layedit.build('LAY_demo3');

        //编辑器外部操作
        var active = {
            content: function(){
               return  layedit.getContent(index); //获取编辑器内容
            }
        };

        $('#answerbtn').on('click', function(){
          	var container=active.content();
          	$.post("http://localhost:8092/login/addAnswer.do",{"askid":askid,"container":container},function(data){
          		if(data.message==null){
 					layer.msg("亲！你先登录一下！再刷新一下就好了！！");
	 			}else{
	 				layer.msg(data.message);
	 			}
          	})
        });

    });   
    