package com.kh.Chap03_class.run;

import com.kh.Chap03_class.model.vo.Person;

public class Run {

	public static void main(String[] args) {
		Person p = new Person();
		p.changeName("이인호");
		
		p.printName();
	}
}
