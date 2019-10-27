app.controller('myadminController' ,function($scope,$controller,myadminService){
	//得到用户名
	$scope.loginName=function(){
		myadminService.loginName().success(
			function(response){
				$scope.username=response.loginName;
			}		
		)
	}
	
	//找到当前用户信息
	$scope.findUser=function(){
		myadminService.findUser().success(
				
			function(response){
				$scope.loginentity=response;
			}
		)		
	}
	
	
	//找到问题列表
	$scope.findAskList=function(){
		myadminService.findAskList().success(
				
				function(response){
					$scope.adminAsklist=response;
				}
				
		)
		
		
	}
	
	//找到我回答的列表
	$scope.findAnswerList=function(){
		myadminService.findAnswerList().success(
			
				function(response){
					$scope.adminAnswerList=response;
				}
		)
	}
	
	
	//找到我上传的课程列表
	$scope.findKeListByUsername=function(){
		myadminService.findKeListByUsername().success(
				
				function(response){
					$scope.adminKeList=response;
				}
				
		)
	}
	
	//找到收藏列表
	$scope.findShoucangListByUsername=function(){
		
		
		myadminService.findShoucangListByUsername().success(
				
				function(response){
					
					$scope.adminShoucangList=response;
					
				}	
		)
	}
	
	
	
	//友情链接
	$scope.findFriendlyLink=function(){
		myadminService.findFriendlyLink().success(
			function(response){
				$scope.friendlylist=response;
			}
		)
		
	}
	
	
	
	
})	
	