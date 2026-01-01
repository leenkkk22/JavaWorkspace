package com.kh.Chap05.constructor.run;

import com.kh.Chap05.constructor.model.vo.User;

public class run {
	public static void main(String[] args) {
		User u1 = new User();
		
		User u2 = new User("user01");
		
		User u3 = new User("user03" , 30, 'M'); // 내가 선언한 매개변수 순서에 맞춰서 입력
		System.out.println(u3.getUserId());
		System.out.println(u3.getUserAge());
		System.out.println(u3.getUserGender());
	}

}
