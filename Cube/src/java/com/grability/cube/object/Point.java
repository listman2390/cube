/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grability.cube.object;

/**
 *
 * @author listman
 */
public class Point {
    private int x;
    private int y;
    private int z;
    private int v;

    public Point() {
    }

    public Point(int x, int y, int z, int v) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.v = v;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x-1;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y-1;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z-1;
    }

    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }
    
}
