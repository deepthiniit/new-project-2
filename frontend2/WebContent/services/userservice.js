/**
 * user service-to make side calls
 */
app.factory('UserService',function($http){
	var userService={}
	var BackendUrl="http://localhost:8050/proj2middleware/";
	userService.registerUser=function(user){
		return $http.post(BackendUrl+"registeruser",user)
		
	}
	/*userService.login=function(user){
		console.log('userservice->login')
		console.log(user)
		return $http.post(BackendUrl+"login",user)
		
	}
	userService.logout=function(){
		return $http.put(BackendUrl+"logout")
	}
	userService.getUser=function(){
		return $http.get(BackendUrl+"getuser")
	}
	userService.updateUser=function(user){
		return $http.put(BackendUrl+"updateuser",user)
	}
	*/
	
	return userService;
	
	
})