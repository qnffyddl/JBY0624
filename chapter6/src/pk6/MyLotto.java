package pk6;

import java.util.Random;

public class MyLotto {

	public static void main(String[] args) {
		//�ζ� ��ȣ 6���� ���� �迭�� �غ�
		int[] lotto=new int[6];//0,1,2,3,4,5
		System.out.print("�̹��� �ζ� �����ȣ : ");
		outer : for(int i=0; i<lotto.length;) {//i++
			
				lotto[i]=new Random().nextInt(45)+1;
				
				//�ߺ����� ���ϴ� �ݺ���
				
				for(int j=0; j<i; j++) {
					if(lotto[i]==lotto[j]) {
						continue outer;//�ߺ��Ȱ� ������ �ٽ� �� ����
					}
				}//inner for
			System.out.print(lotto[i] + " ");
			i++;
			
		}//outter for
		
		
	}//main

}//class
