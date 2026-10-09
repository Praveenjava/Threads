package in.praveenit.th;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingChar {
	public static void main(String[] args) {
		String str = "Java is a good programming language";
		Entry<Character, Long> orElse = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(n -> n.getValue() == 1).findFirst().orElse(null);
		System.out.println(orElse);
	}

}
