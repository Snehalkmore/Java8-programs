package practice;

import java.util.stream.IntStream;

// Print first 10 even numbers
public class PrintFirst10EvenNumbers {

	public static void main(String[] args) {

		IntStream.rangeClosed(1, 10)
		.map(i->i*2)
		.forEach(s->System.out.println(s));
	}

}
