package com.kh.chap02_set.run;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.kh.chap02_set.model.vo.Student;

public class SetRun {
	public static void main(String[] args) {
		/*
		 *        * 중복이 없는 배열을 만들고 싶다면 어떻게 해야 하는가? *
		 *      / Set /
		 * - 중복을 허용하지 않는다.
		 * - 저장된 순서를 보장하지 않는다
		 * 
		 * HashSet : 중복을 허용하지 않고, "빠르게" 저장 및 조회가 가능한 자료구조
		 * 
		 * LinkedHashSet : 중복을 허용하지 않지만, 저장된 순서를 유지한다.
		 * 
		 * TreeSet : 중복을 허용하지 않지만 오름차순 정렬(기본값)을 지원한다.
		 * 
		 * 
		 * */
		
		HashSet<String> hs1 = new HashSet<>();
		hs1.add("반갑습니다");
		hs1.add("반갑습니다");
		hs1.add("여러분");
		hs1.add("안녕하세요");
		
		
		//저장 순서 x, 중복값 저장 x
		System.out.println("hsi");
		System.out.println("hs1.sssi");
		System.out.println(hs1.remove("여러분"));
		System.out.println(hs1);
		
		System.out.println("=================================");
		/*
		 * HashSet이 객체를 저장하는 알고리즘
		 * 1. 객체의 hashCode() 메서드로 객체를 저장할 위치(주소값)을 찾는다
		 * 2. 저장한 위치에 이미 저장된 값이 있다면 equals() 를 통해 저장한 값과 새로추가할 값이 같은지 
		 * 검사한다
		 * 3. 두 값이 같다면 데이터를 중복으로 저장하지 않고, 두 값이 다르다면 저장된 값의 다음 위치에 새로운 값 저장
		 * 
		 * */
		
		
		
		
		
		
		
		
		
		
		
		
		
		Set<Student> hs2 = new HashSet<>();
				hs2.add(new Student("공유",40,100));
		hs2.add(new Student("공유",40,100));
		hs2.add(new Student("홍길똥",26,100));
		hs2.add(new Student("김갑생",27,100));
		
		System.out.println(hs2);
		System.out.println(hs2.size());

		Student s1 = new Student("민경민",30,10);
		Student s2 = new Student("민경민" 30 , 10);
		System.out.println(s1.equals(s2) );// true
		
		
		System.out.println("============================");
		//Set계열 클래스 반복처리
		
		// 1. for문 활용하여 반복처리
		// - 기본 basic Loop문은 사용 불가.
		for( Student s :hs2) {
			System.out.println(s);
		}
		
		// 2. Iterator를 통한 반복
		// - List 계열과 Set 계열에서는 Iterator를 직접 구현하였기 때문에 사용이 가능하나,
		// Map 계열에서는 바로 호출이 불가하다
		Iterator<Student> iter = hs2.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		// List <--> Set
		// 1. List/Set에 Set/List 데이터를 추가하는 방법
		//매개 변수 생성자
		List<Student> list = new ArrayList<>(hs2);
		
		// 2. List에 Set 계열 데이터 추가하는 방법
		// addAll()
		List<Student> list2 = new ArrayList<>();
		list2.addAll(hs2);
		
		// LinkedHashSet
		// 저장 순서 유지
		Set<Integer> set1 = new LinkedHashSet<>();
		set1.add(34);
		set1.add(2334);
		set1.add(3443);
		set1.add(3434);
		set1.add(35654);
		System.out.println(set1);
		
		
		// TreeSet
		// - 데이터를 정렬(기본 오름차순) 시켜서 보관
		Comparator<Integer> comp = Collections.reverseOrder();
		
		Set<Integer> set2 = new TreeSet<>(set1); // 정수 내림차순 정렬조건을 가진 객체
		set2.addAll(set1);
		System.out.println(set2);
		
		
	}
	

}
