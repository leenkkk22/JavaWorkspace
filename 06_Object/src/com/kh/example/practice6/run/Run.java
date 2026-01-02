package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		Book b = new Book();
		b.inform();
		Book b1 = new Book("총균쇠", "김영사", "제레드 다이아몬드");
		b1.inform();
		Book b2 = new Book("총균쇠", "김영사", "제레드 다이아몬드" , 26820, 20  );
		b2.inform();
		
	}

}
