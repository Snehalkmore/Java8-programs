package practice;

import java.util.stream.IntStream;

//Palindrome program using Java 8 streams
public class Palindrome {

	public static void main(String[] args) {
		String str = "ROTATOR";
		
		boolean isPalindrome = IntStream.range(0, str.length()/2)
		.noneMatch(i->str.charAt(i)!=str.charAt(str.length()-i-1));
		
		System.out.println(isPalindrome);

	}

}
