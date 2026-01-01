package com.kh.chap01.before.run;

import com.kh.chap01.before.model.vo.Desktop;
import com.kh.chap01.before.model.vo.SmartPhone;

public class BeforeRun {
	public static void main(String[] args) {
		//데스크탑 객체
		Desktop d = new Desktop("삼성","d-01","데탑",20000000,true);
		
		SmartPhone sp = new SmartPhone("애플", "s-01","아이폰11",1300000,"Kt");
		
		System.out.println(d.information());
		System.out.println(sp.information());
		
		/*
		 * 매 클래스마다 중복된 코드를 일일이 기술하게 되면
		 * 수정과 유지보수가 번거로움
		 * 
		 * 상속이라는 개념 적용시켜서
		 * 매 클래스에 존재하는 중복된 필드 및 메서드를 하나의 클래스에 정의해두고, 이 클래스를
		 * 상속시켜주는 방식으로 작업
		 * 
		 * 
		 * 
		 * */
	}

}
