package com.kh.chap01.oneVsMany.run;

import java.util.Scanner;

import com.kh.chap01.oneVsMany.model.vo.Book;

public class Run {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		//객체 배열 없이 코딩하기
		// 1. setter 방식 초기화
		Book bk1 = new Book();
		bk1.setTitle("총균쇠");
		bk1.setAuthor("제레드 다이아몬드");
		bk1.setPrice(26000);
		bk1.setPublisher("김영사");
		
		// 2. 매개변수 생성자로 객체 생성 및 초기화
		Book bk2 = new Book("총균쇠(ㅁㅁㅁㅁ)","제레드 다이아몬드", 26000, "김영사");
		
		// 3. 매개변수 생성자로 객체 생성 및 초기화
		Book bk3 = new Book("원피스", "오다", 10000, "이지스");
		
		// 도서정보 출력 서비스
//		for(int i = 0; i<3; i++) {
//			if( i == 0) {
//				System.out.println(bk1.information());
//			}else if(i == 1) {
//				System.out.println(bk2.information());
//			}else {
//				System.out.println(bk3.information());
//			}
//		}

		//객체만 있는 상태에선 작업이 비효율적이므로, 배열에 넣어서 관리해줘야 한다.
		//자료형(Book) = 우리가 만든 클래스
		Book[] arr = new Book[3]; // [null, null, null]
		arr[0] = bk1;
		arr[1] = bk2;
		arr[2] = bk3;
		
		//배열을 통해 도서정보 출력 서비스 만들기
//		for(int i = 0; i<arr.length; i++) {
//			System.out.println(arr[i].information());
//		}
		
		// 사용자에게 검색할 도서 제목을 입력 받아 전체 도서목록들 중 일치하는 제목의 도서 찾기
		System.out.println("검색할 책의 제목: ");
		String searchTitle = sc.next();
		
		for(int i = 0; i<arr.length; i++) {
			if (arr[i].getTitle().equals(searchTitle)){
				System.out.println("입력하신 정보와 일치하는 책의 정보: " + arr[i].information() +"입니다");
			} else return;
				
			
		}
		
	}

	}
	

