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
	/**
	 * coordenada x en el cubo
	 */
	private int x;
	/**
	 * cooredenada y en el cubo
	 */
	private int y;
	/**
	 * coordena da z en el cubo
	 */
	private int z;
	/**
	 * valor de la posicion
	 */
	private int v;

	/**
	 * constructor sin argumentos
	 */
	public Point() {
	}

	/**
	 * constructor con datos del punto
	 */
	public Point(int x, int y, int z, int v) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.v = v;
	}

	/**
	 * metodo get de la coordenada x
	 */
	public int getX() {
		return x;
	}

	/**
	 * metodo set de la coordena x 
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * metodo get de la coordenada y
	 */
	public int getY() {
		return y;
	}

	/**
	 * metodo set de la coordena y 
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * metodo get de la cooredena z
	 */
	public int getZ() {
		return z;
	}

	/**
	 * metodo set de la coordena z 
	 */
	public void setZ(int z) {
		this.z = z;
	}

	/**
	 * metodo get del valor del  punto
	 */
	public int getV() {
		return v;
	}

	/**
	 * metodo set del valor del punto
	 */
	public void setV(int v) {
		this.v = v;
	}

}
