package O6;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;

public class SockMerchant {
	public static void main(String[] args) {
		List<Integer> pair = Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20);
		int n = pair.size();
		System.out.println("pair: " + sockMerchant(n, pair));
	}

	public static int sockMerchant(int n, List<Integer> arr) {
		Map<Integer, Integer> pair = new HashMap<>();
		int count = 0;
		int a = arr.size();
		for (int i = 0; i < a; i++) {
			if (pair.containsKey(arr.get(i))) {
				pair.put(arr.get(i), pair.get(arr.get(i)) + 1);
			} else {
				pair.put(arr.get(i), 1);
			}
		}
		for (Map.Entry<Integer, Integer> paired : pair.entrySet()) {
			if (paired.getValue() != null) {
				count += paired.getValue() / 2;
			}
		}
		return count;
	}
}
