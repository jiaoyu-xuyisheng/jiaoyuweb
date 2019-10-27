 //控制层 
app.controller('upstartController' ,function($scope,upstartService){	
	
	$scope.addUpStart=function(answerid){
		upstartService.addUpStart(answerid).success(
				function(response){
					$scope.result=response;
				}
		)
	}

    
});	
