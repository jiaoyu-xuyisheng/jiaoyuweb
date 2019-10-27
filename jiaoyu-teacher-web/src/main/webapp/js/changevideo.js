	$("#ulvideobox").on('click','li',function(){
 			$("#myvideo").attr({src:$(this).find('.myp').attr("mystyle")});
 		})