package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Given a list of integers, separate odd and even numbers?
//use particioning

public class SeperateOddEvenNumberFromList {

	public static void main(String[] args) {
		List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);

		listOfIntegers.stream()
		.collect(Collectors.partitioningBy(i->i%2==0))
		.entrySet()
		.forEach(s->System.out.println(
				(s.getKey().equals(true)?"even = ":"odd = ")
				+s.getValue()
				)
				);
		
		
	}

}
