package com.euler.solutions.impl;

import static com.euler.solutions.impl.Problem001.listOfMultiples;
import static com.euler.solutions.impl.Problem001.sumOfListOfMultiples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("unused")
public class Problem001Test {
	private int multipleA;
	private int multipleB;
	private int limit;

	/*
	 * The following nine methods test listOfMultiples() from the Problem001 class.
	 */

	@Test
	public void should_returnMultiples_when_allArgumentsArePositive() {
		setMultiplesPositive();
		setLimitPositive();

		List<Integer> expected = Arrays.asList(3, 5, 6, 9);
		List<Integer> actual = listOfMultiples(multipleA, multipleB, limit);

		Assert.assertEquals(expected, actual);
	}

	@Test
	public void should_returnEmptyList_when_multiplesArePositiveAndLimitIsZero() {
		setMultiplesPositive();
		setLimitZero();

		List<Integer> expected = new ArrayList<>();
		List<Integer> actual = listOfMultiples(multipleA, multipleB, limit);

		Assert.assertEquals(expected, actual);
	}

	@Test
	public void should_returnEmptyList_when_multiplesArePositiveAndLimitIsNegative() {
		setMultiplesPositive();
		setLimitNegative();

		List<Integer> expected = new ArrayList<>();
		List<Integer> actual = listOfMultiples(multipleA, multipleB, limit);

		Assert.assertEquals(expected, actual);
	}

	@Test(expected = IllegalArgumentException.class)
	public void should_throwException_when_eitherMultipleIsZeroAndLimitIsPositive_caseA() {
		setEitherMultipleZero();
		setLimitPositive();

		List<Integer> actual = listOfMultiples(multipleA, multipleB, limit);
	}

	@Test(expected = IllegalArgumentException.class)
	public void should_throwException_when_eitherMultipleIsZeroAndLimitIsZero_caseA() {
		setEitherMultipleZero();
		setLimitZero();

		List<Integer> actual = listOfMultiples(multipleA, multipleB, limit);
	}

	@Test(expected = IllegalArgumentException.class)
	public void should_throwException_when_eitherMultipleIsZeroAndLimitIsNegative_caseA() {
		setEitherMultipleZero();
		setLimitNegative();

		List<Integer> actual = listOfMultiples(multipleA, multipleB, limit);
	}

	@Test
	public void should_returnEmptyList_when_argumentsAreNegative() {
		setEitherMultipleNegative();
		setLimitNegative();

		List<Integer> expected = new ArrayList<>();
		List<Integer> actual = listOfMultiples(multipleA, multipleB, limit);

		Assert.assertEquals(expected, actual);
	}

	@Test
	public void should_returnEmptyList_when_eitherMultipleIsNegativeAndLimitIsZero() {
		setEitherMultipleNegative();
		setLimitZero();

		List<Integer> expected = new ArrayList<>();
		List<Integer> actual = listOfMultiples(multipleA, multipleB, limit);

		Assert.assertEquals(expected, actual);
	}

	@Test
	public void should_returnMultiples_when_eitherMultipleIsNegativeAndLimitIsPositive() {
		setEitherMultipleNegative();
		setLimitPositive();

		List<Integer> expected = Arrays.asList(3, 5, 6, 9);
		List<Integer> actual = listOfMultiples(multipleA, multipleB, limit);

		Assert.assertEquals(expected, actual);
	}

	/*
	 * The following nine methods test sumOfListOfMultiples() from the Problem001 class.
	 */

	@Test
	public void should_returnSum_when_allArgumentsArePositive() {
		setMultiplesPositive();
		setLimitPositive();

		Integer expected = 23;
		Integer actual = sumOfListOfMultiples(multipleA, multipleB, limit);

		Assert.assertEquals(expected, actual);
	}

	@Test
	public void should_returnZero_when_multiplesArePositiveAndLimitIsZero() {
		setMultiplesPositive();
		setLimitZero();

		Integer expected = 0;
		Integer actual = sumOfListOfMultiples(multipleA, multipleB, limit);

		Assert.assertEquals(expected, actual);
	}

	@Test
	public void should_returnZero_when_multiplesArePositiveAndLimitIsNegative() {
		setMultiplesPositive();
		setLimitNegative();

		Integer expected = 0;
		Integer actual = sumOfListOfMultiples(multipleA, multipleB, limit);

		Assert.assertEquals(expected, actual);
	}

	@Test(expected = IllegalArgumentException.class)
	public void should_throwException_when_eitherMultipleIsZeroAndLimitIsPositive_caseB() {
		setEitherMultipleZero();
		setLimitPositive();

		Integer actual = sumOfListOfMultiples(multipleA, multipleB, limit);
	}

	@Test(expected = IllegalArgumentException.class)
	public void should_throwException_when_eitherMultipleIsZeroAndLimitIsZero_caseB() {
		setEitherMultipleZero();
		setLimitZero();

		Integer actual = sumOfListOfMultiples(multipleA, multipleB, limit);
	}

	@Test(expected = IllegalArgumentException.class)
	public void should_throwException_when_eitherMultipleIsZeroAndLimitIsNegative_caseB() {
		setEitherMultipleZero();
		setLimitNegative();

		Integer actual = sumOfListOfMultiples(multipleA, multipleB, limit);
	}

	@Test
	public void should_returnSum_when_eitherMultipleIsNegativeAndLimitIsPositive() {
		setEitherMultipleNegative();
		setLimitPositive();

		Integer expected = 23;
		Integer actual = sumOfListOfMultiples(multipleA, multipleB, limit);

		Assert.assertEquals(expected, actual);
	}

	@Test
	public void should_returnZero_when_eitherMultipleIsNegativeAndLimitIsZero() {
		setEitherMultipleNegative();
		setLimitZero();

		Integer expected = 0;
		Integer actual = sumOfListOfMultiples(multipleA, multipleB, limit);

		Assert.assertEquals(expected, actual);
	}

	@Test
	public void should_returnZero_when_eitherMultipleIsNegativeAndLimitIsNegative() {
		setEitherMultipleNegative();
		setLimitNegative();

		Integer expected = 0;
		Integer actual = sumOfListOfMultiples(multipleA, multipleB, limit);

		Assert.assertEquals(expected, actual);
	}

	/*
	 * The following are helper methods for testing the listOfMultiples() and sumOfListOfMultiples()
	 * methods from the Problem001 class.
	 */

	private void setMultiplesPositive() {
		multipleA = 3;
		multipleB = 5;
	}

	private void setEitherMultipleZero() {
		multipleA = 0;
		multipleB = 5;
	}

	private void setEitherMultipleNegative() {
		multipleA = -3;
		multipleB = 5;
	}

	private void setLimitPositive() {
		limit = 10;
	}

	private void setLimitZero() {
		limit = 0;
	}

	private void setLimitNegative() {
		limit = -10;
	}
}