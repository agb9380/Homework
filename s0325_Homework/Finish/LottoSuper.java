package s0325_Homework.Finish;

import java.util.Scanner;

public abstract class LottoSuper {
	
	public abstract void execution();
	
	public int inputNum() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		return num;

	}
}
