package practice;

import java.util.stream.IntStream;

//How do you find sum of first 10 natural numbers?
public class SumOfFirst10NatualNumbers {

	public static void main(String[] args) {
		
		int sum = IntStream.rangeClosed(1, 10).sum();
		System.out.println(sum);

	}

}
