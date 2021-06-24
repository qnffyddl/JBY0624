package pk3;

public class Constant {

	public static void main(String[] args) {
		//상수 : 변하지 않는 값 선언
		final int MAX_NUM=100;
		final int MIN_NUM;
		final double PI=3.14;
		
		MIN_NUM=0;
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		
		//MAX_NUM=1000; //Error:상수값 즉 한번선언하면 변경 불가
        //PI=31.4;
	}

}
