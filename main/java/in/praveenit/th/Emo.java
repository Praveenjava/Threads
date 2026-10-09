package in.praveenit.th;

import java.util.Map;
import java.util.stream.Collectors;

public class Emo {
	public static void main(String[] args) {
		Map<Integer, String> map1 = Map.of(1, "Name", 2, "Name2");
		Map<String, String> map2 = Map.of("Name", "TEST", "Name2", "TEST2");

		Map<Integer, String> collect = map1.entrySet().stream()
				.collect(Collectors.toMap(Map.Entry::getKey, e -> map2.get(e.getValue())));

		System.out.println(collect);

	}

}
