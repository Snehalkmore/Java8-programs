package practice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

//How do you extract duplicate elements from an array?

public class ExtractDuplicateElementFromArray {

	public static void main(String[] args) {

		 List<Integer> listOfIntegers = Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);
         
		 List listOfDuplicateElement = listOfIntegers.stream()
		 .sorted()
		 .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		 .entrySet()
		 .stream()
		 .filter(s->(s.getValue()>1))
		 .map(s->s.getKey())
		 .collect(Collectors.toList());
		 
		 System.out.println(listOfDuplicateElement);
	}

}
