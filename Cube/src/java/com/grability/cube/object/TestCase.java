/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grability.cube.object;

import java.util.List;
import javax.persistence.Entity;

/**
 *
 * @author listman
 */

public class TestCase {
	/**
	 * tamaño de la matrix
	 */
    private int matrixLength;
    /**
     * Lista de operaciones que se realizan en el caso de prueba
     */
    private List<Operation> operations;
    /**
     * metodo get para el tamaño de la matriz
     */
    public int getMatrixLength() {
        return matrixLength;
    }
    /**
     * metodo set para el tamaño de la matriz
     */
    public void setMatrixLength(int matrixLength) {
        this.matrixLength = matrixLength;
    }
    /**
     * metodo get para las operaciones
     */
    public List<Operation> getOperations() {
        return operations;
    }
    /**
     * metodo set para las operaciones
     */
    public void setOperations(List<Operation> operations) {
        this.operations = operations;
    }
    
}
