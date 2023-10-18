package practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//How do you merge two unsorted arrays into single sorted array using Java 8 streams?
public class MergeUnsortedArraysIntoSingleSortedArray {

	public static void main(String[] args) {

		 int[] a = new int[] {4, 2, 7, 1};
         
	     int[] b = new int[] {8, 3, 9, 5};
	     
	     List<Integer> listOfMergedAndSortedArray = IntStream.concat(Arrays.stream(a),Arrays.stream(b))
	     .sorted()
	     .boxed()
	     .collect(Collectors.toList());
	     
	     System.out.println(listOfMergedAndSortedArray);
	    
	        
	}

}
