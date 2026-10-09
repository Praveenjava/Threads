package in.praveenit.th;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ConsecutiveGroups {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 5, 6, 12, 13 };

		List<List<Integer>> result = new ArrayList<>();

		List<Integer> temp = new ArrayList<>();
		temp.add(arr[0]);

		IntStream.range(1, arr.length).forEach(i -> {
			if (arr[i] == arr[i - 1] + 1) {
				temp.add(arr[i]);
			} else {
				result.add(new ArrayList<>(temp));
				temp.clear();
				temp.add(arr[i]);
			}
		});

		result.add(temp);

		result.forEach(System.out::print);
	}
}
