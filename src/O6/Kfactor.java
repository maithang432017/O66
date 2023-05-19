package O6;

import java.util.ArrayList;
import java.util.List;

public class Kfactor {
	public static void main(String[] args) {
		int n = 7;
		int k = 2;
		System.out.println("K value:" + kFator(n, k));

	}

	public static int kFator(int n, int k) {
		List<Integer> factorK = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				factorK.add(i);
			}
		}
		if (k <= factorK.size()) {
			return factorK.get(k - 1);
		} else {
			return -1;
		}
	}
}
