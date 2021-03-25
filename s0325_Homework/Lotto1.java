package s0325_Homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lotto1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int arr[] = new int [6];
		int lottoNum;
		
		System.out.println("게임수를 입력하세요.");
		
		int num = sc.nextInt();
		sc.nextLine();
		
		for(int i=0; i<arr.length; i++) {
			lottoNum= r.nextInt(45)+1;
			arr[i] = lottoNum;			
		}
		for(int i=1; i<=num; i++) {	
			System.out.println("게임" + i + Arrays.toString(arr) );
			
		}
	} 
	
	
}

