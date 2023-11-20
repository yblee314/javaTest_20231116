package test01;

public class TestJava01 {

	public static void main(String[] args) { //main 매소드
		// TODO Auto-generated method stub
		// 주석문(라인주석:한줄만, /* 여러줄 주석 */)
		// a=10
		// print(a)
		int a = 10; // 정수형 변수 a를 선언하고 정수 10을 저장
		double b = 10.5; //실수형 변수 b를 선언하고 실수 10.5를 저장
		int c; //정수형 변수 c를 선언만!!
		c = 100; //정수형 변수 c에 100을 저장
		
		int result = a + c;
		System.out.println(result);
		
		int value;
		// int res = value + 10; value값이 초기화 되어 있이 않아 에러 발생
		
		System.out.println(c);
		System.out.println("c의 값은 "+c+"입니다.");

	}

}
