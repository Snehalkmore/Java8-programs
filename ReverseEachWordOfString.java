package practice;

import java.util.stream.Collectors;
import java.util.stream.Stream;

//Reverse each word of a string using Java 8 streams?

public class ReverseEachWordOfString {

	public static void main(String[] args) {
		String str = "Java Concept Of The Day";
		
		String reversedWordsString = Stream.of(str.split(" "))
		.map(s->new StringBuffer(s).reverse().toString())
		.collect(Collectors.joining(" "));
		
		System.out.println(reversedWordsString);
		

	}

}
