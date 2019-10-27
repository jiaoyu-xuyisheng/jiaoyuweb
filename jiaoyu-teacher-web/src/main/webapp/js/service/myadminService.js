
app.service('myadminService',function($http){
	
	this.loginName=function(){
		return $http.get('../login/name.do');		
	}
	
	
	this.findUser=function(){
		return $http.get('../login/findUser.do');
	}
	
	this.findAskList=function(){
		return $http.get('../login/findAskByUsername.do')
	}
	
	this.findAnswerList=function(){
		return $http.get('../login/findAnswerByUsername.do');
	}
	
	this.findKeListByUsername=function(){
		return $http.get('../login/findKeList.do');
	}
	
	this.findShoucangListByUsername=function(){
		return $http.get('../login/findShoucangList.do');
	}	
	

	//友情链接
	this.findFriendlyLink=function(){
		return $http.get('../link/findAll.do');
	}
	
	
})