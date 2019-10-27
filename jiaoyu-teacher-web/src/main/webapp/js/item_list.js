   function GetQueryString(name){
    	var reg = new RegExp("(^|&)"+ name +"=([^&]*)(&|$)");
    	var r = window.location.search.substr(1).match(reg);
    	if(r!=null)return  unescape(r[2]); return null;

    }
    var keid=GetQueryString("keid");
   
 

  
    app.service('myindexService',function($http){	
    	
    	this.findKeMap=function(){
    		return $http.get('ke/findKe.do?keid='+keid);		
    	}
    	
    	this.findCommentList=function(pageNum,pageSize){
    		return $http.get('kecomment/findListByKeId.do?keid='+keid+'&pageNum='+pageNum+'&pageSize='+pageSize)
    	}
    	
    	
    	this.findAskMap=function(pageNum,pageSize){
    		return $http.get('asklist/findAskListByKeId.do?keid='+keid+'&pageNum='+pageNum+'&pageSize='+pageSize)
    	}
    	
    	//友情链接
    	this.findFriendlyLink=function(){
    		return $http.get('link/findAll.do');
    	}
    	   
    	
    })
    
    
    app.controller('myindexController' ,function($scope,$controller,myindexService){	
	
    //读取列表数据绑定到表单中  
	$scope.findKeMap=function(){
		myindexService.findKeMap().success(
			function(response){
				$scope.kemap=response;				
			}			
		);
	}  	
	
	//分页kecomment
	  layui.use('laypage', function(){
	        var laypage = layui.laypage;
	        //执行一个laypage实例
	        laypage.render({
	            elem: 'mypagehelp' //注意，这里的 test1 是 ID，不用加 # 号
	            ,limit:4,           					           
	            jump:function(obj,first){
	            	$scope.findCommentList=function(){
	            		myindexService.findCommentList(obj.curr,obj.limit).success(
	            				function(response){
	            					$scope.commap=response.rows;
	            					 $scope.compageCount=response.total;
	            					 
	            					  layui.use('laypage', function(){
	            					        var laypage = layui.laypage;
	            					        //执行一个laypage实例
	            					        laypage.render({
	            					            elem: 'mypagehelp' //注意，这里的 test1 是 ID，不用加 # 号
	            					            ,limit:4,           					           
	            					            count: $scope.compageCount,
	            					            jump:function(obj,first){
	            					            	(function(){
	            					            		 myindexService.findCommentList(obj.curr,obj.limit).success(          				
	            					            				function(response){
	            					            					$scope.commap=response.rows;
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
	
	  
	  $scope.findCommentList()
	
	//分页ask
    layui.use('laypage', function(){
        var laypage = layui.laypage;
        //执行一个laypage实例
        laypage.render({
            elem: 'test1' //注意，这里的 test1 是 ID，不用加 # 号
            ,limit:4,
           //每页显示多少条
            jump:function(obj,first){
            	
            	 $scope.findAskMap=function(){
            		 myindexService.findAskMap(obj.curr,obj.limit).success(          				
            				function(response){
            					 $scope.map=response;
            					 $scope.pageCount=response.pageCount;
            					           					 
            					  layui.use('laypage', function(){
            					        var laypage = layui.laypage;
            					        //执行一个laypage实例
            					        laypage.render({
            					            elem: 'test1' //注意，这里的 test1 是 ID，不用加 # 号
            					            ,limit:4,           					           
            					            count:$scope.pageCount,
            					            jump:function(obj,first){
            					            	(function(){
            					            		 myindexService.findAskMap(obj.curr,obj.limit).success(          				
            					            				function(response){
            					            					 $scope.map=response;
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
	
     
    $scope.findAskMap();
    console.log()
	//友情链接
	$scope.findFriendlyLink=function(){
		myindexService.findFriendlyLink().success(
			function(response){
				$scope.friendlylist=response;
			}
		)
		
	}
			

	
	
    })
    
    app.filter('trust2Html', ['$sce',function($sce) { return function(val) {  return $sce.trustAsHtml(val);  };}])
   
      