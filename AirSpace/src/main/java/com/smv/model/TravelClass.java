package com.smv.model;

public class TravelClass {
	
	private Long id;
	private int rows;
	private int columns;

	public TravelClass(){

	}

	public TravelClass(Long id, int rows, int columns) {
		this.id = id;
		this.rows = rows;
		this.columns = columns;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}
}
