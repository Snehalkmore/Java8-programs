package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//From the given list of integers, 
//print the numbers which are multiples of 5?
public class FindNumbersFromListDivisibleBy5 {

	public static void main(String[] args) {

		List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
	
		List<Integer> listOfNumbersDivisibleBy5 = listOfIntegers.stream()
		.filter(i->i%5==0)
		.collect(Collectors.toList());
		
		System.out.println(listOfNumbersDivisibleBy5);
	}

}
