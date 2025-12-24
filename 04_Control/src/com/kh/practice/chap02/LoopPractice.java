package com.kh.practice.chap02;

import java.util.Scanner;

public class LoopPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice7() {
		
		while(true) {
		System.out.print("연산자 : ");
		String str = sc.next();
		char op = str.charAt(0);
		
		if(str.equals("exit")) {
			System.out.println("프로그램을 종료합니다.");
			break;
		}
		
		System.out.println("정수1: ");
		int num1 = sc.nextInt();
		
		System.out.println("정수2: ");
		int num2 = sc.nextInt();
		
		if (num2 == 0 && (op == '/' || op == '%')) {
			System.out.println("0으로 나눌 수 없습니다.");
			continue;
		}
		
		switch (op) {
		case '+' : 
				   System.out.println(num1 + op + num2 + "=" + (num1+num2));
			break;
		case '-' : 
				   System.out.println(num1 + op + num2 + "=" + (num1 - num2));
			break;
		case '*' : 
				   System.out.println(num1 + op + num2 + "=" + (num1 * num2));
			break;
		case '/' : 
		   		   System.out.println(num1 + op + num2 + "=" + (num1 / num2));
			break;
		case '%' : 
			       System.out.println(num1 + op + num2 + "=" + (num1 % num2));
			break;
		default	 : System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다."); 
		
			}
		
		}
	}
	
	
	public void practice8() {
		//*
		//**
		//***
		//****
		System.out.println("정수 입력: ");
		int num = sc.nextInt();
		for(int i = 1; i<num+1; i++) {
			for(int j = 0; j<i; j++) {
				System.out.print("*");
			}System.out.println();
		}
	}
	
	public void practice9() {
		System.out.println("정수 입력: ");
		int num = sc.nextInt();
		
		
		
	}
	
	public void practice10() {
		System.out.println("숫자: ");
		int num = sc.nextInt();
		
		if(num < 2 ) {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		boolean isPrime = true;
		//소수는 1부터 n까지 나누었을 때 나누어 떨어지는 수가 1과 n뿐인 수
		// 100 % 10 == 0
		for(int i = 2; i < num; i++)
			if(num % i == 0) {
				System.out.println("소수 아니다");
				isPrime = false;
				break;
			}
		
		if(isPrime) {
			System.out.println("소수입니다");
		}
		
			
	}
	
	public void practice11() {
		System.out.println("숫자: ");
		int num = sc.nextInt();
		
		if(num < 2 ) {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		
		// 외부 반복문: 2~내가 입력한 값까지 반복.
		// 내부 반복문: 혀냊 값이 소수인지 아닌지 판단
		
		//num = 5;
		
		int count = 0;
		// i -> 2,3,4,5
		for(int i = 2; i<=num; i++) {
			boolean isPrime = true;
			for(int j = 2; j<i-1; j++) {
				if(i % j == 0) {
					isPrime = false;
					break;
					
				}
			}
			if(isPrime) {
				count++;
				
				System.out.print(i +" "); //소수인경우
			}
		}
		
		System.out.println("\n2부터 "+num+"까지 소수의 개수는 " +count+"개 입니다.");
			
	}
	
	public void practice12() {
		System.out.println("자연수 하나를 입력하세요.");
		int num = sc.nextInt();
		
		int count = 0;
		for(int i = 1; i <= num; i++) {
			//2 혹은 3의 배수이면 출력
			if(i % 2 == 0 || i % 3 == 0) {
				System.out.println(i + " ");
			}
			//2와 3의 공배수이면 갯수 카운팅
			if(i % 2 == 0 && i % 3 == 0) {
				count++;
			}
			}
		System.out.println("\n count: " + count);
		}
	}




