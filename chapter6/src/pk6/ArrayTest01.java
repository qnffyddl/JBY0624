package pk6;

public class ArrayTest01 {

	public static void main(String[] args) {
		/*�迭 ����
		 int [] number1 =new int[10];
		 int number2[] = new int[10];
		 int number3[];
		 number3[]=new int[10]
		*/
		
		/*�ʱ�ȭ
		 int [] number1 =new int[]{1,2,3,4,5,6,7,8,9,10}
		 int [] number1 =new int[10]{1,2,3,4,5,6,7,8,9,10} ���� �߻�
		 int number3[] = {1,2,3,4,5,6,7,8,9,10}; ���� ���� ����ϴ� ���
	*/int i =0;
		int[] number=new int[] {1,2,3,4,5,6,7,8,9,10};//����Ÿ �Ǵ� ���Ҷ�� �Ѵ�.
		int length = number.length;
		//System.out.println(length);
		for(i=0; i<length; i++) {
			System.out.println(number[i]);

		}
		
		
		
	}

}
