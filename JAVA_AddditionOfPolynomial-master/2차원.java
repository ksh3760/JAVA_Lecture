package �׽�Ʈ;

public class main {
	public static void main(String[] args) {
		
		float a[][] = new float[][] {{3,4}, {2,3}, {1,5}};					 
		float b[][] = new float[][] {{4,3}, {3,1}, {2,2}, {0,1}};

		// c ����� : {{4,3},{3,5},{2,5},{1,5},{0,1}}						 
		float c[][] = new float[5][2];
	
		// �� ��Ʈ������ ���� ��ġ�� �ľ��ϱ� ���� ����
		int aCnt = 0;
		int bCnt = 0;
		int cCnt = 0;
		
		// ���׽� ���� �κ�
		for(int i = 0 ; i < 5 ; i++) {		// c matrix ũ�� ��ŭ �ݺ�
			if(a[aCnt][0] < b[bCnt][0]) {
				c[cCnt][0] = b[bCnt][0];
				c[cCnt][1] = b[bCnt][1];
				cCnt++;
				bCnt++;
				
			} else if(a[aCnt][0] == b[bCnt][0]) {
				c[cCnt][0] = a[aCnt][0];
				c[cCnt][1] = a[aCnt][1] + b[bCnt][1];
				aCnt++;
				bCnt++;
				cCnt++;
			} else {
				if(a[aCnt][0] > b[bCnt][0]) {
					c[cCnt][0] = a[aCnt][0];
					c[cCnt][1] = a[aCnt][1];
				} else {
					c[cCnt][0] = b[bCnt][0];
					c[cCnt][1] = b[bCnt][1];
				}
			}
			
		}

//		//test (show c matrix)
//		for(int i = 0 ; i < 5 ; i++) {
//			for(int j = 0 ; j < 2 ; j++) {
//				System.out.print((int)(c[i][j]) + " ");
//			}
//			System.out.println();
//		}
		
		// ��� �κ�
		for(int i = 0 ; i < 3 ; i++) {
			if(i == 0) System.out.print("a(x) = ");
			System.out.print((int)(a[i][1]) + "x^" + (int)(a[i][0]) + " ");
		}
		System.out.println();
		
		for(int i = 0 ; i < 4 ; i++) {
			if(i == 0) System.out.print("b(x) = ");
			System.out.print((int)(b[i][1]) + "x^" + (int)(b[i][0]) + " ");
		}
		System.out.println();
		
		for(int i = 0 ; i < 5 ; i++) {
			if(i == 0) System.out.print("c(x) = ");
			System.out.print((int)(c[i][1]) + "x^" + (int)(c[i][0]) + " ");
		}
		System.out.println();

	}//end main
	
}// end class main
