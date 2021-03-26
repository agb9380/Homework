package s0326;

import java.util.HashMap;
import java.util.Map;

//employee와 car 객체를 리턴하고 싶다.. 같은 종류의 타입이 아닌 것들을 리턴하고 싶다, 여러 개 리턴하고 싶으면 배열과 콜렉션
// 쓰면 되는데.. 같은 타입이 아닌것들은 오브젝트 배열에 넣기

//class MemberInfo {
//	private Member m;
//	MemberInfo(Member m, Car c) {
//		// 교수님꺼 봐야함
//		
//	}
//}

//class Test {
//
//	public void returnTest() {
//		
//		Member m =new Member();
//		Car c = new Car();
//		
//		Object arr = new Object[2];
//		arr[0]=m;
//		arr[1]=c;
//		
//		return m,c;
//	}

//	public Map<String, Object>returnTest2() {
//		
//		Member m =new Member();
//		Car c = new Car();
//		
//		Map<String, Object> map = new HashMap<>();   // 오브젝트로 들어갔으니까 명시적 형변환을 해주어야함
//		map.put("member", m); 
//		map.put("car, c)
//	
//	return map
//	}

//	public MemberInfo returnTest3() {  // 클래스를 만들어서 두 개를 리턴하는 방법(위와 다른 또 다른 방법으로 할 수도 있다는 것)
//
//		Member m = new Member();
//		Car c = new Car();
//
//		MemberInfo info = new MemberInfo(m, c);
//
//		return info;
//	}
//
//}

class Member {
	private String name;
	private String phone;

	public Member() {
		super();
	}

	public Member(String name, String phone) { // 자동완성 사용
		super();
		this.name = name;
		this.phone = phone;
	}

//	@Override // 소스 자동 해시&equals 자동완성 => 내가 직접 만들필요없다.. 해시코드까지 필요한 경우는 자동완성해버리자
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
//		return result;
//	}
//
//	@Override // 소스 자동 해시&equals 자동완성
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Member other = (Member) obj;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
//		if (phone == null) {
//			if (other.phone != null)
//				return false;
//		} else if (!phone.equals(other.phone))
//			return false;
//		return true;
//	}

	@Override // 소스-> 자동완성,, 이거 사용하는 형태는 이해하고 있어야함!!!
	public boolean equals(Object obj) {

		boolean result = false; // 같다 다르다면 출력하면 됨

		Member mem = (Member) obj; // 밑에 꺼 안되기 때문에 명시적 형변환

		// this.name.equals(obj.name); //object가 접근할 수 있는 범위는 자기 자신.. 여기 name은 member.. 그래서
		// 명시적 형변환해서 접근해야함

		if (this.name.equals(mem.name) && this.phone.equals(mem.phone)) { // Member 클래스안에 선언되어있으니까 그냥 name, phone은 m의 값을 가르킴
			result = true;
		}

		return result;
	}

}

class Car {
	private String name;
	private String id; // 차량 번호

	public Car() {
		super();
	}

	public Car(String name, String id) { // 자동완성 사용
		super();
		this.name = name;
		this.id = id;
	}

}

public class MapMain02 {
	public static void main(String[] args) {

		Map<Member, Car> carList = new HashMap<Member, Car>();
	
	
		// map.put(key,value)
		carList.put(new Member("홍길동", "010-1111-2222"), new Car("소나타", "16소1212"));
		carList.put(new Member("윤길동", "010-1113-3222"), new Car("모닝", "15소1212"));
		carList.put(new Member("박길동", "010-1115-4222"), new Car("그렌져", "14소1212"));
		carList.put(new Member("강길동", "010-1116-5222"), new Car("카니발", "13소1212"));

		System.out.println("등록대수: " + carList.size()); // map에 몇개가 있는지
		carList.put(new Member("홍길동", "010-8888-9999"), new Car("SM3", "25다3434")); // 동명이인이 있을 수 있음
		System.out.println("등록대수: " + carList.size());

		carList.put(new Member("홍길동", "010-1111-2222"), new Car("제네시스", "42너3524")); // value가 업데이트 될 것임
		System.out.println("등록대수: " + carList.size()); // 업데이트한 것이기 때문에 등록대수가 5가 나와야하는데 6이 나왔음 ==> 왜 중복을 구분하지 못할까? =>
														// map에서 주소값 비교한 것(주소와 주소를 비교해서 다르다고 나온 것).. 우리는 멤버가 가지고있는 name과
														// phone을 비교해서 같았을때만 같았다고 해야함
		// 맵은 키에 대한 중복을 허용하지 않음, map의 키값을 비교할 때는 .equals를 이용함, 객체에 있는 각각의 멤버 변수들을 비교해야함,
		// 오브젝트는 주소값만을 비교하게 만들어 놓음..

//		해시코드가 같으면서 equals 가 true인 경우에 같다라고 판단..
//		Member m = new Member("홍길동" ,"010-1111-2222");
//		Member m2 = new Member("홍길동" ,"010-1111-2222");
//		Member m3 = new Member("홍길동" ,"010-5111-2222");
//		System.out.println(m);
//		System.out.println(m2);
//		System.out.println(m3);

	
		  Member m = new Member("홍길동", "010-1111-2222"); 
		  Member m2 = new Member("홍길동","010-1111-2222"); // 이 둘은 주소값만 비교하면 다른 사람으로 나옴.. new로 만들었으니까,, equals를 오버라이드해주어야함!!!=> Member 클래스로 이동
		  
		  if(m.equals(m2)){ //이렇게 비교해야함
			  System.out.println("같은 사람"); 
		  }else {
		  System.out.println("다른 사람"); }
		

	}

}
