package p20200915예외처리;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// 예제1
		int x, y;
		
		// 테스트를 위하여 정수 나누기 0을 한다.
		System.out.println("피젯수 : ");
		x = scn.nextInt();
		System.out.println("젯수 : ");
		y = scn.nextInt();
//
//		try {
//			int result = x / y;
//			System.out.println("나눗셈 결과 : " + result);
//		} catch (Exception e) {
//			System.out.println("예외 발생");
//			//e.printStackTrace();
//		} finally {
//			System.out.println("try catch절 수행 완료");	
//		}
		
		int [] array = {1, 2, 3, 4, 5};
		// int [] array = new int[5];	// 배열을 생성하는 또 다른 방법
		// array[0] = 1; ...			// 위의 배열 처럼 하나하나 초기화를 할때 사용하는 방법중 하나이다.
		int i = 0;
		
		// try catch문에서 'exception e'는 최상위의 예외리다.
		try {
			int result = x / y;
			System.out.println("나눗셈 결과 : " + result);
			
			for(i = 0 ; i <= array.length ; i++) {	// 배열보다 더 큰 값을 넣었을때 오류가 발생하도록 한다.
				System.out.println(array[i] + " ");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("예외 발생 : 배열의 첨자가 범위를 넘어 사용하였습니다.");
			e.printStackTrace();
		} catch (ArithmeticException e) {
			System.out.println("예외 발생 : 0으로 나눌 수 없습니다.");
		}
		System.out.println("프로그램의 마지막");
		
	}

}
