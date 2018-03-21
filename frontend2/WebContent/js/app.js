/**
 * Angular js module and config spa
 */
var app = angular.module('app', [ 'ngRoute', 'ngCookies' ]);
app.config(function($routeProvider) {
	$routeProvider.when("/", {
		templateUrl : "views/home.html"
	}).when('/register', {
		templateUrl : 'views/registrationform.html',
		controller : 'UserController'// $scope
	}).otherwise({
//		templateUrl : 'views/home.html'
		redirectTo: '/'
	})
})