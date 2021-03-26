package s0326;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileIOMain03 {

	// dog.jpg -> dog3.jpg 복사

	public static void main(String[] args) {

		FileInputStream fis = null; // 바이트 단위로 움직임
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;

		try {
			long start =System.currentTimeMillis();
			
			fis = new FileInputStream("iodata/dog.jpg"); // 읽어서
			fos = new FileOutputStream("iodata/dog3.jpg"); // 여기에 저장

			// 버퍼사용 객체 연결
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);

			// 복사 수행
			while (true) {
				int c = bis.read();
				if (c == -1)
					break;
				bos.write(c);
			}
			
			long end =System.currentTimeMillis();
			
			System.out.println("dog3.jpg에 복사완료...");
			System.out.println("소요시간: " + (end-start)/1000. + "초"); // 버퍼를 사용하는게 훨씬 빨라짐

		} catch (Exception e) {
			e.printStackTrace();
		}finally { // 오프한 순서 반대로 닫아주어야함
			
			
			FileClose.close(bis);
			FileClose.close(bos); 
			FileClose.close(fis);
			FileClose.close(fos);
			
			if(bis !=null) {			
				try {
					bis.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if(bos !=null) {			
				try {
					bos.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if(fis !=null) {			
				try {
					fis.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			if(fos !=null) {			
				try {
					fos.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			
		}

	}

}
