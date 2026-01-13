package com.kh.chap02_set.model.vo;

public class Student {
	
	public String name;
	public int age;
	public int score;
	
	public Student() {
		
	}

	public Student(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}

	/*
	 * 서로 다른 객체의 필드값이 동일하다면 같은 객체가 될 수 있게 하기 위해서는
	 * 1. equals 메서드 오버라이딩
	 * 2. hashCode 메서드 오버라이딩
	 * 
	 * 
	 * */
	
	public boolean equals(Object o) {
		//매개 변수로 전달받은 객체가 스튜던트 객채가 아닌 격ㅇ우
		if(!(o instanceof Student) ) {
			
		}
		
		boolean result - false;
		
		//이름, 나이 , 점수가 모두 같다면
		if(this.name.equals(o.name));
		
		Student s = (Students) o;
		if(this.name.equals(s).name)
			&& this.age age == s.age
			&& this.score == s.score{
			result = true;
		}

		return result;
		
	}
	
	/*
	 * HashCode()
	 * - Object의 hashCode는 저장된 주소값을 10진수 형태로 반환해주는 메서드
	 * - hashCode는 HaspMap, HashSet에서 데이터를 저장하기 위한 key값에 사용되는 메서드
	 * - hashCode를 오버라이딩하지 않고 equals 메서드만 오버라이딩하게되면 논리적으로 두 객체는 
	 * - 같음을 판단 할 수 있지만 서로 다른 주소값을 가지므로 중복으로 데이터가 저장되어 버린다
	 * - 즉 hashCode는 객체의 주소값으로 활용
	 *   
	 * */
	
	@Override
	public int hashCode() {
		// 공유 40100
		return (name+ age + score).hashCode();
		
		
	}
	
	
}
