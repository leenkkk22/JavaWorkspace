package com.kh.practice.list.library.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.practice.list.library.model.vo.Book;

public class BookController {
	
	private List list = new ArrayList();
	
	
	public BookController() {
		list.add(new Book("자바의 정석", "남궁 성", "기타", 20000));
		list.add(new Book("쉽게 배우는 알고리즘", "문병로", "기타", 15000));
		list.add(new Book("대화의 기술", "강보람", "인문", 17500));
		list.add(new Book("암 정복기", "박신우", "의료", 21000));
	}
	
	public void insertBook(Book bk) {
		list.add(bk);
		
	}
	
	public ArrayList selectList() {
		return (ArrayList) list;
	}
	
	public ArrayList searchBook(String keyword) {
		ArrayList searchList = new ArrayList();
		
		for(Object o : list) {
			Book b = (Book) o;
			if(b.getTitle().contains(keyword)) {
				searchList.add(b);
			}
		}
			
			return searchList;
	}
	
	public Book deleteBook(String title, String author) {
		// 삭제된 도서를 담을 Book객체 (Book removeBook) 선언 및 null로 초기화
		// 반복문을 통해 bookList의 책 중 책 명이 전달 받은 title과 동일하고
		// 저자 명이 전달 받은 author와 동일한 경우 해당 인덱스 도서 삭제 후 빠져나감
		// 이 때 해당 인덱스 도서를 removeBook에 대입 후 removeBook 반환
		
		Book removeBook = null;
		
		for(Object o:list) {
			Book b = (Book) o;
			if(b.get().equals(title) && b.getAuthor().equals(author)) {
				
			}
		}
	}
	
	public int ascBook() {
		
	}

}
