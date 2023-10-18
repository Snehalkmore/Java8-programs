package practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

//How do you find the most repeated element in an array?
public class MostFrequentElementInArray {

	public static void main(String[] args) {

		 List<String> listOfStrings = Arrays.asList(
				 "Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");

		  Entry<String, Long> mostFrequentElement =listOfStrings.stream()
		 .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		 .entrySet().stream()
		 .max(Map.Entry.comparingByValue())
		 .get();
		  
		  System.out.println("most repeated key: "+mostFrequentElement.getKey()
		  +" which is repeated for : "+mostFrequentElement.getValue());

		 
		  
	}

}
