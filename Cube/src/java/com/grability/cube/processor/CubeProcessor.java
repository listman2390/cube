/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grability.cube.processor;

import com.grability.cube.object.Cube;
import com.grability.cube.object.Operation;
import com.grability.cube.object.Point;
import com.grability.cube.object.TestCase;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author listman
 */
public class CubeProcessor {
    
    /**
     * Metodo Comando que realiza el procesamiento de las operaciones
     * @param testCases
     * @return 
     */
    public List<String> procesar(List<TestCase> testCases){
         List<String> result=new ArrayList<>();
         for(TestCase testCase:testCases){
             Cube cube=new Cube(testCase.getMatrixLength());
             for(Operation operation:testCase.getOperations()){
                 switch(operation.getType()){
                     case Operation.OPERATION_UPDATE:
                         evalUpdate(operation, cube);
                         break;
                     case Operation.OPERATION_QUERY:
                         result.add(evalQuery(operation, cube));
                         break;
                 }
             }
         }
        return result;
    } 
    /**
     * Metodo que ejecuta la operacion de query
     * @param operation
     * @param cube
     * @return 
     */
    public String evalQuery(Operation operation,Cube cube){
        Point inf=operation.getData().get(0);
        Point sup=operation.getData().get(1);
        int total=0;
        for(Point point:cube.getPoints()){
            if(between(point.getX(), inf.getX(), sup.getX())
               && between(point.getY(), inf.getY(), sup.getY())
               && between(point.getZ(), inf.getZ(), sup.getZ())){
                total+=point.getV();
            }
        }
        return String.valueOf(total);
    }
    /**
     * Metodo helper que realiza la operacion between
     * @param value
     * @param value1
     * @param value2
     * @return 
     */
    private boolean between(long value, long value1, long value2) {
        return value >= value1 && value <= value2;
    }
    /**
     * Metodo que ejecuta la operacion de update
     * @param operation
     * @param cube 
     */
    public void evalUpdate(Operation operation,Cube cube){
        Point point= operation.getData().get(0);
        cube.setValue(point.getX()-1, point.getY()-1, point.getZ(), point.getV());
    }
}
