package com.kh.Chap01.abstraction.run;

import com.kh.Chap01.abstraction.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		/*
		 * 1. 객체지향언어: 객체를 중심으로 객체간의 상호작용을 통해 동작하는 프로그래밍 방식의 언어
		 * 2. 객체(Object) : new 클래스를 통해 메모리(heap)에 할당된 데이터.
		 * 3. 객체지향 프로그래밍 : 현실 세계에서 독립적인 객체 간 상호작용을 프로그래밍을 통해 코드로 구현하는 과정
		 * 4. 구현하고자 하는 프로그램상의 필요한 객체를 만들기 위해선 클래스라는 틀을 먼저 
		 *   만들어야 한다. => 클래스는 각 객체들의 속성들을 담아낼 수 있는 설계도의 역할을 하며, 추상화와
		 *   캡슐화를 거쳐 만들어진다.
		 * 5. 추상화 및 캡슐화를 하는 방법
		 *    - 내가 구현하고자 하는 프로그램의 목적에 맞는 객체를 선정한 후 그 객체들이 가지고 있을 핵심적인
		 *      역할과 속성과 기능만 남기기
		 * */
		
		//학생 객체 생성
		Student sd = new Student(); // null, 0, 0.0
		sd.name = "한동희";
		sd.age = 29;
		//sd.height = 180.0;
		
		//여러분들 정보로 학생객체 초기화
		
		Student ih = new Student();
		ih.name = "이인호" ;
		ih.age = 25;
		//ih.height = 190.0;
	}

}
