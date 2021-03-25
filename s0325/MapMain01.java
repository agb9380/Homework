package s0325;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
 * Map: key, value의 쌍으로 구성된 데이터의 집합, 키에 대한 중복(x), 순서(x)
 * 구현 클래스 : HashMap, TreeMap
 */



public class MapMain01 {

	
	public static void main(String[] args) {
		
		// key: ID ,value: password
		Map<String, String> map = new HashMap<>();
		map.put("aaa", "1111");
		map.put("bbb", "2222");
		map.put("ccc", "3333");
		map.put("ddd", "4444");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("패스워드 변경 서비스입니다.");
		System.out.println("ID를 입력하세요 :");
		
		String id = sc.nextLine(); // id가 없으면 변경서비스를 할 필요가 없음
		if(!map.containsKey(id)) {
			
			System.out.println("입력하신 ID [" + id + "]는 존재하지 않습니다.");
			System.out.println("서비스를 종료합니다.");
			System.exit(0);
		}
		System.out.println("현재 패스워드를 입력하세요: ");
		String password = sc.nextLine();
		if (!map.get(id).equals(password)) { //key에 해당하는 value값 알기위한 get, 문자열과 문자열 비교는 .equals 해야함!!! == 은 주소값 비교...
			System.out.println("패스워드가 다릅니다.");
			System.out.println("서비스를 종료합니다.");
			System.exit(0);
			
		}
		System.out.println("변경할 패스워드를 입력하세요 :");
		String newPassword =sc.nextLine(); 
		// 맵은 키에 대한 중복만 허용하지 않음, 키에 대한 중복 데이터는 value값 덮어쓰기, 업데이트됨
		
		map.put(id, newPassword);
		
		System.out.println("패스워드가 변경되었습니다.");
		
		
		System.out.println( "<<전체 회원정보 출력>>");
		/*
		Set<Map.Entry<String,String>> entrySet = map.entrySet();
		
		//set형이니까 1.5 for 가능
		for (Map.Entry<String, String> e : entrySet) {
			System.out.println("ID: "+ e.getKey()+", password :" + e.getValue());
		}
		*/
		
		
		Set<String> keys = map.keySet();
		for(String key : keys) {
			System.out.println("ID: "+ key + ", password: " + map.get(key));
		}
		
		
		
	
	
	}

}
