package test01;

public class TestJava03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char chr = 'A';
		int chrInt = chr;
		
		char a = 65;
		
		String str = "Korea\nJapan";
		
		System.out.println(chr);
		System.out.println(chrInt);
		System.out.println(a);
		System.out.println(str);
		
		double c = 3.14;
		float d = 3.14f; //끝에 f를 붙여야
		long e = 100000L;
		
		boolean k = true;
		
		int intValue = 10;
		byte byteValue = (byte)intValue;
		System.out.println(byteValue);
		
		double dValue = 10.123;
		int iValue = (int)dValue; //강제 타입변환(임시형)		
		System.out.println(iValue);//소수점 이하는 버림		

	}

}
