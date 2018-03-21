/**
 * Employee Controller
 *//*
app.controller('EmployeeController',function($scope,EmployeeService){
	EmployeeService.getallEmployees().then
	(function(response){
		$scope.employees=response.data
		console.log(response.status)	
	},function(response){
		console.log(response.status)
	})
		$scope.addEmployee=function(employee){//from view
			console.log(employee)
			EmployeeService.addEmployee(employee).then(function(response){
				
				$scope.employee={}//clear all the form after successful insertion
				console.log(response.data)
				console.log(response.status)
			},function(response){
				
				console.log(response.status)
			})
		}
	})
*/