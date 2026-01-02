package com.kh.example.practice5.model.vo;

public class Lotto {
	private int lotto[];
	{
		lotto = new int [6];
		for(int i = 0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45 +1);
			
			for(int j = 0; j<i; j++) {
				if(lotto[j] == lotto[i]) {
					i--;
					break;
				}
			}
		}
	}
	
	public Lotto() {
		
	}
	
	public void inforamation() {
		for(int i = 0; i<lotto.length; i++) {
			System.out.print((i+1) +"번 번호는 " +"'"+lotto[i]+"'"+"입니다.");
			System.out.println();
		}
	}

}
