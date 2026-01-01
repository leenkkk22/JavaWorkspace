package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;


public class SquareController {
	//선생님이 만드신 코드
	/*
private Shape s = new Shape();
	
	
	public double calcPerimeter(double height, double width) {
		

	}

	public double calcArea(double height, double width) {
		
		
		return width * height;
	}

	public void paintColor(String color) {
		
		
	}

	public String print() {
		

	}
	*/
	//내가 만든 코드
	private Shape s = new Shape();
	
	
	public double calcPerimeter(double height, double width) {
		s.setHeight(height);
		s.setWidth(width);
		
		return (height * height) + (width * width);

	}

	public double calcArea(double height, double width) {
		s.setHeight(height);
		s.setWidth(width);
		
		return width * height;
	}

	public void paintColor(String color) {
		s.setColor(color);
		
	}

	public String print() {
		return "사각형" + s.information();

	}

}
