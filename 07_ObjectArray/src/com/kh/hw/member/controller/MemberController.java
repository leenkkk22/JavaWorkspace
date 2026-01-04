package com.kh.hw.member.controller;

import com.kh.hw.member.model.vo.Member;

public class MemberController {
	public static final int SIZE = 10;
	private Member[] m = new Member[SIZE];

	public int existMemberNum() {
		int count = 0;
		for (Member member : m) {
			if (member != null)
				count++;
		}
		return count;
	}

	public boolean checkId(String inputId) {
		for (Member member : m) {
			if (member != null && member.getId().equals(inputId))
				return true;
		}
		return false;
	}

	public void insertMember(String id, String name, String password, String email, char gender, int age) {
		for (int i = 0; i < m.length; i++) {
			if (m[i] == null) {
				m[i] = new Member(id, name, password, email, gender, age);
				break;
			}
		}
	}

	public String searchId(String id) {
		for (Member member : m) {
			if (member != null && member.getId().equals(id)) {
				return member.inform();
			}
		}
		return null;
	}

	public Member[] searchName(String name) {
		Member[] result = new Member[SIZE];
		int idx = 0;
		for (Member member : m) {
			if (member != null && member.getName().equals(name)) {
				result[idx++] = member;
			}
		}
		return result;
	}

	public Member[] searchEmail(String email) {
		Member[] result = new Member[SIZE];
		int idx = 0;
		for (Member member : m) {
			if (member != null && member.getEmail().equals(email)) {
				result[idx++] = member;
			}
		}
		return result;
	}

	public boolean updatePassword(String id, String password) {
		for (Member member : m) {
			if (member != null && member.getId().equals(id)) {
				member.setPassword(password);
				return true;
			}
		}
		return false;
	}

	public boolean updateName(String id, String name) {
		for (Member member : m) {
			if (member != null && member.getId().equals(id)) {
				member.setName(name);
				return true;
			}
		}
		return false;
	}

	public boolean updateEmail(String id, String email) {
		for (Member member : m) {
			if (member != null && member.getId().equals(id)) {
				member.setEmail(email);
				return true;
			}
		}
		return false;
	}

	public boolean delete(String id) {
		for (int i = 0; i < m.length; i++) {
			if (m[i] != null && m[i].getId().equals(id)) {
				m[i] = null;
				return true;
			}
		}
		return false;
	}

	public void delete() {
		for (int i = 0; i < m.length; i++) {
			m[i] = null;
		}
	}

	public Member[] printAll() {
		return m;
	}
}
