package com.kh.hw.shape.model.vo;

public class Shape {
	//선생님이 만드신 코드
	/*
	private int type;
	private double height;
	private double width;
	private String color = "white";
	
	public Shape() {
		//기본 생성자
	}
	
	public Shape(int type, double height, double width) {
		this.type = type;
		this.height = height;
		this.width = width;
	}
	
	public String information() { //객체의 정보를 문자열로 만들어서 반환하는 메소드
		return type+", " + height +", " +width+", "+color;
	}
	/*
	 * setter와 getter는 생략
	 * */
	
	//내가 만든 코드 
	private int type;
	private double height;
	private double width;
	private String color = "white";
	
	
	public Shape() {
		//기본 생성자
	}
	
	public Shape(int type, double height, double width) {
		
	}
	
	public String information() {
		String info =  "높이는 " +height+", " +"넓이는 "+ width+", " +"색깔은 "+ color+"입니다.";
		return info;
	}
	
	//setter getter
	
	public void setType(int type) {
		this.type = type;
	}
	
	public int getType() {
		return type;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	
	
	

}
