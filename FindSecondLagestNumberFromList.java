package practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Find second largest number in an integer array?
//use skip
public class FindSecondLagestNumberFromList {

	public static void main(String[] args) {
		
		 List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
		 
		 Integer secondLargNumber = listOfIntegers.stream()
				 .sorted(Comparator.reverseOrder())
				 .skip(1)
				 .findFirst().get();
		 
		 System.out.println(secondLargNumber);
		 
	}

}
