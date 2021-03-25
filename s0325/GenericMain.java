package s0325;

import java.util.Random;

class B<T>{  //이 B형에다가 어떤 타입을 넣을지 명시하고 싶음, 원래는 오브젝트형이었는데 내가 동적으로 변경해주고 싶음
	private T obj;
	
	public B(T obj) {
		this.obj = obj;
	}
	
	public void setObj(T obj) {
		this.obj = obj;
	}
	
	public Object getObj() {
		return this.obj;
	}
	
	public void info() {
		System.out.println("obj :" + obj);
	}
}

class A{
	private Object obj;
	
	public A(Object obj) {
		this.obj = obj;
	}
	
	public void setObj(Object obj) {
		this.obj = obj;
	}
	
	public Object getObj() {
		return this.obj;
	}
	
	public void info() {
		System.out.println("obj :" + obj);
	}
	
	
}


public class GenericMain{ 
	
	public static void main(String[] args) {
		
		A a01 =new A(new String("hello"));  //A가 오브젝트니까 묵시적 형변환으로 모든 타입을 받을 수 있음
		A a02 =new A(new Random());
		
		a01.info();
		a02.info();
		

		
//		System.out.println("길이 :" + (String) a01.getObj().length()); 
		
		B<String> b01 = new B<String> (new String("Hello")); //스트링형을 가지고 있는 객체를 만들고 싶음, 위의 T가 String으로 형변환이 일어남, 자동으로 명시적 형변환이 일어남
		B<Random> b02 = new B<Random> (new Random());
		
		
		b01.info();
		b02.info();
	
		((String) b01.getObj()).length();
				
				
	}
}