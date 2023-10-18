package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Given a list of strings, find out those strings which start with a number?
//Character.isDigit() method
public class FindStringsStartsWithNumber {

	public static void main(String[] args) {

		 List<String> listOfStrings = Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "Six");
		 
		 List<String> listOfStringStartsWithDigit = listOfStrings.stream()
		 .filter(str->Character.isDigit(str.charAt(0)))
		 .collect(Collectors.toList());
		 
		 
		 System.out.println(listOfStringStartsWithDigit);
	}

}
