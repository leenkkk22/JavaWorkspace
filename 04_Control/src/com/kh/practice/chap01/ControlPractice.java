package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	Scanner sc = new Scanner(System.in);
	
	public void practice1() {
		//아래 예시와 같이 메뉴를 출력하고 메뉴 번호를 누르면 “OO메뉴입니다“를,
		//종료 번호를 누르면 “프로그램이 종료됩니다.”를 출력하세요.
		
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		System.out.print("메뉴 번호를 입력하세요: ");
		int num = sc.nextInt();
		
		if (num == 1)System.out.println("입력 메뉴입니다.");
		else if(num == 2) System.out.println("수정 메뉴입니다.");
		else if(num == 3) System.out.println("조회 메뉴입니다.");
		else if(num == 4) System.out.println("삭제 메뉴입니다.");
		else if(num == 7) System.out.println("프로그램이 종료됩니다.");
		else System.out.println("잘못 입력되었습니다.");
	
	}
	
	public void practice2() {
		//키보드로 정수를 입력 받은 정수가 양수이면서 짝수일 때만 “짝수다”를 출력하고
		//짝수가 아니면 “홀수다“를 출력하세요.
		//양수가 아니면 “양수만 입력해주세요.”를 출력하세요.
		
		// 가드 조건문
		System.out.println("숫자를 한 개 입력하세요:");
		int num = sc.nextInt();
		if(!(num > 0)) {
			System.out.println("양수만 입력하세요");
			return;
		}
		
		//홀수 짝수
		if(num % 2 ==1) {
			System.out.println("홀수다");	
		}else {
		System.out.println("짝수다");
		}
		/*
		System.out.println("숫자를 한 개 입력하세요:");
		int num = sc.nextInt();
		
		if (num >= 0 && num % 2 == 0) System.out.println("짝수다");
		else if (num % 2 == 1) System.out.println("홀수다");
		else System.out.println("양수만 입력해주세요");
		*/
		
		
		
	}
	
	public void practice3() {
		//국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고
		//합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요.
		//(합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우)
		//합격 했을 경우 과목 별 점수와 합계, 평균, “축하합니다, 합격입니다!”를 출력하고
		//불합격인 경우에는 “불합격입니다.”를 출력하세요
		
		System.out.println("국어점수: ");
		int ko = sc.nextInt();		
		System.out.println("수학점수: ");
		int ma = sc.nextInt();		
		System.out.println("영어점수: ");
		int en = sc.nextInt();
		
		int sum = ko + ma + en;
		double avg = sum / 3;
				
		if (ko >= 40 && ma >= 40 && en >= 40 && avg >= 60) {
			System.out.println("국어: " + ko);
			System.out.println("수학: " + ma);
			System.out.println("영어: " + en);
			System.out.println("합계: " + sum);
			System.out.println("평균: " + avg);
			System.out.println("축하합니다, 합격입니다!");
			}
		else System.out.println("불합격입니다.");
		}
	
	
	public void practice4() {
		
		/*pdf파일 (7page)에서 if문으로 되어있는 봄, 여름, 가을, 겨울 예제를 switch문으로 바꿔서 출력하세요.
		
		if(month == 1 || month == 2 || month == 12)
		{
		season = "겨울";
		} else if(month >= 3 && month <= 5) {
		season = "봄";
		} else if(month >= 6 && month <= 8) {
		season = "여름";
		} else if(month >= 9 && month <= 11) {
		season = "가을";
		} else {season = "해당하는 계절이 없습니다.";
		}
		 */
		
		System.out.println("1~12 사이의 정수 입력: ");
		int month = sc.nextInt();
		
			
		String season = "";
		switch (month) {
		case 1, 2, 12:
			season = "겨울";
			break;
		case 3, 4, 5:
			season = "봄";
			break;
		case 6, 7, 8 :
			season = "여름";
			break;
		case 9, 10, 11 :
			season = "가을";
			break;
		default : 
			season = "해당되는 계절이 없습니다.";
			System.out.println(month +"월은 잘못 입력된 달입니다.");
			return;
		}System.out.println(month +"월은 " + season + "입니다.");
		
		
		/*
		case 1: System.out.println("1월은 겨울입니다.");
				break;
		case 2: System.out.println("2월은 겨울입니다.");
				break;
		case 3: System.out.println("3월은 봄입니다.");
				break;
		case 4: System.out.println("4월은 봄입니다.");
				break;
		case 5: System.out.println("5월은 봄입니다.");
				break;
		case 6: System.out.println("6월은 봄입니다.");
				break;
		case 7: System.out.println("7월은 여름입니다.");
				break;
		case 8: System.out.println("8월은 여름입니다.");
				break;
		case 9: System.out.println("9월은 여름입니다.");
				break;
		case 10: System.out.println("10월은 가을입니다.");
				break;
		case 11: System.out.println("11월은 가을입니다.");
				break;
		case 12: System.out.println("12월은 겨울입니다.");
				break;
		default : System.out.println(month +"월은 잘못 입력된 달입니다.");		
		*/
		
		}
		
 
		
	
	
	public void practice5() {
		//아이디, 비밀번호를 정해두고 로그인 기능을 작성하세요.
		//로그인 성공 시 “로그인 성공”,
		//아이디가 틀렸을 시 “아이디가 틀렸습니다.“,
		//비밀번호가 틀렸을 시 “비밀번호가 틀렸습니다.”를 출력하세요.
		
		
		System.out.println("아이디: ");
		String userId = sc.next();
		
		System.out.println("비밀번호: ");
		String userPw = sc.next();
		
		if (userId.equals ("inholee") && userPw.equals("Inho1234")){
			System.out.println("로그인 성공");
			return;
			
		}
		if(!userId.equals("inholee")){
			System.out.println("아이디가 틀렸습니다.");
			return;
		}
		if(userId.equals("inholee")){
			System.out.println("비밀번호가 틀렸습니다.");
			return;
			
		}
	}
		
	
	public void practice6() {
		
		//사용자에게 관리자, 회원, 비회원 중 하나를 입력 받아 각 등급이 행할 수 있는 권한을 출력하세요.
		//단, 관리자는 회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성이 가능하고
		//회원은 게시글 작성, 게시글 조회, 댓글 작성이 가능하고
		//비회원은 게시글 조회만 가능합니다
		
		System.out.println("권한을 확인하고자 하는 회원 등급: ");
		String memGrade = sc.next();
		
		if (memGrade.equals("관리자")){ {System.out.println("회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성");
		}
		}else if (memGrade.equals("회원")) {System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
		}else if(memGrade.equals("비회원")) {System.out.println("게시글 조회");
		}else System.out.println("잘못된 접근입니다.");
		
	}
	
	
	public void practice7() {
		//키, 몸무게를 double로 입력 받고 BMI지수를 계산하여 계산 결과에 따라
		//저체중/정상체중/과체중/비만을 출력하세요.
		//BMI = 몸무게 / (키(m) * 키(m))
		//BMI가 18.5미만일 경우 저체중 / 18.5이상 23미만일 경우 정상체중
		//BMI가 23이상 25미만일 경우 과체중 / 25이상 30미만일 경우 비만
		//BMI가 30이상일 경우 고도 비만
		
		System.out.println("키(m)를 입력해주세요: ");
		double userMeter = sc.nextDouble();
		
		System.out.println("몸무게(kg)를 입력해주세요: ");
		double userKg = sc.nextDouble();
		double userbmiM = userMeter * userMeter;
		double bmi = userKg / userbmiM;
		
		System.out.println("BMI 지수: "+bmi);
		if (bmi >= 0 && bmi < 18.5) System.out.println("저체중");
		else if (bmi < 23) System.out.println("정상체중");
		else if (bmi < 25) System.out.println("과체중");
		else if (bmi < 30) System.out.println("비만");
		else if (bmi > 30) System.out.println("고도비만");
		else System.out.println("몸무게 입력이 잘못 되었습니다.");
				
	}
	
	public void practice8() {
		//키보드로 두 개의 정수와 연산 기호를 입력 받아 연산 기호에 맞춰 연산 결과를 출력하세요.
		//(단, 두 개의 정수 모두 양수일 때만 작동하며 없는 연산 기호를 입력 했을 시
		//“잘못 입력하셨습니다. 프로그램을 종료합니다.
		
		System.out.println("피연산자1 입력:" );
		int num1 = sc.nextInt();
		System.out.println("피연산자2 입력: ");
		int num2 = sc.nextInt();
		
		System.out.println("연산자를 입력(+,-,*,/,%: ");
		String op = sc.next();
		double sum;
		if  (num1 > 0 && num2 > 0) {
			switch (op) {
			case "+" : sum = (double)num1 + num2;
					   System.out.println(num1 + "+" + num2 + "=" + sum);
				break;
			case "-" : sum = (double)num1 - num2;
					   System.out.println(num1 + "-" + num2 + "=" + sum);
				break;
			case "*" : sum = (double)num1 * num2;
					   System.out.println(num1 + "*" + num2 + "=" + sum);
				break;
			case "/" : sum = (double)num1 / num2;
			   		   System.out.println(num1 + "/" + num2 + "=" + sum);
				break;
			case "%" : sum = (double)num1 % num2;
				       System.out.println(num1 + "%" + num2 + "=" + sum);
				break;
			default	 : System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다."); 
			
			}
				
		}
			
			
		
		
	}
	
	public void practice9() {
		//중간고사, 기말고사, 과제점수, 출석회수를 입력하고 Pass 또는 Fail을 출력하세요.
		//평가 비율은 중간고사 20%, 기말고사 30%, 과제 30%, 출석 20%로 이루어져 있고
		//이 때, 출석 비율은 출석 회수의 총 강의 회수 20회 중에서 출석한 날만 따진 값으로 계산하세요.
		//70점 이상일 경우 Pass, 70점 미만이거나 전체 강의에 30% 이상 결석 시 Fail을 출력하세요.
		
		System.out.println("중간 고사 점수: ");
		double exam1 = sc.nextDouble();
		System.out.println("기말 고사 점수: ");
		double exam2 = sc.nextDouble();
		System.out.println("과제 점수: ");
		double assign = sc.nextDouble();
		System.out.println("출석 횟수: ");
		double attend = sc.nextDouble();
		
		double exam1P = (exam1 * 0.2);
		double exam2P = (exam2 * 0.3);
		double assignP = (assign * 0.3);
		double sum = exam1P + exam2P + assignP + attend;
		
		if (sum >= 70) {
			System.out.println("중간 고사 점수(20): " + exam1P);
			System.out.println("기말 고사 점수(30): " + exam2P);
			System.out.println("과제점수     (30): " + assignP);
			System.out.println("출석 점수    (20): " + attend);
			System.out.println("총점: " + sum);
			System.out.println("PASS");	
		} else if (sum <= 69) {System.out.println("Fail");
			System.out.println("중간 고사 점수(20): " + exam1P);
			System.out.println("기말 고사 점수(30): " + exam2P);
			System.out.println("과제점수     (30): " + assignP);
			System.out.println("출석 점수    (20): " + attend);
			System.out.println("총점: " + sum);
			System.out.println("Fail");	
		} else 	if(attend < 15) System.out.println("Fail [출석 횟수 부족 (" + attend + "/20)]");
		else System.out.println("올바른 점수가 입력되지 않았습니다.");
				
	}
	
	public void practice10() {
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. P/F");
		System.out.println("선택: ");
		int selMenu = sc.nextInt();
		
		switch (selMenu) {
		case 1:
			practice1();
			break;			
		case 2:
			practice2();
			break;			
		case 3:
			practice3();
			break;			
		case 4:
			practice4();
			break;			
		case 5:
			practice5();
			break;			
		case 6:
			practice6();
			break;			
		case 7:
			practice7();
			break;			
		case 8:
			practice8();
			break;			
		case 9:
			practice9();
			break;
			
			
			
		}
	
	}
		
		
		
		
	
}
	



