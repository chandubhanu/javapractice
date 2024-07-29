package javaPractice.collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Collectionsclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> a = Arrays.asList(2, 3, 5, 1, 1, 2, 3, 4, 7, 8);

		// Sort the list
		Collections.sort(a);
		System.out.println("Sorted list: " + a);

		// Reverse the list
		Collections.reverse(a);
		System.out.println("Reversed list: " + a);

		// Print maximum and minimum elements
		System.out.println("Maximum element: " + Collections.max(a));
		System.out.println("Minimum element: " + Collections.min(a));

		// Shuffle the list
		Collections.shuffle(a);
		System.out.println("Shuffled list: " + a);

		// Sort the list again before binary search
		Collections.sort(a);
		System.out.println("Re-sorted list: " + a);

		// Perform binary search for the element 5
		int index = Collections.binarySearch(a, 5);
		System.out.println("Index of 5: " + index);
	
		

	}

}
