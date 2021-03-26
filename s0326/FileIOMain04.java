package s0326;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import kr.ac.kopo.util.FileClose;

public class FileIOMain04 {

		
		public static void write() {
			char c = 'A';
			int i = 97; 
			double d = 12.34;
			
			FileOutputStream fos =null;
			DataOutputStream dos =null;
			
			try {
				fos = new FileOutputStream("iodata/test.dat");
				dos = new DataOutputStream(fos);
				
				dos.writeChar(c);
				dos.writeInt(i);
				dos.writeDouble(d);
				
				System.out.println("쓰기완료...");
				
				
			} catch (Exception e) {
				e.printStackTrace();
				// TODO: handle exception
			}finally {
				FileClose.close(dos);
				FileClose.close(fos);
			}
			
		}
		
		
		public static void read() {
			FileInputStream fis = null;
			DataInputStream dis = null;
			
			try {
				fis = new FileInputStream("iodata/test.dat");
				dis = new DataInputStream(fis);
				
				char c =dis.readChar();
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				FileClose.close(dis,fis);
			}
		}
		
		
		
		public static void main(String[] args) {
			read();
			write();
		}
		
		
}
