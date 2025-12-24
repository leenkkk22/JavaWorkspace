package com.kh.chap01.condition;

import java.util.Scanner;

public class B_Switch {
	Scanner sc = new Scanner(System.in);
	/*
	 * switch문과 if문의 차이점
	 * if(조건식) => 조건식을 복잡하게 기술할 수 있음.
	 * switch문은 조건식이 없으며, 확실한 값의 변수만 기술함.
	 * 
	 * [표현법]
	 * switch(동등비교 수행대상) {
	 * case 값1 : 실행할 코드;
	 * 			 break;
	 * case 값2 : 실행할 코드;
	 * 			 break;
	 * 
	 * ...
	 * default : 실행할 코드;
	 * 
	 * switch 문의 장점
	 * - case 문을 통해 내가 실행하길 원하는 코드로 프리패스해서 if~else문보다 훨씬 빠르다.
	 * 
	 * switch문
	 * - 자주 사용되지는 않지만, 정밀한 연산결과가 "동일한 속도"로 수행되어야 하는 경우 사용한다.
	 * - ex) 키보드 입력, 마우스 입력
	 */
	
	
	public void method1() {
		/*
		 * 1 ~ 3 사이의 정수값을 입력받아
		 * 1인 경우 빨간불
		 * 2인 경우 파란불
		 * 3인 경우 초록불
		 * 모두 아닌 경우 잘못 입력 했습니다를 출력한다
		 */
		
		System.out.print("1 ~ 3 사이의 정수 입력 : ");
		int num = sc.nextInt();
		
		/*
		if(num ==1) {
			System.out.println("빨간불");
		}else if(num == 2) {
			System.out.println("파란불");
		}else if(num == 3) {
			System.out.println("초록불");
		}else {
			System.out.println("잘못 입력했습니다.");
		}
		*/
		
		switch(num) {
		case 1 :
			System.out.println("빨간불");
			break;
		case 2 :
			System.out.println("파란불");
			break;
		case 3 :
			System.out.println("초록불");
			break;
		default :
			System.out.println("잘못 입력했습니다");
		}
	}
	
	public void method2() {
		// 사용자에게 구매할 과일명을 입력받아
		// 각 과일 마다의 가격을 출력합니다.
		// 사과 (5000), 바나나(8000), 황도(12000)
		
		System.out.println("KH 과일가게");
		System.out.println("구매할 과일(사과, 바나나, 황도): ");
		String fruit = sc.next();
		
		int price = 0;
		
		switch (fruit) { //switch문은 "==" 동등성 비교가 아닌 ".equals" 동일성 비교
		case "사과" :
			price = 5000;
			break;
		case "망고" :	case "바나나" : //break문이 필요없는 경우
			price = 8000;
			break;
		case "황도" :
			price = 12000;
			break;
		default :
			System.out.println("과일을 제대로 입력하지 않았습니다.");
		}
		System.out.println(fruit + "의 가격은" + price + "입니다.");
				
	}
	
	

}
