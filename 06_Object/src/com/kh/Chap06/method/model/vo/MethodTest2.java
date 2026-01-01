package com.kh.Chap06.method.model.vo;

public class MethodTest2 {
	/*
	 * static 메서드
	 * [표현법]
	 * 접근제한자 static 예약어 반환형 메서드명(매개변수) {
	 *  코드
	 *  return ;
	 * }
	 *  - 메서드 호출 시 객체를 생성할 필요가 없다.
	 *  - 프로그램 시작 시 정적 메모리 영역에 메서드 정보가 저장되어 있기 때문이다.
	 *  - 클래스명.메서드명(전달값); 으로 호출하면 된다.
	 * */
	static int count = 1;
	int count2 = 2;
	
	public static int method(int num1) {
		
		/*
		 * static 메서드 안에서는 일반 field는 접근이 불가능하다.
		 * - 변수의 생성시점이 다르기 때문이다
		 * - static 메서드는 프로그램 시작과 동시에 정적 메모리 영역에 할당
		 *   같은 시점에 static변수도 함께 할당 되기 때문에 static변수는 사용 가능
		 *   - 하지만 일반 전역 변수는 객체 생성 시점에 메모리에 할당되기 때문에 static 
		 *     메서드에서 사용 불가능
		 * */
		
		//매개변수 * static 변수(문제없음)
		return num1 * count;
		
		
		//return num1 * count2;
	}
}
