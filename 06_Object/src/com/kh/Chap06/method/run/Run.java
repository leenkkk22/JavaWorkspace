package com.kh.Chap06.method.run;

import com.kh.Chap06.method.model.vo.MethodTest1;
import com.kh.Chap06.method.model.vo.MethodTest2;

public class Run {
	public static void main(String[] args) {
		MethodTest1 mt1 = new MethodTest1();
		mt1.method(); // 일반 메서드 호출 방법
		
		
		//static 메서드 호출방법 
		MethodTest2.method(0);
	}

}
