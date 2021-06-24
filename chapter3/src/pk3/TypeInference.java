package pk3;
//자바 version 10이상
public class TypeInference {

	public static void main(String[] args) {
		
		int i=10;
		var j=10.0; //double j=10.0;
		var str="hello"; //String str="hello"
		
		i=100;
		str="test";
		j=10.5;
		
		//str=3; Type Error (한번선언된 type은 변경안됨)
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
	}

}
