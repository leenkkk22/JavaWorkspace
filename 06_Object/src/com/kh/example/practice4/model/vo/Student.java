package com.kh.example.practice4.model.vo;

public class Student {
	private static int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	static {
		grade =4;
		
	}
	
	{
		classroom = 3;
		name = "이인호";
		height = 180;
		gender = 'm';
	}
	
	
	public Student() {
	}
	
	public void information() {
		System.out.println(grade +"학년 "+ classroom +"반 이름:"+ name + " 키:"
						   +height +" 성별:"+ gender);
	}
	
	/*
	private static int grade;{
		grade = 4;
	}
	private int classroom;{
		classroom = 15;
	}
	private String name;{
		name = "홍길동";
	}
	private double height;{
		height = 190;
	}
	private char gender;{
		gender = 'M';
	}
	
	public Student() {
		
	}
	
	public void information() {
		System.out.println(grade +"학년 "+ classroom +"반 이름:"+ name + " 키:"
						   +height +" 성별:"+ gender);
		
	}
*/
}
