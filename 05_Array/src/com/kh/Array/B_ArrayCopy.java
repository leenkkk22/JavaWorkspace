package com.kh.Array;

import java.util.Arrays;

public class B_ArrayCopy {
	/*
	 * 배열복사
	 * - 얕은 복사: 배열의 주소값만을 복사.
	 * - 깊은 복사: 동일한 새로운 배열을 하나 생성하여 내부의 값들까지 복사
	 * */	
	
	public void method1() {
		//원본 배열
		int [] origin = {1,2,3,4,5};
		
		System.out.println("원본 배열 출력 ");
		for(int i = 0; i<origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		
		//얕은 복사 - 많이 써먹는 기능
		int [] copy = origin;
		System.out.println("\n 복사 배열 출력");
		for(int i = 0; i< copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		//copy 배열 수정
		copy[2] = 99;
		
		
		System.out.println("\n복사 배열 수정 후 출력");
		for(int i = 0; i< copy.length; i++) {
			System.out.print(copy[i] + " ");
		}
		
		System.out.println("\n원본 배열 수정 후  출력 ");
		for(int i = 0; i<origin.length; i++) {
			System.out.print(origin[i] + " ");
		}
		
	}
	// 깊은 복사를 수행하는 4가지 방법
	public void method2() {
		// 1. for문을 활용한 복사
		// - 새로운 배열을 생성 한 후 각 인덱스 별로 내부값을 일일히 대입.
		
		int [] origin = {1,2,3,4,5};
		
		int [] copy = new int[origin.length];
		// copy0 = origin[0]
		
		for(int i = 0; i<origin.length; i++) {
			copy[i] = origin[i];
		}
		//copy 배열 수정
				copy[2] = 99;
				
				
				System.out.println("\n복사 배열 수정 후 출력");
				for(int i = 0; i< copy.length; i++) {
					System.out.print(copy[i] + " ");
				}
				
				System.out.println("\n원본 배열 수정 후  출력 ");
				for(int i = 0; i<origin.length; i++) {
					System.out.print(origin[i] + " ");
				}
		
		
		
		
	}
	
	public void method3() {
		//2. 새로운 배열 생성 후 System 클래스의 arraycopy를 이용한 복사(가장 성능이 좋음)
		
		int [] origin = {1,2,3,4,5};
		int [] copy = new int [10];
		
		//System.arraycopy(원본배열, 원본배열의 복사를 시작할 인덱스, 복사본 배열,
		//				   복사본 배열의 복사를 시작할 인덱스, 복사할 갯수)
		
		// 1번. 0 0 1 2 3 4 5 0 0 0
		// 2번. 0 1 2 3 0 0 0 0 0 0
		// 3번. 0 3 4 5 0 0 0 0 0 0 
		
		
		// 1번. System.arraycopy(origin, 0, copy, 2, 5);
		// 2번. System.arraycopy(origin, 0, copy, 1, 3);
		// 3번. System.arraycopy(origin, 2, copy, 1, 3);
		System.out.println(Arrays.toString(copy));
	}
	
	public void method4() {
		// 3. Arrays 클래스의 copyOf 메소드 사용(arraycopy와 성능 비슷)
		
		
		int [] origin = {1,2,3,4,5};
		
		// Arrays.copyOf(원본배열명, 복사할 갯수)
		int [] copy = Arrays.copyOf(origin, 10); // 복사할 갯수 = 복사할 배열의 크기.
				System.out.println(Arrays.toString(copy));
	}
	
	public void method5() {
		// 4. clone 메서드를 사용한 복사
		int [] origin = {1,2,3,4,5};
		
		int [] copy = origin.clone();
		System.out.println(Arrays.toString(copy));
		// 원본 배열과 정확히 똑같은 배열을 깊은 복사
	}
	
	/*
	 * 완전히 같은 값을 쓸 것이라면 clone
	 * 다른 값을 사용 할 수 있다면 arraycopy나 Arrays.copyOf 활용
	 */

}
