package pk6;

public class ArgsTest {
							// 아무것도 할당이 안되어 있음
	public static void main(String[] args) {
		/*public 모두가 공통으로 다 사용할 수 있음. 반대로 private
		//static 고정시켜놓는다. void 반환값이 있어야한다.
		//main 제일 먼저 읽어주는 부분 엔진
		//한 줄 배열의 초기화 int a[]= new int [5]
		//int [] a
		a = new int[5]
		*/
		int aVal;
		int bVal;
				
		int tot;
		/*
		args=new String[2];//메모리
		args[0]="1";
		args[1]="2";
		*/
		
		if(args.length==3) {
			//String -> int 
			aVal=Integer.parseInt(args[0]);
			bVal=Integer.parseInt(args[1]);
			
			//ture에 대해서 끝난거고
		}else {
			aVal=0;
			bVal=0;
			
			//false문이 끝난거
		}
		
		tot=aVal + bVal;
		System.out.println(tot);
		
		
	}

}
