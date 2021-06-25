package pk6;

public class EnhancedforLoop01 {

	public static void main(String[] args) {

		String[] strArray= {"Java","python","Android","C","JavaScript"};
		/*
		for(int i=0; i<strArray.length; i++) {
		
			System.out.println(strArray[i]);//첨자에 있는 원소 가져와
		}
		
		*/

		for(String lang : strArray) {//확장 for문
			System.out.println(lang);
		}
		
		
	}

}
