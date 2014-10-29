function Hello($scope, $http) {
    $http.get('http://localhost:8080/babybloom/event').
        success(function(data) {
            $scope.event = data;
        });
}