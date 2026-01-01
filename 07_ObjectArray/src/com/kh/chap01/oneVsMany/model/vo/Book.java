package com.kh.chap01.oneVsMany.model.vo;

//Vo classed = 값을 저장하고 활용하기 위한 목적이므로 값을 체크하는 메서드가 꼭 들어있습니다
public class Book {
	
	//도서명, 저자명, 가격, 출판사, 
	private String title;
	private String author;
	private int price;
	private String publisher;
	
	public Book(){
		
	}
	
	public Book(String title, String author ,int price ,
			String publisher) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
		
		
	}
	
	// 각 필드에 대한 getter/setter 메서드를 생성
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public String getPublisher() {
		return publisher;
	}
	
	
	//Vo. classed = 값을 저장하고 활용하기 위한 목적이므로 값을 체크하는 메서드가 꼭 들어있습니다
	public String information() { //모든 필드 정보를 하나의 문자열로 합쳐 반환하는 메서드
		return title +", "+ author +", "+ price +", "+ publisher;
		
	}
	
	
	
	
	

}
