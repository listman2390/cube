/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grability.cube.object;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author listman
 */
public class Cube {

    private static Point[][][] index;
    private final List<Point> points;
    public Cube(int length) {
        index = new Point[length][length][length];
        points=new ArrayList<>();
    }
    public void add(Point point){
        index[point.getX()][point.getY()][point.getZ()]=point;
        points.add(point);
    }
    public List<Point> getPoints(){
        return points;
    }
    public void setValue(int x,int y, int z,int v){
        Point p=index[x][y][z];
        if(p==null){
            p=new Point(x, y, z, v);
            index[x][y][z]=p;
            points.add(p);
        }else{
            p.setV(v);
        }
    }
}
