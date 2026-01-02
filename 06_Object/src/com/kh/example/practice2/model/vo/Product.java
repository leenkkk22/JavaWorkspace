package com.kh.example.practice2.model.vo;

public class Product {
	private String pName; //접근제한자 + 반환자 + 필드명
	private int price; //접근제한자 + 반환자 + 필드명
	private String brand; //접근제한자 + 반환자 + 필드명
	
	//기본생성자, 메서드 아닙니다(반환형x)
	public Product() {
		
	}
	
	//메서드
	public void information() {
		System.out.println(pName + ", "+price + ", " +brand);
	}
	
	

}
