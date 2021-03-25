package s0325_Homework.Finish;

import java.util.ArrayList;
import java.util.Random;

public class Lotto1 extends LottoSuper {

	
	@Override
	public void execution() {
		System.out.println("게임수를 입력하세요.");
		int cnt = inputNum();
		for (int i = 1; i <= cnt; i++) {
			System.out.println("게임" + i + ": " + makelotto());
		}

	}

	public ArrayList makelotto() {
		Random r = new Random();
		ArrayList list = new ArrayList();

		for (int i = 1; i <= 6; i++) {
			list.add((r.nextInt(44) + 1)); // 중복값 체크해야함
		}
		return list;
	}

}