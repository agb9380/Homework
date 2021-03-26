package s0326;

import java.util.ArrayList;
import java.util.List;

/*
 *  기본자료형 Wrapper클래스 (때에 따라서는 기본자료형을 쓸 수 없고, 참조자료형을 써야할 일이 있음)
 *  boolean Boolean
 *  char	Character
 *  byte	Byte
 *  short	Short
 *  int		Integer
 *  long	Long
 *  float	Float
 *  double	Double
 */


public class WrapperMain {

	public static void main(String[] args) {
		
		ArrayList<Integer> list =new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		
		int i =123;
		Integer i2 = new Integer(123);		
		Integer i3 = 123; // auto boxing  기본자료형 변수를 클래스 형태로 만들어주는 것 
		int i4 = new Integer(123); // auto unboxing  박스를 뜯어서 그 안에 들어있는 실제 값을 넣어줌, 기본 자료형만 뽑아내는 것
		
		
		System.out.println("i :" + i);
		System.out.println("i2 :" + i2);
		System.out.println("i3 :" + i3);  
		System.out.println("i4 :" + i4);  
		
		String str = "10234";
		
		
		int num = Integer.parseInt((str)); //숫자 문자를 정수로 변경
		//int num = Integer.valueOf(str); // String에 들어있는 것들을 정수로 변환, parseInt와 차이는 리턴값이 다르다, 아래꺼는 인티저 참조 자료형 변수 리턴, 위에꺼는 리턴값이 기본 자료형 int
		System.out.println(num+100);

	}

}
