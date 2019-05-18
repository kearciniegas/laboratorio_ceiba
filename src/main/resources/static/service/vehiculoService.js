(function () {
    'use strict';

    angular.module('app.parqueadero').factory('vehiculosService', serviciosVehiculos);

    function serviciosConstrucciones($http) {

        var servicios = {
            listadeVehiculos: listadeVehiculos
        };

        return servicios;

        
            }).then(function (response) {
                return response.data;
            }).catch(function (data) {function listadeVehiculos() {
            return $http({
                method: 'GET',
                url:  'localhost:8080/vehiculos/listVehiculos',
                }
                throw data;
            });
        }
    }
})();