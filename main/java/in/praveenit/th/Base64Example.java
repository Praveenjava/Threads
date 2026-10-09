package in.praveenit.th;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class Base64Example {
	public static void main(String[] args) {
		Encoder encoder = Base64.getEncoder();
		String str = "Hello@World";

		String encoded = encoder.encodeToString(str.getBytes());
		System.out.println("Original :" + str);
		System.out.println("encoded :" + encoded);
		
		System.out.println("==================");
		
		Decoder decoder = Base64.getDecoder();
		byte[] byts = decoder.decode(encoded);
		String originals = new String(byts);
		System.out.println("encoded String :"+encoded);
		System.out.println("Originals :"+originals);
		
		
	}

}
