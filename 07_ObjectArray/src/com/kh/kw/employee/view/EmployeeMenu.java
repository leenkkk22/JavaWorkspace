package com.kh.kw.employee.view;

import java.util.Scanner;

import com.kh.kw.employee.controller.EmployeeController;

public class EmployeeMenu {
	private Scanner sc = new Scanner(System.in);
	private EmployeeController ec = new EmployeeController();
			
		
	
    public EmployeeMenu() {
		while (true) {
			System.out.println("1. 사원추가");
			System.out.println("2. 사원 수정");
			System.out.println("3. 사원 삭제");
			System.out.println("4. 사원 출력");
			System.out.println("9. 프로그램 종료");
			System.out.println("메뉴 번호를 누르세요 : ");
			int sel = sc.nextInt();

			switch (sel) {
			case 1:
				insertEmp();
				break;
			case 2:
				updateEmp();
				break;
			case 3:
				deleteEmp();
				break;
			case 4:
				printEmp();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못된 입력입니다. 다시 입력해주세요");
			}
			System.out.println();
		}
	}
	
	public void insertEmp() {
		System.out.print("1. 사원 번호: ");
		int empNum = sc.nextInt();
		System.out.println("2. 사원 이름: ");
		String empName = sc.next();
		System.out.println("3. 사원 성별: ");
		char empGen = sc.next().charAt(0);
		System.out.println("4. 전화 번호: ");
		String empHp = sc.next();
		System.out.println("추가 정보를 더 입력하시곘습니까?(Y/N): ");
		char ch = sc.next().charAt(0);
	
		
		if(ch == 'y' || ch == 'Y') {
			System.out.println("사원 부서: ");
			String empPart = sc.next();
			System.out.println("사원 연봉: ");
			int empSal = sc.nextInt();
			System.out.println("보너스 율: ");
			double empBonus = sc.nextDouble();
		
			ec.add(empNum, empName, empGen, empHp, empPart, empSal, empBonus);
			
		} else { 
			ec.add(empNum, empName, empGen, empHp);
		}
		
	}
	
	public void updateEmp() {
		System.out.println("가장 최신의 사원 정보를 수정하게 됩니다.");
		System.out.println("사원의 어떤 정보를 수정하시겠습니까?");
		System.out.println("1. 전화 번호 ");
		System.out.println("2. 사원 연봉");
		System.out.println("3. 보너스 율");
		System.out.println("9. 돌아가기");
		System.out.print("메뉴 번호를 누르세요: ");
		int sel = sc.nextInt();
		
		switch (sel) {
		case 1:
			System.out.print("업데이트할 전화번호: ");
			int empTel = sc.nextInt();
			ec.modify(empTel);
			break;
		case 2:
			System.out.print("업데이트할 사원 연봉: ");
			int empSal = sc.nextInt();
			ec.modify(empSal);
			break;
		case 3:
			System.out.print("업데이트할 보너스 율: ");
			double empBonus = sc.nextDouble();
			ec.modify(empBonus);
			break;
		case 9:
			System.out.print("메인 메뉴로 돌아갑니다.");
			return;
		default :
			System.out.println("잘못된 값이 입력 되어 처음으로 돌아갑니다.");
			return;
		}
		
	}
	
	public void deleteEmp() {
		System.out.print("정말 삭제하시겠습니까? (Y/N): ");
		char ch = sc.next().charAt(0);
		if (ch == 'y' || ch == 'Y') {
			ec.remove();
			System.out.println("데이터 삭제에 성공하였습니다.");
		} 
	}
	
	
	public void printEmp() {
	    String info = ec.inform();  // ⭐ 먼저 선언

	    if (info == null || info.isEmpty()) {
	        System.out.println("사원 데이터가 없습니다.");
	    } else {
	        System.out.println(info);
	    }
	}
	

}
