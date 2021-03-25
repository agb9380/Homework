package s0325_Homework;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Lotto2 {

	public void execution() {
		System.out.println("게임수를 입력하세요: ");
		int cnt = inputNum();

		for (int i = 1; i <= cnt; i++) {
			System.out.println("게임" + i + ": " + setNum());
		}
	}

	public int inputNum() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		return num;

	}

	public String setNum() {
		HashSet set = new HashSet(); // 중복x 순서x
		Random r = new Random();

		while (set.size() <= 5) {
			set.add((r.nextInt(44) + 1));
		}

		Object[] arr = set.toArray();

		return Arrays.toString(arr);
	}

}
