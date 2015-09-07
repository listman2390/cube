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
	 * metodo set de la coordena x por defaul se le resta uno ya que la vista
	 * esta trabajanco coon matriz con rango de [1,N]
	 */
	public void setX(int x) {
		this.x = x - 1;
	}

	/**
	 * metodo get de la coordenada y
	 */
	public int getY() {
		return y;
	}

	/**
	 * metodo set de la coordena y por defaul se le resta uno ya que la vista
	 * esta trabajanco coon matriz con rango de [1,N]
	 */
	public void setY(int y) {
		this.y = y - 1;
	}

	/**
	 * metodo get de la cooredena z
	 */
	public int getZ() {
		return z;
	}

	/**
	 * metodo set de la coordena z por defaul se le resta uno ya que la
	 * vista esta trabajanco coon matriz con rango de [1,N]
	 */
	public void setZ(int z) {
		this.z = z - 1;
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
