package com.kh.hw.shape.view;

import java.util.Scanner;

import com.kh.hw.shape.controller.SquareController;
import com.kh.hw.shape.controller.TriangleController;

public class ShapeMenu {
	//선생님이 만드신 코드
	
	
	//내가 만든 코드
	Scanner sc = new Scanner(System.in);

	private SquareController scr = new SquareController();
	private TriangleController tc = new TriangleController();
	public String color = "";

	public void inputMenu() {
		while (true) {
			System.out.println("===== 도형 프로그램 =====");
			System.out.println("3. 삼각형");
			System.out.println("4. 사각형");
			System.out.println("9. 프로그램 종료");
			System.out.println("메뉴 번호: ");
			int sel = sc.nextInt();

			switch (sel) {
			case 3:
				triangleMenu();
				break;
			case 4:
				squareMenu();
				break;
			case 9:
				System.out.println("프로그램 종료");
				return;
			default:
				System.out.println("잘못된 입력입니다. 다시 입력해주세요");
//				inputMenu();
//				return;
			}
			System.out.println();
		}

	}

	public void triangleMenu() {
		System.out.println("===== 삼각형 =====");
		System.out.println("1. 삼각형 면적");
		System.out.println("2. 삼각형 색칠");
		System.out.println("3. 삼각형 정보");
		System.out.println("9. 메인으로");
		System.out.println("메뉴 번호: ");
		int sel = sc.nextInt();

		switch (sel) {
		case 1:
			inputSize(1, 1);
			break;
		case 2:
			inputSize(1, 2);
			break;
		case 3:
			printInformation(1);
			break;
		case 9:
			System.out.println("메인화면으로 돌아갑니다.");
			inputMenu();
			return;
		default:
			System.out.println("잘못된 입력입니다. 다시 입력해주세요");
			triangleMenu();
			return;
		}
	}

	public void squareMenu() {
		System.out.println("===== 사각형 =====");
		System.out.println("1. 사각형 둘레");
		System.out.println("2. 사각형 면적");
		System.out.println("3. 사각형 색칠");
		System.out.println("4. 사각형 정보");
		System.out.println("9. 메인으로");
		System.out.println("메뉴 번호: ");
		int sel = sc.nextInt();

		switch (sel) {
		case 1:
			inputSize(2, 1);
			return;
		case 2:
			inputSize(2, 2);
			return;
		case 3:
			inputSize(2, 3);
			return;
		case 4:
			printInformation(2);
			return;
		case 9:
			System.out.println("메인화면으로 돌아갑니다.");
			inputMenu();
			return;
		default:
			System.out.println("잘못된 입력입니다. 다시 입력해주세요");
			squareMenu();
			return;
		}
	}

	public void inputSize(int type, int menuNum) {
		if (type == 1 && menuNum == 1) {
			System.out.print("높이: ");
			double num1 = sc.nextDouble();

			System.out.print("너비: ");
			double num2 = sc.nextDouble();

			System.out.print("삼각형 면적: " + tc.calcArea(num1, num2));
		} else if (type == 1 && menuNum == 2) {
			System.out.println("색깔을 입력하세요: ");
			String color = sc.next();
			
			tc.paintColor(color);
			System.out.println("색이 수정되었습니다");

		} else if (type == 2 && menuNum == 1) {
			System.out.print("높이: ");
			double num1 = sc.nextDouble();
			
			
			System.out.print("너비: ");
			double num2 = sc.nextDouble();

			System.out.print("사각형 둘레: " + scr.calcPerimeter(num1, num2));

		} else if (type == 2 && menuNum == 2) {
			System.out.print("높이: ");
			double num1 = sc.nextDouble();
			
			
			System.out.print("너비: ");
			double num2 = sc.nextDouble();

			System.out.print("사각형 면적: " + scr.calcArea(num1, num2));

		} else if (type == 2 && menuNum == 3) { //else로 작성해도 되는 코드였음
			System.out.println("색깔을 입력하세요:");
			String color = sc.next();
			scr.paintColor(color);
			System.out.println("색이 수정되었습니다.");
		}
	}

	public void printInformation(int type) {
		if (type == 1) {
			System.out.println(tc.print());
		} else if (type == 2) {
			System.out.println(scr.print());
		}

	}
}
