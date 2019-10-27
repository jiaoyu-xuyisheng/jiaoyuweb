app.controller('searchController',function($scope,searchService){	
	$scope.searchMap={"keywords":keywords}
	console.log($scope.searchMap)
	
	$scope.searchke=function(){
		searchService.searchke( $scope.searchMap ).success(
				function(response){						
					$scope.resultMap=response;
					$scope.total=response.total;
					
					layui.use('laypage', function(){
				        var laypage = layui.laypage;
				        //执行一个laypage实例
				        laypage.render({
				            elem: 'layerpage' //注意，这里的 test1 是 ID，不用加 # 号
				            ,limit:5,           					           
				            count: $scope.total,
				            jump:function(obj,first){
				            	$scope.searchMap.pageNo=obj.curr;
				            	$scope.searchMap.pageSize=obj.limit;
				            	$scope.searchkepage=function(){
				            		searchService.searchke( $scope.searchMap).success(          				
				            				function(response){
				            					$scope.resultMap=response;
				            		 })
				            	}();				            		
				            	
				            }
				        
				        });
				    }); 					
				}
			);	
	}

	
	$scope.addSearchItem=function(value,asc){
		$scope.searchMap.sortField=value;
		$scope.searchMap.sort=asc;
		$scope.searchke();
	}
	
	
})


 app.filter('trust2Html', ['$sce',function($sce) { return function(val) {  return $sce.trustAsHtml(val);  };}])