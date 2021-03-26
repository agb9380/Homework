package s0326;

import java.io.InputStream;
import java.io.OutputStream;

public class FileClose {

	public static void close(InputStream is) { // 명시적 형변환을 쓰면 오버로드 필요없음

		
		if (is != null) {

			try {
				is.close();
			} catch (Exception e) {
				e.printStackTrace();
				// TODO: handle exception
			}

		}

	}

	public static void close(OutputStream os) {

		if (os != null) {

			try {
				os.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}
}
