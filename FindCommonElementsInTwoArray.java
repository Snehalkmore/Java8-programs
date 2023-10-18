package practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//How do you find common elements between two arrays?

public class FindCommonElementsInTwoArray {

	public static void main(String[] args) {
		
		  List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);
	         
	      List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);
	      
	      //one way
	      List l = Stream.concat(list1.stream(), list2.stream())
	     .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
	     .entrySet().stream()
	     .filter(t->t.getValue()>1)
	     .map(s->s.getKey())
	     .collect(Collectors.toList());
	     
	      System.out.println(l); 
	     
	      //another way
	      List listOfCommonElelemnts = list1.stream()
	    		  .filter(list2::contains)
	    		  .collect(Collectors.toList());
	      
	      System.out.println(listOfCommonElelemnts);
	      

	}

}
