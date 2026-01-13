package com.kh.practice.map.controller;

import java.util.HashMap;
import java.util.TreeMap;

import com.kh.practice.map.model.vo.Member;

public class MemberController{
	private HashMap map = new HashMap();
	private int capacity; // 객체 배열의 크기
	private int size; //객체 배열 내부의 초기화된 객체 수
	

	public boolean joinMembership(String id, Member m) {
		// 전달 받은 id가 중복되는 데이터가 없다 id와 m을 map에 추가 후 true 반환
		// 있다면 false 값 반환
		if(map.containsKey(id)) {
			return false;
		}else {
			map.put(id, m);
			return true;
		}
		
		
	}
	
	public String login(String id, String password) {
		// 전달 받은 id가 존재하는지 확인 후 존재하면 Member에 저장된 비밀번호와
		// 사용자가 입력한 비밀번호가 같은지 비교.
		// 같다면 저장된 Member의 이름 반환, 그 외 모든 상황에는 null 반환
		Member m = (Member) map.get(id);
		if(m != null && m.getPassword().equals(password)) {
			return m.getName();
		}else {
			return null;
		}
	}

	public boolean changePassword(String id, String oldPw, String newPw) {
		// 아이디가 존재하면서 저장된 비밀번호와 사용자가 입력한 비밀번호(oldPw)가
		// 같을 때 새로운 비밀번호로 바꾸고 true 반환, 아니라면 false 반환
		Member m = (Member) map.get(id);
		if(m != null && m.getPassword().equals(oldPw)) {
			m.setPassword(newPw);
			return true;
		}else {
			return false;
		}
	}
	
	public void changeName(String id, String newName) {
		//전달 받은 id를 통해 Member의 이름을 새로 입력한 이름으로 변경
		Member m = (Member) map.get(id);
		map.remove(id);
		if(m != null) {
			m.setName(newName);
		}
		
		
	}
	
	public TreeMap sameName(String name) {
		// 전달 받은 name이 저장된 데이터의 이름과 같으면
		// key로 오름차순 해주는 객체에 해당 id와 이름 저장 후 객체 반환
		// 단, 엘리먼트 하나씩 뽑아내는 과정에서 keySet()을 쓸 것

	}
}
