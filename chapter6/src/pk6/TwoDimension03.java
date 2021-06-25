package pk6;

import javax.swing.JOptionPane;

public class TwoDimension03 {

	public static void main(String[] args) {
/*
		int [][] javaScore=new int[2][3];//2ÁÙ¿¡ 3Ä­
		
		int java=0;
		
		for(int i=0; i<javaScore.length; i++) {//0, 1
			for(int j=0; j<javaScore[i].length; j++) {//0 1 2
				java=Integer.parseInt(JOptionPane.showInputDialog("javaScore"));
				javaScore[i][j]=java;
				System.out.println("javaScore["+i+"]["+j+"]="+javaScore[i][j]);
			}
		
		}
		System.out.println();
	
		int [][] pythonScore=new int[2][];//2ÁÙ¿¡ 3Ä­
		
		pythonScore[0]=new int[2];
		pythonScore[1]=new int[3];
		
		
		int python=0;
		for(int i=0; i<pythonScore.length; i++) {
			for(int j=0; j<pythonScore[i].length; j++) {
				python=Integer.parseInt(JOptionPane.showInputDialog("pythonScore"));
				pythonScore[i][j]=python;
				System.out.println("pythonScore["+i+"]["+j+"]="+pythonScore[i][j]);
	
			}
		}
	System.out.println();
	*/
		
	int[][] bigdata= {{70,80},{92,96,80}};
	for(int i=0; i<bigdata.length; i++) {
		for(int j=0; j<bigdata[i].length; j++) {
			System.out.println("bigdata["+i+"]["+j+"]="+bigdata[i][j]);
		}
	}
	
	
	
	
	}
}
