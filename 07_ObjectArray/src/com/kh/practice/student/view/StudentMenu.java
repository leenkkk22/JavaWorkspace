package com.kh.practice.student.view;

import java.util.Arrays;
import java.util.Scanner;

import com.kh.practice.student.controller.StudentController;
import com.kh.practice.student.model.vo.Student;

public class StudentMenu {
	
	Scanner sc = new Scanner(System.in);
	
	
	private StudentController ssm = new StudentController();
		
		public void StudentMenu() {// 멤버 필드
			
		
//			public StudentMenu() {
//				========== 학생 정보 출력 ==========
//				// StudentController에 printStudent()의 반환 값을 통해 학생 정보 출력
//				========== 학생 성적 출력 ==========
//				// StudentController에 avgScore()를 통해 점수 합계와 평균 출력
//				========== 성적 결과 출력 ==========
//				// 학생의 점수가 CUT_LINE 미만이면 재시험 대상, 이상이면 통과 출력
			
			System.out.println("========== 학생 정보 출력 ==========");
			Student [] arr = ssm.printStudent();
			ssm.printStudent();
			System.out.println("========== 학생 성적 출력 ==========");
			double[] dArr = ssm.avgScore();
			System.out.println("점수의 합 : "+ (int)dArr[0]);
			System.out.println("학생 평균 : " + dArr[1]);
			System.out.println("========== 성적 결과 출력 ==========");
			for(Student s:arr) {
//				System.out.println(s.getName() + "은 " + (
//									s.getName() < StudentController.CUT_LINE ?
//											:"재시험 대상입니다." : "통과입니다"));
												
			}
			
		}
}
	
	
	

