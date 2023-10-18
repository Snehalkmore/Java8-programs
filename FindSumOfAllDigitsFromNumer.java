package practice;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//Find sum of all digits of a number in Java 8?
public class FindSumOfAllDigitsFromNumer {

	public static void main(String[] args) {

		 int i = 15623;


		 //one way
		 Integer sum= Stream.of(String.valueOf(i).split(""))
		 .map(a->Integer.parseInt(a))
		 .collect(Collectors.reducing(0, (a,b)->(a+b)));
		 
		 System.out.println(sum);
		 
		 //another way
		 sum = Stream.of(String.valueOf(i).split(""))
		 .collect(Collectors.summingInt(Integer::parseInt));
		 
		 System.out.println(sum);
		 
	}

}
