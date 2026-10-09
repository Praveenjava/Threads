package in.praveenit.th;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostRepeatedWord {
	public static void main(String[] args) {
		List<String> asList = Arrays.asList("Java", "Python", "DotNet", "Java", "Go", "Java", "DotNet", "Go");
		String orElse = asList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElse(null);
		System.out.println(orElse);

	}

}
