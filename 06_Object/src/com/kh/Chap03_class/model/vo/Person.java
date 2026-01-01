package com.kh.Chap03_class.model.vo;

public class Person {
	
	//필드부
	private String id;
	private String pwd;
	private String name;
	private String age;
	private char gender;
	private String phone;
	private String email;
	

	//메서드부
	public void changeName(String name) {
		this.name = name;
	}
	
	public void printName() {
		System.out.println(this.name);
	}
}
