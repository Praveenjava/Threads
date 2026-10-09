package in.praveenit.th;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepatedElements {

	public static void main(String[] args) {

		String str = "Java is a good programming language";

		Character result = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, // maintains insertion order
						Collectors.counting()))
				.entrySet().stream().filter(e -> e.getValue() == 1).map(Map.Entry::getKey).findFirst().orElse(null);

		System.out.println(result); // J
	}
}
