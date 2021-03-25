package s0325;

import java.util.Random;

class A{

	private Object obj; // 자료형이 오브젝트인 변수 선언

	public A(Object obj) {
		this.obj = obj;
	}

	public void setObj(Object obj) { // obj값 세팅
		this.obj = obj;
	}

	public Object getObj() {
		return this.obj;
	}

	public void info() {
		System.out.println("obj :" + obj);
	}
}

	class B<T> {
		private T obj; // 어떤 타입의 데이터든 접근할 수 있도록 T로

		public B(T obj) {
			this.obj = obj;
		}

		public void setObj(T obj) {
			this.obj = obj;
		}

		public Object getobj() {
			return this.obj;
		}

		public void info() {
			System.out.println("obj :" + obj);
		}

	}

public class test {

	public static void main(String[] args) {

		A a01 = new A(new String("hello")); // A가 오브젝트형이기 때문에 모든 타입의 데이터를 받을 수 있음, 묵시적 형변환
		A a02 = new A(new Random());

		a01.info();
		a02.info(); // 이렇게 저장은 할 수 있지만, 이 데이터에 접근하는게 어려움

//		System.out.println("길이 :" + ((String)a01.getObj()).length()); // 접근하기 위해서는 이렇게 명시적 형변환을 해주어야함
		
		B<String> b01 = new B<String> (new String ("hello"));
		b01.getobj().length();

	}
}
