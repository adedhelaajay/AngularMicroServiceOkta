var app = angular.module('app', ['ngRoute','ngResource']);
app.config(function($routeProvider){
    $routeProvider
	    .when('/myfrontEnd',{
	        templateUrl: '/views/home.html',
	        controller: 'homeController'
	    })
	    .when('/backend',{
	        templateUrl: '/views/backendresp.html',
	        controller: 'backendController'
	    })	    
        .when('/users',{
            templateUrl: '/views/users.html',
            controller: 'usersController'
        })
        .when('/roles',{
            templateUrl: '/views/roles.html',
            controller: 'rolesController'
        })
        .otherwise(
            { redirectTo: '/'}
        );
});