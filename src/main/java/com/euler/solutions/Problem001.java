package com.euler.solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * Multiples of 3 and 5
 * 
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 * The sum of these multiples is 23. Find the sum of all the multiples of 3 or 5 below 1000.
 */

public class Problem001 extends IntegerSolution {
	public static List<Integer> listOfMultiples(int multipleA, int multipleB, int limit) {
		if (multipleA == 0 || multipleB == 0) {
			throw new IllegalArgumentException("Both multipleA and multipleB must be non-zero.");
		}
		
		List<Integer> multiples = new ArrayList<>();
		for (int i = 2; i < limit; i++) {
			if (i % multipleA == 0 || i % multipleB == 0) {
				multiples.add(i);
			}
		}
		return multiples;
	}

	public static Integer sumOfListOfMultiples(int multipleA, int multipleB, int limit) {
		List<Integer> multiples = listOfMultiples(multipleA, multipleB, limit);
		int sum = multiples.stream().mapToInt(Integer::intValue).sum();
		return sum;
	}

	@Override
	public Integer solution() {
		return sumOfListOfMultiples(3, 5, 1000);
	}
}