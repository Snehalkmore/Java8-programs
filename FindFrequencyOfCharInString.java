package practice;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// How do you find frequency of each character in a string using Java 8 streams?
//groupingby function
public class FindFrequencyOfCharInString {

	public static void main(String[] args) {

		String inputString = "Java Concept Of The Day";
		
		//one way
		Stream.of(inputString.replaceAll(" ", "").split(""))
		.sorted()
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet()
		.forEach(s->System.out.print(s+" "));
		System.out.println();
		
		//another way
		Map<Character,Long> map = inputString
		.chars()
		.mapToObj(c->(char)c)
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	
		System.out.println(map);
	
	}

}
