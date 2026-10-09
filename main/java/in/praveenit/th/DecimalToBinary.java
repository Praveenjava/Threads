package in.praveenit.th;

import java.util.Scanner;

public class DecimalToBinary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int num = sc.nextInt();

		// handle 0 case
		if (num == 0) {
			System.out.println("0");

			return;
		}

		String binary = "";
		int n = num;

		// repeatedly divide by 2 and collect remainders
		while (n > 0) {
			int remainder = n % 2; // get last bit
			binary = remainder + binary; // prepend bit
			n = n / 2; // divide by 2
		}

		System.out.println("Binary: " + binary);
	}
}
