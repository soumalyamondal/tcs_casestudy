package tcs.com.coachingapp.courses.source;

import java.util.Arrays;

public class MathCourse {
	
	public void printMathCourses() {
		// test data
		int num = 7;
		int[] numarr = { 3, 7, 1, 9, 2, 4 };
		String testStr = "625";
		// function tests
		System.out.println(isPrime(num));
		System.out.println(Arrays.toString(generateFibonacci(num)));
		System.out.println(Arrays.toString(sortArray(numarr)));
		System.out.println(getSquareRoot(testStr));
	}
	
	//Find and return the Prime Number of an Integer
	public boolean isPrime(int a) {
		// Check if number is less than equal to 1
		if (a <= 1)
			return false;

		// Check if number is 2
		else if (a == 2)
			return true;

		// Check if n is a multiple of 2
		else if (a % 2 == 0)
			return false;

		// Finally - check divisibility
		for (int i = 3; i <= Math.sqrt(a); i += 2) {
			if (a % i == 0)
				return false;
		}
		return true;
	}
	
	//Return the Fibonacci Number till given integer
	public int[] generateFibonacci(int a) {
		// Declare an array to store Fibonacci numbers. 1 extra to handle case : n = 0
		int f[] = new int[a + 1];
		int i;

		// 0th and 1st number of the series are : 0 and 1
		f[0] = 0;
		f[1] = 1;

		for (i = 2; i <= a; i++) {
			// Add the previous 2 numbers in the series and store it
			f[i] = f[i - 1] + f[i - 2];
		}

		// For Nth Fibonacci Number
//        return f[n];
		// for the whole series
		return f;
	}

	//Sort a numeric array and Return
	public int[] sortArray(int[] arr) {
		if (arr != null && arr.length != 0) {
			Arrays.sort(arr);
		}
		// return sorted array (natural order)
		return arr;
	}

	//Accept a String, Check for Integer, Handle Exception if not Integer, return square root.
	public double getSquareRoot(String str) {
		Integer intVal;
		double sqRoot = 0;
		try {
			intVal = Integer.valueOf(str);
			sqRoot = Math.sqrt(intVal.doubleValue());
		} catch (NumberFormatException e) {
			System.out.println("The provided string is not a valid Integer, returning 0 !");
		}

		return sqRoot;
	}
}
