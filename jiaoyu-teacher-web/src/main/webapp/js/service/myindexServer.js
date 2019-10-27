app.service('myindexService',function($http){	
	//读取列表数据绑定到表单中
	this.findAll=function(){
		return $http.get('ke/findAll.do');		
	}
	
	//读取菜单
	this.findMeun=function(){
		return $http.get('secondmenu/findMeun.do');
	}	
	
	//友情链接
	this.findFriendlyLink=function(){
		return $http.get('link/findAll.do');
	}
	
	//主分类查找
	this.findClassAll=function(){
		return $http.get('classification/findAll.do');
	}
	
	//选项卡的查找
	this.findByFirstId=function(firstid){
		return $http.get("ke/findByFirstId.do?firstid="+firstid);
	}
	
	//最受欢迎的课查找
	this.findPoupleList=function(){
		return $http.get("ke/findPoupleList.do");
	}
	
	
	//最新的课查找
	this.findNewKeList=function(){
		return $http.get("ke/findNewKeList.do");
	}
	
	//轮插图数据
	this.findKegdAll=function(){
		return $http.get('kegd/findAll.do');		
	}
	
	
	
	//读取列表数据绑定到表单中
	this.findNewsAll=function(){
		return $http.get('mynews/findNewNewsList.do');		
	}
	
	
	//增加 
	this.reg=function(entity,code){
		return  $http.post('jyuser/add.do?code='+code,entity );
	}
	
	//验证用户
	this.sendCode=function(phone){
		return  $http.get('jyuser/sendsms.do?phone='+phone);
	}
	
	
})