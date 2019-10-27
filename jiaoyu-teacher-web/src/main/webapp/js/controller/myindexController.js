app.controller('myindexController' ,function($scope,$controller,myindexService){	
	

    //读取列表数据绑定到表单中  
	$scope.findAll=function(){
		myindexService.findAll().success(
			function(response){
				$scope.list=response;
			}			
		);
	}  
	
	//得到二级菜单
	$scope.findMeun=function(){
		myindexService.findMeun().success(
				function(response){
					$scope.mylist=response;					
				}
		)
	}
	
	//友情链接
	$scope.findFriendlyLink=function(){
		myindexService.findFriendlyLink().success(
			function(response){
				$scope.friendlylist=response;
			}
		)
		
	}
	
	//主分类
	$scope.findClassAll=function(){
		myindexService.findClassAll().success(
				function(response){
					$scope.classlist=response;
				}
		
		)
	}
	
	//选项卡的查找
	$scope.findByFirstId=function(firstid){
		myindexService.findByFirstId(firstid).success(
				function(response){
					if(firstid==1){
						$scope.firstidlist1=response;
					}else if(firstid==2){
						$scope.firstidlist2=response;
					}else if(firstid==3){
						$scope.firstidlist3=response;
					}else if(firstid==4){
						$scope.firstidlist4=response;
					}else if(firstid==5){
						$scope.firstidlist5=response;
					}else if(firstid==6){
						$scope.firstidlist6=response;
					}else if(firstid==7){
						$scope.firstidlist7=response;
					}else if(firstid==8){
						$scope.firstidlist8=response;
					}else if(firstid==9){
						$scope.firstidlist9=response;
					}else if(firstid==10){
						$scope.firstidlist10=response;
					}				
				}
			
				
		
		)
	}
	

	
	
	
	//最受欢迎的课查找
	$scope.findPoupleList=function(){
		myindexService.findPoupleList().success(
				function(response){
					$scope.pouplelist=response;
				}
		
		)
	}
	
	//最受欢迎的课查找
	$scope.findNewKeList=function(){
		myindexService.findNewKeList().success(
				function(response){
					$scope.newkelist=response;
				}
		
		)
	}
	
	
	//轮插图数据
	$scope.findKegdAll=function(){
		myindexService.findKegdAll().success(
				function(response){
					$scope.Kegdlist=response;
				}
		
		)
	}
	
	
	//轮插图数据
	$scope.findNewsAll=function(){
		myindexService.findNewsAll().success(
				function(response){
					$scope.Newslist=response;
				}
		
		)
	}
	
	//用户注册
	$scope.reg=function(){
	    if($scope.entity.jyPassword!=$scope.password)  {
	      	layer.msg("两次输入的密码不一致，请重新输入");		    	
	      	return ;
	    } 
		myindexService.reg($scope.entity,$scope.code).success(
				function(response){
					if(response.success){
						layer.msg(response.message);
						location.href="http://localhost:8092/login.html";
					}else{
						layer.msg(response.message)
					}
				}
		)
	}
	
	$scope.sendCode=function(){
		myindexService.sendCode($scope.entity.jyPhone).success(
				function(response){
					layer.msg(response.message);
				}
		
		)
		
	
	}
	
	
	
	
	
	
	
})