app.service("searchService",function($http){
	
	this.searchke=function(searchMap){
		return $http.post('ke/searchke.do',searchMap);
	}
})
