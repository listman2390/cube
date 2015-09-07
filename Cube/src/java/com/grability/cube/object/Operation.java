/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grability.cube.object;

import java.util.List;

/**
 * Clase que representa una opereacion
 * 
 * @author listman
 */
public class Operation {
	/**
	 * Tipos de opereciones permitidas
	 */
	public static final String OPERATION_UPDATE = "UPDATE";
	public static final String OPERATION_QUERY = "QUERY";
	/**
	 * tipo de operacion por defecto se toma UPDATE o QUERY
	 */
	private String type;
	/**
	 * Lista de Puntos con las que se realiza la operacion
	 */
	private List<Point> data;

	/**
	 * metodo get para el tipo de operacion
	 */
	public String getType() {
		return type;
	}

	/**
	 * metodo set para el tipo de operacion
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * metodo get para los datos de la operacion
	 */
	public List<Point> getData() {
		return data;
	}

	/**
	 * metodo set para los datos de la operacion
	 */

	public void setData(List<Point> data) {
		this.data = data;
	}

}
