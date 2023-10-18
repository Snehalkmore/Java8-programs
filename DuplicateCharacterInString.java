package practice;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Print duplicate characters in a string?
public class DuplicateCharacterInString {

	public static void main(String[] args) {

		String inputString = "Java Concept Of The Day";

		String removedSpace = inputString.replaceAll(" ", "").toLowerCase();
		
		List listOfDuplicateCharacters = Stream.of(removedSpace.split(""))
		.sorted()
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet()
		.stream()
		.filter(s->(s.getValue()>1))
		.map(s->s.getKey())
		.collect(Collectors.toList());
		
		System.out.println(listOfDuplicateCharacters);
		
		
	}

}
