package p20200915����ó��;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		// ����1
		int x, y;
		
		// �׽�Ʈ�� ���Ͽ� ���� ������ 0�� �Ѵ�.
		System.out.println("������ : ");
		x = scn.nextInt();
		System.out.println("���� : ");
		y = scn.nextInt();
//
//		try {
//			int result = x / y;
//			System.out.println("������ ��� : " + result);
//		} catch (Exception e) {
//			System.out.println("���� �߻�");
//			//e.printStackTrace();
//		} finally {
//			System.out.println("try catch�� ���� �Ϸ�");	
//		}
		
		int [] array = {1, 2, 3, 4, 5};
		// int [] array = new int[5];	// �迭�� �����ϴ� �� �ٸ� ���
		// array[0] = 1; ...			// ���� �迭 ó�� �ϳ��ϳ� �ʱ�ȭ�� �Ҷ� ����ϴ� ����� �ϳ��̴�.
		int i = 0;
		
		// try catch������ 'exception e'�� �ֻ����� ���ܸ���.
		try {
			int result = x / y;
			System.out.println("������ ��� : " + result);
			
			for(i = 0 ; i <= array.length ; i++) {	// �迭���� �� ū ���� �־����� ������ �߻��ϵ��� �Ѵ�.
				System.out.println(array[i] + " ");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("���� �߻� : �迭�� ÷�ڰ� ������ �Ѿ� ����Ͽ����ϴ�.");
			e.printStackTrace();
		} catch (ArithmeticException e) {
			System.out.println("���� �߻� : 0���� ���� �� �����ϴ�.");
		}
		System.out.println("���α׷��� ������");
		
	}

}
