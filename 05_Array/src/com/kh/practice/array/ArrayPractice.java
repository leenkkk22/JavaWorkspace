package com.kh.practice.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		int [] arr = new int[10];
		
			
			
			for(int i = arr.length -1 ; i>=1; i--) {
				System.out.print(i+" ");
			 arr[i] = i+1;
			}
			
			
			
			
			
	
	}
	
	public void practice2() {
		System.out.println("양의 정수: ");
		int num = sc.nextInt();
		
		int [] arr = new int[num];
		
		for(int i = 0; i<arr.length ; i++) {
			arr[i] = i+1;
		}
		System.out.println(Arrays.toString(arr));
	}
	
	
	public void practice3() {
		int [] arr = new int[10];
		
		for(int i = 0; i<10; i++) {
			int random = (int)(Math.random() * 10 + 1);
			arr[i] = random;
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public void practice4() {
		System.out.println("0 ~ 6 사이 숫자 입력");
		int num = sc.nextInt();
		
		
		
		String [] day = {"월요일", "화요일","수요일","목요일","금요일","토요일","일요일"};
		/*
		 * if(!(num >= 0 && num <= 6)) {
		 * sysout " 잘못 입력"
		 * return;
		 * }
		 */
		switch(num) {
		case 0 : 
			System.out.println(day[0]);
			break;
		case 1 :
			System.out.println(day[1]);
			break;
		case 2 :
			System.out.println(day[2]);
		case 3 : 
			System.out.println(day[3]);
			break;
		case 4 :
			System.out.println(day[4]);
			break;
		case 5 :
			System.out.println(day[5]);
		case 6 :
			System.out.println(day[6]);
		default : 
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	public void practice5() {
		System.out.println("정수: ");
		int num = sc.nextInt();
		int sum = 0;
		int [] arr = new int[num];
			for(int i = 0; i<arr.length ; i++) {
				System.out.println("배열 "+i+"번째 인덱스에 넣을 값: ");
				int idx = sc.nextInt();
				
				arr[i] = idx;
				sum += idx;
			}
			for (int i = 0; i<num; i++) {
				System.out.print(arr[i]+" ");
				
			}
			
			System.out.println("\n총 합 : " + sum);

			}
	
	
	public void practice6() {
		System.out.println("문자열: ");
		String str = sc.next();
		
		char[] arr = str.toCharArray();
		int count = 0;
		//전체 문자 반복
		for(int i=0; i<arr.length; i++) {
			char ch = arr[i]; // 중복인지 검사하고자 하는 문자
			boolean isDup = false;
			//문자 중복 검사
			//현재 위치에서 앞쪽의 단어들 중 현재단어와 일치하는 값이 있는지 확인
			for(int j = 0; j<i; j++) {
				if(ch == arr[j]) {
					//중복
					isDup = true;
					break;
				}
			}
			if(!isDup) {
				System.out.print(ch+", ");
				count++;
		}
		}
		System.out.println("\n문자 개수: "+ count);
		
		/*System.out.println("문자열: "); //내가 짜던 코드
		String str = sc.next();
	
		char[] arr = str.toCharArray();
				
		for(int i=0; i<arr.length; i++) {
			 arr[i] = str.charAt(i); 
			 
				
			
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("문자 개수: "+arr.length);
	
		*/
		}
	
	
	public void practice7() {
		System.out.println("문자열: ");
		String str = sc.next();
		
		char[] arr = str.toCharArray();
		
		System.out.println("문자: ");
		char word = sc.next().charAt(0);
		
		int same = 0;
		
		System.out.println(arr);
		System.out.println();
		for(int i=0; i<arr.length; i++) {
			 char ch  = arr[i]; // 중복인지 검사하고자 하는 문자
			 boolean isDup = false;
				//문자 중복 검사
				//현재 위치에서 앞쪽의 단어들 중 현재단어와 일치하는 값이 있는지 확인
				for(int j = 0; j<i; j++) {
					if(word == arr[j] ) {
						//중복
						 isDup = true;
						 break;
						
					}
				}
				
				if(isDup) {
					same += 1;
					
				}
		
		
		
		}
		System.out.println(word + " 개수: " + same);
	}
	
	
	public void practice8() {
		System.out.println("주민등록번호(-포함): ");
		String id = sc.next();
		
		char[] arr = id.toCharArray();
		
		char [] copy = Arrays.copyOf(arr, 14);
		
		for(int i = 8; i<copy.length; i++) {
			copy[i] = '*';
		}
			System.out.println(copy);
		
	}
	
	public void practice9() {
		
		int [] num = new int [10];
		
		for(int i = 0; i<num.length; i++) {
		int random = (int)(Math.random() * 10 + 1);
		num[i] = random;
		System.out.print(num[i]+ " ");
		
		}System.out.println();
		int big = 0;
		int small = 0;
		
		for(int i = 0; i<num.length; i++) {
			int a = num[i];
			boolean isbig = false;
			for(int j = 0; j<i; j++) {
				if (a < num[j]) {
					isbig = true;
					break;
				}
			}
			if(!isbig) {
				big = num[i];
			}
		}
		System.out.println("최대값: "+big);
		
		for(int i = 0; i<num.length; i++) {
			int b = num[i];
			boolean isbig = false;
			for(int j = 0; j<i; j++) {
				if (b > num[j]) {
					isbig = true;
					break;
				}
			}
			if(!isbig) {
				small = num[i];
			}
		
		}
		System.out.println("최소값: "+small);
		
		
		
		
		
	}
	
	
	public void practice10() {
		
		int [] num = new int [10];
		
		for(int i = 0; i<num.length; i++) {
		int random = (int)(Math.random() * 10 + 1);
		num[i] = random;
		System.out.print(num[i]);
		}
		System.out.println();
		
		for(int i = 0; i<num.length; i++) {
			int same = (int)(Math.random() * 10 + 1);
			for(int j = 0; j<i; j++) {
				if(!(num[i] == same)) 
				num[i] = same;
			}
			System.out.print(num[i]+ " ");
		}
		
		
		
		
		
	}
	
	
}
		

		
		

			
			

		
		

	
	
	
		
	
	

