package practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Given a list of integers, find maximum and minimum of those numbers?
public class FindMaximumAndMinimumFromList {

	public static void main(String[] args) {
		
		List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
		
		Integer minimum = listOfIntegers.stream().sorted().findFirst().get();
		Integer maximum = listOfIntegers.stream().sorted(Comparator.reverseOrder()).findFirst().get();
		
		System.out.println("minimum = "+minimum+" maximum = "+maximum);
		
		minimum = listOfIntegers.stream().min(Comparator.naturalOrder()).get();
		maximum= listOfIntegers.stream().max(Comparator.naturalOrder()).get();
		
		System.out.println("minimum = "+minimum+" maximum = "+maximum);

		
	}

}
