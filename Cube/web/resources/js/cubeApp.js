			/**
        	 * 	Declaracion para creacion de la apliacion CubeApp
        	 **/
         	var app = angular.module('cubeApp', []);
			/**
			 * Declarcion para la creacion de
			 **/
                    app.controller('cubeController', function($scope, $http) {
					/*Variable que representa el numero de casos de prueba*/
                    $scope.numberOfTestCases = 0;
					/*Variable que representa el resultado de procesar los casos de prueba*/
                    $scope.result = [];
					/*Varaible que representa los casos de pruebas*/
                    $scope.testCases = [];                        
					/*Metodo Factory para crear un Operacion de Tipo UPDATE*/
                    $scope.createUpdateObject = function(){
                        return {data:[{x:0, y:0, z:0, v:0}], type:'UPDATE'};
                    };
		    /*Metodo Factory para crear una Operacion de Tipo QUERY*/
                    $scope.createQueryObject = function(){
                       return {data:[{x:0, y:0, z:0, v:0}, {x:0, y:0, z:0, v:0}], type:'QUERY'};
                    };
		    /*Metodo encargado de agregar una operacion a un caso de prueba*/
                    $scope.addQueryAction = function(it){
			$scope.testCases[it].operations.push($scope.createQueryObject());
                    };
                    /*Funcion encargada */
                    $scope.addUpdateAction = function(it){
                            $scope.testCases[it].operations.push($scope.createUpdateObject());
                    };
                    /*Metod encargado de cargar los casos de prueba inicales*/
                    $scope.loadTestCases = function(){
                            $scope.testCases = [];
                                    for (var i = 0; i < $scope.numberOfTestCases; i++){
                            $scope.testCases.push({matrixLength:0,
                                    height: 180,
                                    width: 180,
                                    top: - 158,
                                    top1:200,
                                    leftT:400,
                                    leftR: 500,
                                    leftL:300,
                                    leftT:400,
                                    operations:[]});
                            }
                    };
                    /*Metoodo encargado de generar estilos para genera el cubo*/
                    $scope.createStyle = function(w, h, l){
                           return "{width:'" + w + "px',height:'" + h + "px',left:'" + l + "px'}";
                    };
                    /*Metoodo encargado de generar estilos para genera el cubo*/
                    $scope.createStyleLeft = function(l){
                        return "{left:'" + l + "px'}";
                    };
                    /*Metoodo encargado de generar estilos para genera el cubo*/
                    $scope.createStyleTop = function(t){
                        return "{top:'" + t + "px'}";
                    };
                    /*Metoodo encargado de generar estilos para genera el cubo*/
                    $scope.createStyleTopLeft = function(t, l){
                        return "{top:'" + t + "px',left:'" + l + "px'}";
                    };
                    /*Metodo que inicializa las array que sirve como base para la construccion del cubo*/
                    $scope.creatArray = function(length){
                    var arr = [];
                            for (var i = 0; i < length; i++){
                            arr[i] = i;
                            }
                            return arr;
                    };
                    /*Metodo que es el encargado modificar el tamaño del cubo que se meuestra por pantalla*/
                    $scope.resize = function(it){
                            $scope.testCases[it].height = 3.6;
                            $scope.testCases[it].width = 3.6;
                            $scope.testCases[it].top = - 18.7;
                            $scope.testCases[it].top1 = 130;
                            $scope.testCases[it].leftR = 407.95;
                            $scope.testCases[it].leftL = 384;
                            $scope.testCases[it].leftT = 395.45;
                            for (var i = 0; i < $scope.testCases[it].matrixLength; i++){
                                    $scope.testCases[it].height = $scope.testCases[it].height + 25.2;
                                    $scope.testCases[it].width = $scope.testCases[it].width + 25.2;
                                    $scope.testCases[it].top = $scope.testCases[it].top - 19.9;
                                    $scope.testCases[it].top1 = $scope.testCases[it].top1 + 10;
                                    $scope.testCases[it].leftR = $scope.testCases[it].leftR + 13.15;
                                    $scope.testCases[it].leftL = $scope.testCases[it].leftL - 12;
                                    $scope.testCases[it].leftT = $scope.testCases[it].leftT + 0.65;
                            }
                    };
                    $scope.updateObject = $scope.createUpdateObject();
                    $scope.queryObject = $scope.createQueryObject();
                    /*funcion que permite verificar si una opreacion de actualizacion es realiza en el cubo*/
                    $scope.findValue = function(x, y, z, it){
                            for (var i = 0; i < $scope.testCases[it].operations.length; i++){
                                var operation = $scope.testCases[it].operations[i];
                                if (operation.type === 'UPDATE' && parseInt(operation.data[0].x) - 1 == x && parseInt(operation.data[0].y) - 1 == y && parseInt(operation.data[0].z) - 1 == z){
                                    return operation.data[0].v;
                                }
                            }
                     return 0;
                    };
                    /*Funcion que carga lso valore  de la cara derecha delcubo*/
                     $scope.findValueRight = function(l, y, it){
                            var values = $scope.creatArray(l);
                            for (var i = 0; i < l; i++){
                            values[i] = $scope.findValue(i, y, 0, it)
                            }
                            return values;
                     };
                     /*Funcion que carga lso valore  de la cara izquierda delcubo*/
                            $scope.findValueLeft = function(l, y, it){
                                var values = $scope.creatArray(l);
                                for (var i = 0; i < l; i++){
                                    values[i] = $scope.findValue(0, y, l - i - 1, it);
                                }
                                return values;
                            };
                           /**Funcion que carga lso valore  de la cara superior delcubo**/
                            $scope.findValueTop = function(l, y, it){
                                    var values = $scope.creatArray(l);
                                    for (var i = 0; i < l; i++){
                                        values[i] = $scope.findValue(l - y - 1, 0, l - i - 1, it)
                                    }
                                    return values;
                            };
                            /*funcion que valida los rangos de las opreaciones de actualizacion */
                            $scope.validate = function(value, target){
	                            if (value == ''){
                                        return value;
	                            } else  if (parseInt(value) <= 0){
                                         alert("El valor no puede ser menor o igual que cero");
	                                 return 0;
	                            } else if (parseInt(value) > parseInt(target)){
                                        alert("El valor no pueder ser mayor al tama�o de la matrix " + target);
	                                return 0;
	                            }
	                            return value;
                            };
                            /**Validacione sobre la operaciones de consulta*/
                            $scope.validateQuery = function(valPosIni, valPosFin,maxLenght, campo){
	                            	if(parseInt(valPosIni)<1){
	                            		alert("el valor del campo ["+campo+"] debe ser mayor a 1");
	                            	}else if(parseInt(valPosIni)>maxLenght){
	                            		alert("el valor del campo ["+campo+"] debe ser menor al tama�o de la matriz");
	                            	}else if(parseInt(valPosFin)==0){
	                            		return valPosIni;
	                            	}else if(parseInt(valPosIni) > parseInt(valPosFin)){
	                            		alert("el valor del campo ["+campo+"] debe ser menor al campo "+campo+"2");
	                            	}else if(parseInt(valPosFin)>maxLenght){
	                            		alert("el valor del campo ["+campo+"2] debe ser menor al tama�o de la matriz");
	                            	}else{
	                            		return valPosIni; 
	                            	}
	                            	
                            };
                            /**
                             * funcion que perminte validar si un valor 
                             */
                            $scope.between = function(value, value1, value2){
	                            if (value == ''){
	                            	return value;
	                            } else if (parseInt(value) < parseInt(value1) || parseInt(value) > parseInt(value2)){
	                            		alert("el valor debe estar en el rango de " + value1 + " a " + value2);
	                                return 0;
	                            }
                            	return value;
                            };
                            /*Funcion encargada de enviar los datos al servicio para proceder a realizar la validacion*/
                            $scope.send = function(){
                                $http.post('/Cube/webresources/cube', $scope.testCases).success(function(data, status, headers, config) {
                                    $scope.result = data;
                                }).error(function(data, status, headers, config) {
                                    alert("failure message: " + JSON.stringify({data: data}));
                                });
                            };
                            /*Funcio que permite validar las constrains de valores*/
                            $scope.validateValue=function(value){
                            	if(parseInt(value)<-1000000000||parseInt(value)>1000000000){
                            		alert("El valor no puede estar fuera del rango [-10^9 a 10^9]");
                            		return 0;
                            	}
                            	return value;
                            };
                    });