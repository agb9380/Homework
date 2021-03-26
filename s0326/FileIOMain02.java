package s0326;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * iodata/dog.jpg -> iodata/dog2.jpg 복사
 * [dog.jpg 입력]
 * dog.jpg 파일의 메모리를 가져온다음에 메모리에서 dog2.jpg 파일로
 * 
 * 
 * 입출력의 작업순서
 * 1. stream open
 * 2. read /write
 * 3. stream close
 */

public class FileIOMain02 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try { // 파일이 없을 수도 있으니까 예외 처리 해주기
		// 1. stream open
			fis = new FileInputStream("iodata/dog.jbp");
			fos = new FileOutputStream("iodata/dog2.jpg"); // 만들어진 dog2를 보면 0바이트.. 통로만 연결시킨 것이기 때문임

		// 2. read / write ctrl + z 나올때까지
			while (true) {

				int c = fis.read();
				if (c == -1)
					break;

				// fos에 저장하면됨
				fos.write(c);
			}
			
			long end = System.currentTimeMillis();
			System.out.println("복사완료...");
			System.out.println("소요시간: " + (end-start) / 1000. + "초"); // 소요시간이 많이 걸리므로, 이것을 해결하기 위해 버퍼인풋스트림, 버퍼아웃풋스트림
			//성공하던 실패하던 반드시 스트림을 끊어야함!! ==> finally
			
			
//			데이터의 일관성을 위해서 내가 다 보고난 다음에 수정해야함! 여기서 강아지 사진 복사하는데 프로그램정지 했을 때 실제 파일 복사 끝남
			
//			while(true); //일관성 확인하기 위해 사용함
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//성공하던 실패하던 반드시 스트림을 끊어야함!! ==> finally  // try 블럭에서 만들어서 안써짐, fis 변수는 try문 밖에 있어야함
		// 3. stream close()
			
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}

	}
}