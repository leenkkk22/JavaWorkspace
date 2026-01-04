package com.kh.hw.member.view;

import java.util.Scanner;
import com.kh.hw.member.controller.MemberController;
import com.kh.hw.member.model.vo.Member;

public class MemberMenu {
	private Scanner sc = new Scanner(System.in);
	private MemberController mc = new MemberController();

	public void mainMenu() {
	    while (true) {
	        System.out.println("최대 등록 가능한 회원 수는 " + MemberController.SIZE + "명입니다.");
	        System.out.println("현재 등록된 회원 수는 " + mc.existMemberNum() + "명입니다.");

	        if (mc.existMemberNum() == MemberController.SIZE) {
	            System.out.println("회원 수가 모두 꽉 찼기 때문에 일부 메뉴만 오픈됩니다.");
	            System.out.println("2. 회원 검색");
	            System.out.println("3. 회원 정보 수정");
	            System.out.println("4. 회원 삭제");
	            System.out.println("5. 모두 출력");
	            System.out.println("9. 끝내기");
	        } else {
	            System.out.println("1. 새 회원 등록");
	            System.out.println("2. 회원 검색");
	            System.out.println("3. 회원 정보 수정");
	            System.out.println("4. 회원 삭제");
	            System.out.println("5. 모두 출력");
	            System.out.println("9. 끝내기");
	        }

	        System.out.print("메뉴 번호 : ");

	        int menu = sc.nextInt();
	        sc.nextLine();

	        switch (menu) {
	        case 1:
	            if (mc.existMemberNum() < MemberController.SIZE)
	                insertMember();
	            else
	                System.out.println("회원 수가 모두 꽉 찼습니다.");
	            break;
	        case 2:
	            searchMember();
	            break;
	        case 3:
	            updateMember();
	            break;
	        case 4:
	            deleteMember();
	            break;
	        case 5:
	            printAll();
	            break;
	        case 9:
	            System.out.println("프로그램을 종료합니다.");
	            return;
	        default:
	            System.out.println("잘못 입력하셨습니다.");
	        }
	    }
	}


	public void insertMember() {
		String id;
		while (true) {
			System.out.print("아이디 : ");
			id = sc.nextLine();
			if (!mc.checkId(id))
				break;
			System.out.println("중복된 아이디입니다.");
		}

		System.out.print("이름 : ");
		String name = sc.nextLine();

		System.out.print("비밀번호 : ");
		String pw = sc.nextLine();

		System.out.print("이메일 : ");
		String email = sc.nextLine();

		char gender;
		while (true) {
			System.out.print("성별(M/F) : ");
			gender = sc.nextLine().toUpperCase().charAt(0);
			if (gender == 'M' || gender == 'F')
				break;
		}

		System.out.print("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();

		mc.insertMember(id, name, pw, email, gender, age);
	}

	public void searchMember() {
		System.out.println("1. 아이디로 검색하기");
		System.out.println("2. 이름으로 검색하기");
		System.out.println("3. 이메일로 검색하기");
		System.out.println("9. 메인으로 돌아가기");
		int menu = sc.nextInt();
		sc.nextLine();

		if (menu == 1) {
			searchId();
		} else if (menu == 2) {
			searchName();
		} else if (menu == 3) {
			searchEmail();
		} else if (menu == 9){
			System.out.println("메인으로 돌아갑니다");
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}

	public void searchId() {
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		String result = mc.searchId(id);
		if (result == null)
			System.out.println("검색 결과가 없습니다.");
		else
			System.out.println(result);
	}

	public void searchName() {
		System.out.print("이름 : ");
		String name = sc.nextLine();
		Member[] list = mc.searchName(name);
		boolean found = false;
		for (Member m : list) {
			if (m != null) {
				System.out.println(m.inform());
				found = true;
			}
		}
		if (!found)
			System.out.println("검색 결과가 없습니다.");
	}

	public void searchEmail() {
		System.out.print("이메일 : ");
		String email = sc.nextLine();
		Member[] list = mc.searchEmail(email);
		boolean found = false;
		for (Member m : list) {
			if (m != null) {
				System.out.println(m.inform());
				found = true;
			}
		}
		if (!found)
			System.out.println("검색 결과가 없습니다.");
	}

	public void updateMember() {
		System.out.println("1. 비밀번호 수정하기");
		System.out.println("2. 이름 수정하기");
		System.out.println("3. 이메일 수정하기");
		int menu = sc.nextInt();
		sc.nextLine();

		if (menu == 1)
			updatePassword();
		else if (menu == 2)
			updateName();
		else if (menu == 3)
			updateEmail();
		else System.out.println("잘못 입력하셨습니다.");
	}

	public void updatePassword() {
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("비밀번호 : ");
		String pw = sc.nextLine();
		System.out.println(mc.updatePassword(id, pw) ? "수정이 성공적으로 되었습니다." : "존재하지 않는 아이디입니다");
	}

	public void updateName() {
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.println(mc.updateName(id, name) ? "수정이 성공적으로 되었습니다." : "존재하지 않는 아이디입니다");
	}

	public void updateEmail() {
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("이메일 : ");
		String email = sc.nextLine();
		System.out.println(mc.updateEmail(id, email) ? "수정이 성공적으로 되었습니다." : "존재하지 않는 아이디입니다");
	}

	public void deleteMember() {
		System.out.println("1. 특정 회원 삭제");
		System.out.println("2. 전체 삭제");
		int menu = sc.nextInt();
		sc.nextLine();

		if (menu == 1)
			deleteOne();
		else if (menu == 2)
			deleteAll();
		else System.out.println("잘못 입력하셨습니다.");
	}

	public void deleteOne() {
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("정말 삭제하시겠습니까?(y/n) : ");
		if (sc.nextLine().equalsIgnoreCase("y")) {
			System.out.println(mc.delete(id) ? "삭제가 성공적으로 되었습니다." : "존재하지 않는 아이디입니다");
		}
	}

	public void deleteAll() {
		System.out.print("정말 삭제하시겠습니까?(y/n) : ");
		if (sc.nextLine().equalsIgnoreCase("y")) {
			mc.delete();
			System.out.println("전체 삭제 완료");
		}
	}

	public void printAll() {
		Member[] list = mc.printAll();
		boolean empty = true;
		for (Member m : list) {
			if (m != null) {
				System.out.println(m.inform());
				empty = false;
			}
		}
		if (empty)
			System.out.println("저장된 회원이 없습니다.");
	}
}
