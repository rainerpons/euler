package com.euler.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import static com.euler.solutions.Problem001.listOfMultiples;

@SuppressWarnings("unused")
public class Problem001Test {
	/*
	 * The following nine methods test listOfMultiples() from the Problem001 class.
	 */
	@Test
	public void should_returnMultiples_when_argumentsArePositive() {
		// given
		int multipleA = 3;
		int multipleB = 5;
		int limit = 10;

		// when
		List<Integer> expected = Arrays.asList(3, 5, 6, 9);
		List<Integer> actual = listOfMultiples(multipleA, multipleB, limit);

		// then
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void should_returnEmptyList_when_multiplesArePositiveAndLimitIsNegative() {
		// given
		int multipleA = 3;
		int multipleB = 5;
		int limit = -10;

		// when
		List<Integer> expected = new ArrayList<>();
		List<Integer> actual = listOfMultiples(multipleA, multipleB, limit);

		// then
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void should_returnEmptyList_when_multiplesArePositiveAndLimitIsZero() {
		// given
		int multipleA = 3;
		int multipleB = 5;
		int limit = 0;

		// when
		List<Integer> expected = new ArrayList<>();
		List<Integer> actual = listOfMultiples(multipleA, multipleB, limit);

		// then
		Assert.assertEquals(expected, actual);
	}

	@Test(expected = IllegalArgumentException.class)
	public void should_throwException_when_eitherMultipleIsZeroAndLimitIsNegative() {
		// given
		int multipleA = 0;
		int multipleB = 5;
		int limit = -10;

		// when and then
		List<Integer> actual = listOfMultiples(multipleA, multipleB, limit);
	}

	@Test(expected = IllegalArgumentException.class)
	public void should_throwException_when_eitherMultipleIsZeroAndLimitIsZero() {
		// given
		int multipleA = 0;
		int multipleB = 5;
		int limit = 0;

		// when and then
		List<Integer> actual = listOfMultiples(multipleA, multipleB, limit);
	}

	@Test(expected = IllegalArgumentException.class)
	public void should_throwException_when_eitherMultipleIsZeroAndLimitIsPositive() {
		// given
		int multipleA = 0;
		int multipleB = 5;
		int limit = 10;

		// when and then
		List<Integer> actual = listOfMultiples(multipleA, multipleB, limit);
	}

	@Test
	public void should_returnEmptyList_when_argumentsAreNegative() {
		// given
		int multipleA = -3;
		int multipleB = -5;
		int limit = -10;

		// when
		List<Integer> expected = new ArrayList<>();
		List<Integer> actual = listOfMultiples(multipleA, multipleB, limit);

		// then
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void should_returnEmptyList_when_eitherMultipleIsNegativeAndLimitIsZero() {
		// given
		int multipleA = -3;
		int multipleB = 5;
		int limit = 0;

		// when
		List<Integer> expected = new ArrayList<>();
		List<Integer> actual = listOfMultiples(multipleA, multipleB, limit);

		// then
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void should_returnMultiples_when_eitherMultipleIsNegativeAndLimitIsPositive() {
		// given
		int multipleA = -3;
		int multipleB = 5;
		int limit = 10;

		// when
		List<Integer> expected = Arrays.asList(3, 5, 6, 9);
		List<Integer> actual = listOfMultiples(multipleA, multipleB, limit);

		// then
		Assert.assertEquals(expected, actual);
	}
}