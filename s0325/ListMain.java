package s0325;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/*
 *  List : 순서(o) 중복(o)
 *  구현클래스:ArrayList, LinkedList
 *  
 *  
 *  주요 메소드
 *  add() : 데이터 입력
 *  get() : 해당 인덱스에 있는 데이터 추출
 *  remove() : 데이터 삭제
 *  size() : 데이터 전체 개수
 *  clear() : 전체 데이터 삭제
 *  isEmpty() : 리스트가 비어있는지 체크(true/false)
 *  contains() : 특정 데이터의 존재 여부를 판단(true/false)
 *  Iterator() : Iterator 객체를 반환할 때 사용
 */


public class ListMain {

	public static void main(String[] args) {
		
		//문자열을 저장하는 데이터의 집합을 만들고 싶음
		
		
		List list = new ArrayList(); // 객체 형변환 list = new Linked~ 다형성을 위해
		
		List<String> list = new ArrayList<String>(); // 1.5버전의 Generic을 사용함
//		List<String> list = new ArrayList<>(); // 1.7버전 이후의 Generic 방식, 우변 <> 데이터 타입 생략가능
		
		System.out.println("원소의 총 개수: " + list.size());
		
//		list.add(1); 숫자 저장하니까 에러뜸 
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		list.add("one"); // 리스트는 중복을 허용함
		System.out.println("add one 후 리스트 크기: " list.size() );
		
		
		/*
		 * list의 전체 데이터 출력
		 * 1. 우선 리스트가 몇 개의 데이터를 가지고 있는지 확인해야함, index를 이용한 get() 메소드
		 * 2. 1.5버전의 for문을 이용
		 * 3. toArray() 메소드 이용
		 * 4. iterator() 메소드 이용
		 */
		
		
		System.out.println("get메소드를 이용한 출력방식");
		for(int i=0; i< list.size(); i++) {
			System.out.println(list(i));
		}
		
		
		System.out.println("for each를 이용한 출력방식");
		for (String str : list) //리스트의 데이터 타입이 현재 스트링형이니까
			System.out.println(str);
		
		System.out.println("toArray() 메소드를 이용한 출력방식");
		Object[] arr = list.toArray();
		
		System.out.println(Arrays.toString(arr));
		
		
		/*
		 *Iterator(순환자) 주요 메소드
		 *
		 *next() : 데이터를 추출
		 *hasNext() : 추출할 다음 데이터의 존재 여부를 판단하는 것, 추출할 데이터 또 있니 계속 물어보는 것 
		 */
		
		System.out.println("iterator() 메소드를 이용한 출력방식");
		Iterator<String> ite = list.iterator(); // 리스트에 있는 데이터에 접근하기 위한 목적인 ite, 근데 데이터가 얼마나 들어있는지 모름 => hasNext() 가 false일때까지 돌게하면 됨 
		
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		
		//two 문자열의 존재 여부를 판단
		String searchStr="two";
		if(list.contains("two")) {
			System.out.println(searchStr + "은 존재합니다.");
		}else {
			System.out.println(searchStr + "은 존재하지 않습니다.");
		}
		
		boolean bool = list.remove("two");
		System.out.println("remove: " ) ;  // remove를 이용해서 성공, 실패 여부를 확인할 수 있음
		
		System.out.println("첫 번째 문자열: " + list.get(0));
		
		String removeStr = list.remove(0);
		System.out.println("삭제된 데이터 문자열: " + removeStr);
		
		System.out.println("원소 총 개수: "+ list.size ());
		list.clear();
		System.out.println("clear 수행 후  원소 총 개수: "+ list.size ()); // 0
		
		
		List <String> sub = new LinkedList<>();
		sub.add("봄");
		sub.add("여름");
		
		list.addAll(sub);
		System.out.println("addAll() 후 원소의 개수: "+ list.size());
		
		
		
		
	}

}
