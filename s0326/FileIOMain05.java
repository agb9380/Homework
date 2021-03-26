package s0326;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

import kr.ac.kopo.util.FileClose;

public class FileIOMain05 {

	public static void main(String[] args) {

		write();
		read();
	}
	
	
	public static void read() {
		FileInputStream fis= null;
		DataInputStream dis = null;
		
		
		
		try {
			
			fis =new FileInputStream("iodata/dogInfo.txt");
			dis  = new DataInputStream(fis);
			
			String data = dis.readUTF();
			System.out.println(data);
			
			String[] strArr =data.split(":");
			System.out.println(Arrays.toString(strArr));
			
			Dog d = new Dog()
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}finally {
			FileClose.close(dis);
			FileClose.close(fis);
		}
	}
	
	public static void write() {
		Dog d =new Dog ("앙꼬",4,"푸들"); 
		
		
		
		FileOutputStream fos =null;
		DataOutputStream dos =null;
		
		try {
			
			fos = new FileOutputStream("dogInfo.txt");
			dos = new DataOutputStream(fos);
			
			dos.writeUTF(d.getName()+":"+d.getAge()+":"+ d.getKind()); // String을 저장하도록 함
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}finally {
			FileClose.close(dos);
			FileClose.close(fos);
		}
		System.out.println("dogInfo.txt에 저장완료...");
		
		
		
	}

}
