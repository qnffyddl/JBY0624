package pk6;

public class CharArray02 {

	public static void main(String[] args) {
		char[] alpahabets =new char[26];
		char ch='A';//ASCII=65
		//System.out.println(ch++);
		//System.out.println(ch);
		
		for(int i =0; i<alpahabets.length; i++, ch++) {
			alpahabets[i] = ch;
		}
		for(int i =0; i<alpahabets.length; i++) {
			System.out.println(alpahabets[i]+ ","+(int)(alpahabets[i]));
		}
		
		
	}

}
