package s0325_Homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lotto4 {

	public void execution() {
		System.out.println("게임수를 입력하세요: ");
		int cnt = inputNum();

		for (int i = 1; i <= cnt; i++) {
			System.out.println("게임" + i + ": " + containNum());
		}
	}

	public int inputNum() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		return num;

	}
	
	public String containNum() {
		Random r = new Random();
		int num;

		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(r.nextInt(45) + 1);
		num = r.nextInt(45) + 1;

		while (list.size() <= 5) {
			num = r.nextInt(45) + 1;
			if (!list.contains(num)) {
				list.add(num);
			}
		}
		
		Object[] arr = list.toArray();
		return Arrays.toString(arr);
	}
}
