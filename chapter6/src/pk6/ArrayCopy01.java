package pk6;

public class ArrayCopy01 {

	public static void main(String[] args) {

		int[] array1= {10,20,30,40,50};
		int[] array2= {1,2,3,4,5};
		
		//�迭 ���� : (array1, ÷��(���簡 ���۵� ÷��), array2, �ٿ��ֱ� ����, �ٿ��ֱ� ��);
		System.arraycopy(array1, 0, array2, 1, 4);
		
		for(int i=0; i<array2.length; i++) {
			System.out.print(array2[i] + " ");
		}
		
		
		
	}

}
