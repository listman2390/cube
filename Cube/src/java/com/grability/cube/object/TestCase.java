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
@Entity
public class TestCase {
    private int matrixLength;
    private List<Operation> operations;

    public int getMatrixLength() {
        return matrixLength;
    }

    public void setMatrixLength(int matrixLength) {
        this.matrixLength = matrixLength;
    }

    public List<Operation> getOperations() {
        return operations;
    }

    public void setOperations(List<Operation> operations) {
        this.operations = operations;
    }
    
}
