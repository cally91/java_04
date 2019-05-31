package com.biz.for_each;

public class For_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 여러줄의 주석
		 *
		 * intMin부터 intMax까지의 
		 * 1 전체합 
		 * 2.짝수의합 
		 * s3.홀수의 합
		 */
		int intMin = 0;
		int intMax = 10;
		int intSum = 0;
		int intEvensum = 0;
		int intOddsum = 0;
		for (int i = intMin; i <= intMax; i++) {
			intSum += i;
		}

		// 짝수의 시작값 계산
		int intEven = intMin + intMax % 2;
		for (int i = intMin; i <= intMax; i += 2) {
			intEvensum += i;

		}

		// 홀수의 시작값 계산
		int intodd = intMin + ((intMin + 1) % 2);
		for (int i = intodd; i <= intMax; i += 2) {
			intOddsum += i;
		}
		System.out.println("전체합." + intSum);
		System.out.println("짝수합." + intEvensum);
		System.out.println("홀수합" + intOddsum);
	}

}
