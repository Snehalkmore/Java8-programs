package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//How do you remove duplicate elements from a list using Java 8 streams?

//use distinct method

public class RemoveDuplicateElementsFromList {

	public static void main(String[] args) {

		 List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
	
		 List<String> uniqueStrings = listOfStrings.stream()
		 .distinct()
		 .collect(Collectors.toList());
		 
		 System.out.println(uniqueStrings);
		 
	}

}
