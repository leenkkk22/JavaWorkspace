package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;

public class TriangleController {
	//멤버 변수 
	private Shape s = new Shape();
	
	public double calcArea(double height, double width) {
		s.setHeight(height); //매개변수로 넘어온 값(height)를 생성자에서 호출한 거임 
		s.setWidth(width);
		//s = new Shape(3,height, width) 더 짧게 호출하기
		
		//height = s.getHeight(); 이렇게 작성하면 안 됨
		//width = s.getWidth();
		
		return (width * height) /2;
	}
	
	public void paintColor(String color) {
		s.setColor(color);
	}
	
	public String print() {
		return "삼각형" + s.information();
		
	}

}
