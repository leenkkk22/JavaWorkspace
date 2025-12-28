package com.kh.practice.comp.func;

import java.util.Scanner;

public class UpAndDown {
	Scanner sc = new Scanner(System.in);
	public void upDown() {
		int random = (int)(Math.random() * 100 + 1);
		int fail = 0;
		System.out.println(random);
		int num = 0;
		
		while (!(random == num)) {
			System.out.println("1~100 사이의 임의의 난수를 맞춰보세요 : ");
			num = sc.nextInt();
			if(num < 1 || num > 100) {
				System.out.println("1~100 사이의 숫자를 입력해주세요.");
				continue;
			}
			
			if(num < random) System.out.println("UP !");
			else if (num > random) System.out.println("DOWN !");
			
			fail += 1;
		}
		System.out.println("정답입니다 !!");
		System.out.println(fail +"회 만에 맞추셨습니다.");
		} 
		
		
	}




