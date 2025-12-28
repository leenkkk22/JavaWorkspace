package com.kh.practice.comp.func;

import java.util.Scanner;

public class RockPaperScissors {
	Scanner sc = new Scanner(System.in);

	public void rps() {
		System.out.println("당신의 이름을 입력해주세요: ");
		String name = sc.next();
		System.out.print(name);
		System.out.println();

		System.out.println("가위바위보: ");
		String att = sc.next();

		int match = 0, win = 0, draw = 0, lose = 0;
		
		while (!att.equals("exit")) {
			String comAtt = "";
			int rd = (int) (Math.random() * 3 + 1);
			switch (rd) {
			case 1:
				comAtt = "가위";
				break;
			case 2:
				comAtt = "바위";
				break;
			case 3:
				comAtt = "보";
				break;
			}

			
			switch (att) {
			case "가위":
				if (comAtt.equals("가위")) {
					System.out.println("컴퓨터 :" + comAtt);
					System.out.println(name + ": " + "가위");
					System.out.println("비겼습니다.");
					draw += 1;
				} else if (comAtt.equals("바위")) {
					System.out.println("컴퓨터 :" + comAtt);
					System.out.println(name + ": " + "가");
					System.out.println("졌습니다 ㅠㅠ");
					lose += 1;
				} else {
					System.out.println("컴퓨터 :" + comAtt);
					System.out.println(name + ": " + "가위");
					System.out.println("이겼습니다 ! ");
					win += 1;
				}break;
			case "바위":
				if (comAtt.equals("가위")) {
					System.out.println("컴퓨터 :" + comAtt);
					System.out.println(name + ": " + "바위");
					System.out.println("이겼습니다 !");
					win += 1;
				} else if (comAtt.equals("바위")) {
					System.out.println("컴퓨터 :" + comAtt);
					System.out.println(name + ": " + "바위");
					System.out.println("비겼습니다.");
					draw += 1;

				} else {
					System.out.println("컴퓨터 :" + comAtt);
					System.out.println(name + ": " + "바위");
					System.out.println("졌습니다 ㅠㅠ");
					lose += 1;
				}
				break;
			case "보":
				if (comAtt.equals("가위")) {
					System.out.println("컴퓨터 :" + comAtt);
					System.out.println(name + ": " + "보");
					System.out.println("졌습니다 ㅠㅠ");
					lose += 1;
				} else if (comAtt.equals("바위")) {
					System.out.println("컴퓨터 :" + comAtt);
					System.out.println(name + ": " + "보");
					System.out.println("이겼습니다 !");
					win += 1;
				} else {
					System.out.println("컴퓨터 :" + comAtt);
					System.out.println(name + ": " + "보");
					System.out.println("비겼습니다.");
					draw += 1;
				}
				break;
			default:
				System.out.println("잘못된 입력입니다.");

			}
			System.out.println("가위바위보: ");
			att = sc.next();
		}
		System.out.println(match + "전 " + win + "승 " + draw + "무 " + lose + "패");

	}

}
