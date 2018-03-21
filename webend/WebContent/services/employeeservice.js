/**
 *Employee Service 
 *//*
app.factory('EmployeeService',function($http){
	var employeeSrvice={}
	employeeService.getAllEmployees=function(){
	return	$http.get("http://localhost:8020/middleware/getallemployees")
	}
	employeeService.addEmployee=function(employee){//employee from controller
		//$http.post(url,data)
		return $http.post("http://localhost:8020/middleware/addemployee",employee)//new employee details
	}
	return emplyoeeService
})*/