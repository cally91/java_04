package com.biz.for_each;

public class For_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intF = 100;
		int intFS = 1;

		for (int i = 10; i > 0; i--) {
			System.out.println(i);
			// intFS=intFS *I;
			intFS*=i;
			
		}
		System.out.println(intFS);
	}

}
