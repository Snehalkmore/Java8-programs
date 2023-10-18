package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//How do you merge two unsorted arrays into single sorted array without duplicates?

public class MergeUnsortedArraysIntoSingleSortedArrayDistinct {

	public static void main(String[] args) {

		int[] a = new int[] {4, 2, 5, 1};
        
        int[] b = new int[] {8, 1, 9, 5};
        
       List list =  IntStream.concat(Arrays.stream(a), Arrays.stream(b))
        .sorted()
        .distinct()
        .boxed()
        .collect(Collectors.toList());
       
       System.out.println(list);
        
        
	}

}
