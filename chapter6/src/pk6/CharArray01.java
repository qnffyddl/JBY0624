package pk6;

import javax.swing.JOptionPane;

public class CharArray01 {

	public static void main(String[] args) {
		String str[]= {"ab111","cd222","ef333","gh444","ij555"};
		String res="";
		 
		for(int i =0; i<str.length; i++) {
			res+=str[i]+"\n";
			//res방에 누적을 시킨다. 
			System.out.println(res);

			
			JOptionPane.showMessageDialog(null, "배열 원소의 값\n"+res);
			//메세지 박스 
		}
		
		
	}

}
