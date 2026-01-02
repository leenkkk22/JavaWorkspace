package com.kh.Chap04.field.model.vo;

public class FieldTest1 {
	/*
	 * 필드 == 인스턴스 변수 == 멤버 변수
	 * 
	 * 변수 구분
	 * - 전역변수 : 클래스 영역 바로 아래에 선언하는 변수
	 * 			클래스 내부라면 어디서든 사용 가능
	 * - 지역변수 : 클래스 영역 내에서 특정 영역({})에 선언한 변수를 의미.
	 * 			메서드/if/for 등 선언한 영역 안에서만 사용이 가능
	 * 
	 * 1. 전역변수 
	 *  - 필드 == 인스턴스 변수 == 멤버 변수
	 *    생성시점 : 객체가 메모리에 할당되면서 생성된다. (Heap)
	 *    소멸시점 : 객체가 소멸할 때 함께 소멸.
	 *    
	 *  - 클래스 변수 == static 변수
	 *    생성시점 : 프로그램 시작과 동시에 static 영역에 메모리 할당(Static)
	 *    소멸시점 : 프로그램 종료
	 * 2. 지역변수
	 *    생성시점 : 특정 영역({})이 실행될 때 저장 공간이 할당(Stack)
	 *    소멸시점 : 특정 영역의 실행이 종료될 때
	 *    
	 * 
	 * */
	
	//public static int age; // 클래스 변수
	private int global; //전역변수 (필드)
	{
		//초기화 블럭
		//객체 생성시 최초 1회 실행
		global = 50;
	}
	
	public static int num;
	//static 초기화 블럭
	static {
		//static 변수를 초기화 하는데 사용한다.
		num = 55;
		
	}
	public void test(int num) /*매개변수*/ { 
		int local =0;// 지역변수
		
		if(true) {
			int a = 0; //지역변수
		}
		
		System.out.println(global); // 전역변수는 Heap 메모리 사용, 이 공간은 비어있을 수 없어서
									// JVM 자료형의 기본값으로 자동 초기화 되어있다.
		//메서드 호출을 위해선 "반드시" 매개변수를 전달해야 하므로 값의 초기화는 보장된 것
		
		System.out.println(local); // 지역변수 초기화 필요
		System.out.println(num);
		// System.out.println(a); 지역변수 영역(if문) 밖에서 호출 불가능
		
		
		FieldTest2 ft2 = new FieldTest2();
		System.out.println(ft2.pub);
		System.out.println(ft2.pro);
		System.out.println(ft2.dff);
		// 접근 불가 !! System.out.println(ft2.pri); 접근 불가 !!
	}
	

}
