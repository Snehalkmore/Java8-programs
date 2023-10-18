package practice;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//Reverse an integer array
public class ReverseIntegerArray {

	public static void main(String[] args) {

		int[] array = new int[] {5, 1, 7, 3, 9, 6};
		
		List list = IntStream.rangeClosed(1, array.length)
		.map(i->array[array.length-i])
		.boxed()
		.collect(Collectors.toList());
		
		System.out.println(list);
	}

}
