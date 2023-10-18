package practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//How do you get three maximum numbers and three minimum numbers from the given list of integers

//use limit 
public class Find3MaxAnd3MinNumbersFromList {

	public static void main(String[] args) {

		List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
		
		List minimum3Numbers= listOfIntegers.stream()
		.sorted()
		.limit(3)
		.collect(Collectors.toList());
		
		System.out.println("minimum3Numbers: "+minimum3Numbers);
		
		List maximum3Numbers = listOfIntegers.stream()
		.sorted(Comparator.reverseOrder())
		.limit(3)
		.collect(Collectors.toList());
		
		System.out.println("maximum3Numbers: "+maximum3Numbers);
		
		
		
	}

}
