package in.praveenit.th;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class ThirdheighestName {
	public static void main(String[] args) {
		List<String> asList = Arrays.asList("Praveen", "Viya", "Bhaska");
		String orElse = asList.stream().sorted(Comparator.comparingInt(String::length).reversed()).skip(2).findFirst()
				.orElse(null);
		System.out.println(orElse);
	}

}
