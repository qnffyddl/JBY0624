package pk6;

public class ArgsTest {
							// �ƹ��͵� �Ҵ��� �ȵǾ� ����
	public static void main(String[] args) {
		/*public ��ΰ� �������� �� ����� �� ����. �ݴ�� private
		//static �������ѳ��´�. void ��ȯ���� �־���Ѵ�.
		//main ���� ���� �о��ִ� �κ� ����
		//�� �� �迭�� �ʱ�ȭ int a[]= new int [5]
		//int [] a
		a = new int[5]
		*/
		int aVal;
		int bVal;
				
		int tot;
		/*
		args=new String[2];//�޸�
		args[0]="1";
		args[1]="2";
		*/
		
		if(args.length==3) {
			//String -> int 
			aVal=Integer.parseInt(args[0]);
			bVal=Integer.parseInt(args[1]);
			
			//ture�� ���ؼ� �����Ű�
		}else {
			aVal=0;
			bVal=0;
			
			//false���� ������
		}
		
		tot=aVal + bVal;
		System.out.println(tot);
		
		
	}

}
