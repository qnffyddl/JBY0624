package pk6;

public class TwoDimension01 {

	public static void main(String[] args) {

		int[][] arr = {{1,2,3},{4,5,6}};//�ʱ�ȭ
		
		System.out.println(arr.length);//��ü ��
		System.out.println(arr[0].length);//0���� ���� ���?
		System.out.println(arr[1].length);//1���� ���� ���?
		
		System.out.println("----------------------");
		
		for(int i=0; i<arr.length; i++) {//0 1
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}

}
