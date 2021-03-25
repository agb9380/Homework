package s0325_Homework;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lotto1 {

	public ArrayList makelotto() {
		Random r = new Random();
		ArrayList list = new ArrayList();

		for (int i = 1; i <= 6; i++) {
			list.add((r.nextInt(44) + 1));
		}
		return list;
	}

	public void execution() {
		System.out.println("게임수를 입력하세요.");
		int cnt = inputNum();
		for (int i = 1; i <= cnt; i++) {
			System.out.println("게임" + i + ": " + makelotto());
		}

	}

	public int inputNum() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		return num;
	}

}