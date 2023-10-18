package practice;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//Given an integer array, find sum and average of all elements?

public class FindSumAndAverageOfAllElementsInArray {

	public static void main(String[] args) {
		
		int[] a = new int[] {45, 12, 56, 15, 24, 75, 31, 89};
		
		//one way
		int sum = Arrays.stream(a).sum();
		double average = Arrays.stream(a).average().getAsDouble();
		System.out.println("average "+average);
		System.out.println("sum "+sum);
		
		//another way
		Integer sum1 = Arrays.stream(a).boxed().collect(Collectors.summingInt(i->i));		
		Double avg= Arrays.stream(a).boxed().collect(Collectors.averagingInt(i->i));
		System.out.println("avg "+avg);
		System.out.println("sum1 "+sum1);

	}

}
