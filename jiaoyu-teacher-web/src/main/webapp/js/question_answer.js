   function GetQueryString(name){
    	var reg = new RegExp("(^|&)"+ name +"=([^&]*)(&|$)");
    	var r = window.location.search.substr(1).match(reg);
    	if(r!=null)return  unescape(r[2]); return null;

    }
    var askid=GetQueryString("askid");
    
    
    
    
    app.service('myindexService',function($http){	
    	
    	this.findAnswerPage=function(){
    		return $http.get('asklist/findAnswerPage.do?askid='+askid);		
    	}
    	
    	this.findAnswerListByAskId=function(pageNum,pageSize){
    		return $http.get('answer/findAnswerListByAskId.do?askid='+askid+'&pageNum='+pageNum+'&pageSize='+pageSize);
    	}
    	
    	//点赞
    	this.addUpStart=function(answerid){
    		return $http.get('login/addUpStart.do?answerid='+answerid);		
    	}
    	
    	//友情链接
    	this.findFriendlyLink=function(){
    		return $http.get('link/findAll.do');
    	}   
    	
    	//点low
    	this.addLow=function(answerid){
    		return $http.get('login/addLow.do?answerid='+answerid)
    	}
    	
    })
    
    
      
    app.controller('myindexController' ,function($scope,$controller,myindexService,$sce){	
	
    
	$scope.findAnswerPage=function(){
		myindexService.findAnswerPage().success(
			function(response){
				$scope.askmap=response;	
				var myhtml=$scope.askmap.askContent;
				$("#askContent").html(myhtml);
			}			
		);
	}  	
	
	
	  layui.use('laypage', function(){
	        var laypage = layui.laypage;
	        //执行一个laypage实例
	        laypage.render({
	            elem: 'answerpage' //注意，这里的 test1 是 ID，不用加 # 号
	            ,limit:2,           					           
	            jump:function(obj,first){
	            	$scope.findAnswerListByAskId=function(){
	            	myindexService.findAnswerListByAskId(obj.curr,obj.limit).success(
	            			function(response){
	            				$scope.ansmap=response.rows;
	            				$scope.anspageCount=response.total;
	            				
	            				  layui.use('laypage', function(){
          					        var laypage = layui.laypage;
          					        //执行一个laypage实例
          					        laypage.render({
          					            elem: 'answerpage' //注意，这里的 test1 是 ID，不用加 # 号
          					            ,limit:2,           					           
          					            count: $scope.anspageCount,
          					            jump:function(obj,first){
          					            	(function(){
          					            		 myindexService.findAnswerListByAskId(obj.curr,obj.limit).success(          				
          					            				function(response){
          					            					$scope.ansmap=response.rows;
          					            					 })})();
          					            }
          					        
          					        });
          					    }); 
	            				
	            				
	            				
	            				
	            			}			
	            		)
	            	}
	            	
	            	
	            }
	        
	        });
	    }); 
	
	  $scope.findAnswerListByAskId()
	//友情链接
	$scope.findFriendlyLink=function(){
		myindexService.findFriendlyLink().success(
			function(response){
				$scope.friendlylist=response;
			}
		)
		
	}
	
	//点赞方法
	$scope.addUpStart=function(answerid){
		myindexService.addUpStart(answerid).success(
				function(response){
					$scope.upresult=response;
					if($scope.upresult.message==null){
						layer.msg("请先登录呀！！")
					}else{
						$scope.findAnswerListByAskId();
						layer.msg($scope.upresult.message);
					
					}
				
				}
		)
	}
	
	//点low方法
	$scope.addLow=function(answerid){
		myindexService.addLow(answerid).success(				
				function(response){
					$scope.lowresult=response;
					if($scope.lowresult.message==null){
						layer.msg("请先登录呀！！")
					}else{
						$scope.findAnswerListByAskId();
						layer.msg($scope.lowresult.message);						
						
						
					}
				
				}
		)
	}
	
	
    })
    
   
 app.filter('trust2Html', ['$sce',function($sce) { return function(val) {  return $sce.trustAsHtml(val);  };}])
    
    
    
    
    
    