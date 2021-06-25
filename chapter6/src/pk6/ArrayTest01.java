package pk6;

public class ArrayTest01 {

	public static void main(String[] args) {
		/*배열 선언
		 int [] number1 =new int[10];
		 int number2[] = new int[10];
		 int number3[];
		 number3[]=new int[10]
		*/
		
		/*초기화
		 int [] number1 =new int[]{1,2,3,4,5,6,7,8,9,10}
		 int [] number1 =new int[10]{1,2,3,4,5,6,7,8,9,10} 오류 발생
		 int number3[] = {1,2,3,4,5,6,7,8,9,10}; 가장 많이 사용하는 방법
	*/int i =0;
		int[] number=new int[] {1,2,3,4,5,6,7,8,9,10};//데이타 또는 원소라고 한다.
		int length = number.length;
		//System.out.println(length);
		for(i=0; i<length; i++) {
			System.out.println(number[i]);

		}
		
		
		
	}

}
