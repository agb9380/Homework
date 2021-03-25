package s0325_Homework.Finish;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Lotto3 extends LottoSuper {

	public void execution() {
		System.out.println("게임수를 입력하세요: ");
		int cnt = inputNum();

		for (int i = 1; i <= cnt; i++) {
			System.out.println("게임" + i + ": " + shuffleNum());
		}
	}

	public String shuffleNum() {
		ArrayList list = new ArrayList();
		ArrayList newList = new ArrayList();

		for (int i = 1; i <= 45; i++) {
			list.add(i);
		}

		Collections.shuffle(list);

		for (int i = 0; i < 6; i++) {
			newList.add(list.get(i));
		}

		Object[] arr = newList.toArray();
		return Arrays.toString(arr);

	}

}
