package pk6;

public class EnhancedforLoop01 {

	public static void main(String[] args) {

		String[] strArray= {"Java","python","Android","C","JavaScript"};
		/*
		for(int i=0; i<strArray.length; i++) {
		
			System.out.println(strArray[i]);//÷�ڿ� �ִ� ���� ������
		}
		
		*/

		for(String lang : strArray) {//Ȯ�� for��
			System.out.println(lang);
		}
		
		
	}

}
