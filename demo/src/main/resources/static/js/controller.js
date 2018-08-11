app.controller('backendController', function($scope) {
    $scope.headingTitle = "Back End Service";
});

app.controller('usersController', function($scope) {
    $scope.headingTitle = "User List";
});

app.controller('rolesController', function($scope) {
    $scope.headingTitle = "Roles List";
});

app.controller(
		'homeController', [ '$scope', function($scope) {
			$scope.master = {};
			$scope.headingTitle = "Front End Service";
			$scope.update = function(user) {
				$scope.master = angular.copy(user);
			};

			$scope.reset = function() {
				$scope.user = angular.copy($scope.master);
			};

			$scope.reset();
		} ]);