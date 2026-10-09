package in.praveenit.th;

import java.util.stream.Stream;

public class ParellelDemo {

	public static void main(String[] args) {

		System.out.println("====== Serial Stream ========");
		Stream<Integer> ss = Stream.of(1, 2, 3, 4);
		ss.forEach(n -> System.out.println(n + " :: " + Thread.currentThread()));

		System.out.println("====== Parallel Strem =======");
		Stream<Integer> ps = Stream.of(1, 2, 3, 4);
		ps.parallel().forEach(n -> System.out.println(n + " :: " + Thread.currentThread()));
	}
}
