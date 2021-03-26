package s0326;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileIOMain01 {

	public static void main(String[] args) {

		// 키보드에서 엔터가 나올때까지 입력받은 문자를 화면에 출력, 바이트와 문자 스트림에 대한 얘기 ㄹ램에 있는 값을 파일에 저장, 파일에 있는 데이터를 메모리에 가지고 오기 파일이키보드를, 모니터를 대체할 수 있음, 이렇게 기본 입력장치 대신에 파일이 입력장치가 될 수 있고, 기본 출력장치인 모니터 대신에 할 수 있음

		System.out.println("입력을 하세요. ctrl+z를 누르면 종료합니다.");
		
		
		InputStream is = System.in; //바이트 스트림을 문자 스트림을 쓸거야
		InputStreamReader isr = new InputStreamReader(is); // 문자로 나올 수 있도록 하는 것
		
		
		try {
			while(true) {
				int c =isr.read();   // 읽어오는 것이 바이트 스트림에서 문자 스트림으로 변경된 것, 이제 한글 입력 가능
				if(c==-1) break;
				System.out.print((char) c);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
//		int c = isr.read(); //이거를 사용하기 위해서는 예외 처리를 해주어야함
		
		
		
		
	/*	
		InputStream is = System.in; // 인풋스트림을 통해 입력받는데, 바이트 단위로

		// 바이트 단위에서 하나씩 읽어올 수 있는 것
		while (true) {

			int c = is.read(); // 아스키 값을 리턴함(int), 읽은 바이트가 파일의 끝이면 -1=> 읽을 것이 없는 경우 실패 -1
			if(c==-1) break;
			System.out.print((char)c);
		}
	*/	
	
	}
	
	
	

}
