package pk6;

public class ArrayTest03 {

	public static void main(String[] args) {
	
		double[] data = new double[5];
		data[0]=10.0;
		data[1]=20.0;
		data[2]=30.0;
		//�ʱ�ȭ�Ǵ� ���� �������� �⺻���� 0.0���� �����Ǿ��ֽ��ϴ�.
		
		for(int i =0; i<data.length; i++) {
			System.out.println(data[i]);
		}

	}

}
