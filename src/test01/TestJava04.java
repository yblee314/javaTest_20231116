package test01;

public class TestJava04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 20, b = 9;
		int result1, result2;
		double result3;
		
		result1 = a + b;
		result3 = a / b; //정수와 정수간 나눗셈은 소수점 이하 날림
				System.out.println(result3);
		
		double result4;
		
		result4 = 10/3.0;
		System.out.println(result4);
		
		String str1 = "1120";
		int intStr = Integer.parseInt(str1);
		System.out.println(intStr);
		
		int intStr2 = 1000;
		String str2 = String.valueOf(intStr2);
		System.out.println(str2);		

	}

}
