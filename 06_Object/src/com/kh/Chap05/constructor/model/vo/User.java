package com.kh.Chap05.constructor.model.vo;

public class User {
	//필드부
	private String userId;
	private int age;
	private char gender;
	
	//생성자부
	/*
	 * 생성자
	 * [표현법]
	 * public 클래스명(매개변수/생략가능/){
	 * 		//생성자를 통해 객체 생성 시 실행할 코드
	 * }
	 * 
	 * 생성자를 작성하는 목적
	 * 1. 객체를 생성해주기 위함
	 * 2. 객체생성과 동시에 매개변수로 전달된 값을 통해 필드를 초기화할 목적으로 사용
	 * 
	 * 생성자 작성 시 주의사항
	 * 1. 클래스 명과 동일한 이름(대/소문자 포함)
	 * 2. 반환형이 존재하지 않는다.
	 * 3. 여러개 생성이 가능하지만 매개변수가 중복되면 안 된다.(메서드 오버로딩과 동일한 개념)
	 * 4. 매개변수 생성자를 명시적으로 작성하게 되면, 기본 생성자를 JVM이 만들어주지 않는다. ******
	 * */
	
	//기본 생성자
	// - 생성자 미작성이 JVM이 자동으로 만들어주는 생성자
	// - 되도록 항상 기본생성자를 추가하는 습관을 가질 것 
	public User() {
		//매개변수가 없는 생성자 = 기본 생성자
		//System.out.println("기본생성자 호출");
	}
	
	//매개변수 있는 생성자
	//  - 전달 받은 매개변수를 통해 필드를 초기화할 목적으로 사용하는 생성자
	public User(String userId) {
		this.userId = userId;
	}
	
	//매개변수 있는 생성자2 (자료형 중복이 일어나지 않게)
	public User(String userId, int age, char gender) {
		// 다른 생성자에서 동일한 필드값을 초기화하는 경우
		// 현재 생성자에서 다른 생성자를 호출하는 방식으로 코드 줄이기
		
		this(userId); //= this.userId = userId; (반드시 첫줄에만 기술)
  //		this(); //this 생성자 호출 (기본 생성자)
		//this.userId = userId;
		this.age = age;
		this.gender = gender;
	}
	//메서드부
	//set/get 메서드 생성
	
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getUserId() {
		return userId;
	}
	
	public void setUserAge(int age) {
		this.age = age;
	}
	
	public int getUserAge() {
		return age;
	}
	
	public void setUserGender(char gender) {
		this.gender = gender;
	}
	
	public char getUserGender() {
		return gender;
	}

}
