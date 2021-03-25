package s0325;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
 * 순서(x), 중복(x)
 * 장점: 검색속도 빠름
 * 구현클래ㅅ: HashSet, TreeSet
 */

public class SetMain {
	public static void main(String[] args) {
		
//		Set<String> set = new HashSet<>();
		Set<String> set = new TreeSet<>(); // 트리셋으로 출력하면 사전순으로 나옴 a~z
		
		
		
		boolean bool = set.add("one") ;  // 불린이 트루면 삽입 성공
		System.out.println("데이터 삽입 여부: "+ (bool ? "성공" : "실패"));
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("four");
		set.add("five");
		set.add("five");
		bool = set.add("one") ;  // 불린이 트루면 삽입 성공
		System.out.println("데이터 삽입 여부: "+ (bool ? "성공" : "실패"));
		
		//리스트는 데이터를 출력하는 방법이 4가지였음, set은 인덱스를 사용할 수 없음
		
		/*
		 * set의 전체 데이터 출력 방식
		 * 1. 1.5버전의 for문은 사용할 수 있음
		 * 2. iterator() 메소드 이용
		 * 3. toArray() 메소드 이용
		 */
		
		System.out.println("< 1.5버전 for문 이용 출력 >");
		for(String str : set) {
			System.out.println(str);
		}
		
		
		System.out.println("< iterator() 이용 출력 >");
		Iterator<String> ite = set.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		
		System.out.println("< toArray() 이용 출력 >");
	
		Object[] arr = set.toArray();
		System.out.println(Arrays.toString(arr));
	
	
	
	
	
	
	}

}
