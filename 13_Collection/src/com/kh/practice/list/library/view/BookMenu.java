package com.kh.practice.list.library.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.practice.list.library.controller.BookController;
import com.kh.practice.list.library.model.vo.Book;

public class BookMenu {
	private Scanner sc = new Scanner(System.in);
	private BookController bc = new BookController();

	public void mainMenu() {

		System.out.println(" = = Welcome KH Library = = ");

		while (true) {
			System.out.println();
			System.out.println("******* 메인 메뉴 ******* ");

			System.out.println("1. 새 도서 추가");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색 조회");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 도서 명 오름차순 정렬");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 선택 : ");

			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				insertBook();
				break;
			case 2:
				selectList();
				break;
			case 3:
				searchBook();
				break;
			case 4:
				deleteBook();
				break;
			case 5:
				ascBook();
				break;
			case 9:
				System.out.println("프로그램을 종료합니다. ");
				return;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요.");

			}

		}

	}

	public void insertBook() {
		String category = null;

		System.out.print("1. 도서명 입력");
		String title = sc.nextLine();
		sc.nextLine();
		System.out.print("2. 저자명 입력");
		String author = sc.nextLine();
		System.out.print("3. 장르(1. 인문 / 2. 과학 / 3. 외국어 / 4. 기타) : ");
		int num = sc.nextInt();
		System.out.print("4. 가격 입력");
		int price = sc.nextInt();

		switch (num) {
		case 1:
			category = "인문";
			break;
		case 2:
			category = "자연과학";
			break;
		case 3:
			category = "의료";
			break;
		case 4:
			category = "기타";
			break;

		}
		Book bk = new Book(title, author, category, price);
		bc.insertBook(bk);

	}

	public void selectList() {
		System.out.println("===== 도서 전체 조회 =====");
		ArrayList<Book> booklist = bc.selectList();

		if (booklist != null) {
			for (Book b : booklist) {
				System.out.println(b.toString());
			}
		} else {
			System.out.println("존재하는 도서가 없습니다.");
		}
	}

	public void searchBook() {
		System.out.println("===== 도서 검색 =====");
		System.out.println("검색 키워드: ");
		String title = sc.next();
		sc.nextLine();

		ArrayList<Book> booklist = bc.searchBook(title);

		if (booklist != null) {
			for (Book b : booklist) {
				System.out.println(b.toString());
			}
		} else {
			System.out.println("검색 결과가 없습니다.");
		}
	}

	public void deleteBook() {
//		1. 삭제할 도서명 입력 받기 (String title)
//		2. 삭제할 저자명 입력 받기 (String author)
//		** 도서명과 저자명을 같이 입력 받는 이유
//		--> 같은 도서명이라고 해도 저자명이 다른 도서가 있을 수 있기 때문에
//		3. bc(BookConroller)의 deleteBook() 메소드로 위의 title, autor 값 전달 후
//		--> 결과 값을 임의의 Book(Book remove)에 대입
//		4. 조건식 이용해서
//		4_1. remove가 존재하는 경우 --> "성공적으로 삭제되었습니다."라는 문구 출력
//		4_2. remove가 존재하지 않은 경우 --> "삭제할 도서를 찾지 못했습니다."라는 문구 출력
		System.out.println("===== 도서 삭제 =====");
		System.out.println("1. 삭제할 도서명 입력 받기");
		String title = sc.next();
		sc.nextLine();
		System.out.println("2. 삭제할 저자명 입력 받기");
		String author = sc.nextLine();
		
		bc.deleteBook(title, author);
		}
	

	public void ascBook() {

	}

}
