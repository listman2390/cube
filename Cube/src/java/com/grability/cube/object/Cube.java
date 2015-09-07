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
	/**
	 * campo que sirve para indexar  y agiliazar la busqueda de datos
	 */
    private static Point[][][] index;
    /**
     * campo que perimte solo mantener los objetos que son creados y simular un carga lazy
     */
    private final List<Point> points;
    /**
     * Constructor de la clase encarga de inicializar el indexador y la lista lazy
     */
    public Cube(int length) {
        index = new Point[length][length][length];
        points=new ArrayList<>();
    }
    /**
     * metodo encargado de registrar un punto con un valor 
     */
    public void add(Point point){
        index[point.getX()][point.getY()][point.getZ()]=point;
        points.add(point);
    }
    /**
     * metodo que devuelve la representacion lineal del cubo
     */
    public List<Point> getPoints(){
        return points;
    }
    /**
     * metodo encagado se cargar un valor al cubo
     */
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
