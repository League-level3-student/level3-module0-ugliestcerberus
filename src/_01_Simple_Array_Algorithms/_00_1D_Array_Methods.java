package _01_Simple_Array_Algorithms;

public class _00_1D_Array_Methods {
	// 1. Complete the method so that it returns the sum of all
	// of the integers in the array being passed in
	public static int sumIntArray(int[] values) {
		// int[] numberssum= new int[10];
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum = sum + values[i];
			// numberssum.println();
		}
		return sum;
		// return 0;
	}

	// 2. Complete the method so that it returns the average of all
	// of the integers in the array being passed in

	public static double averageIntArray(int[] values) {
		// int average= 0;
		double sum = 0;
		double sum1 = 0;

		for (int j = 0; j < values.length; j++) {

			sum = sum + values[j];
			// sum = values[j] / 4;
			// sum1= values[j] / 4;
			// sum1 = values[j] / 4;

		}
		// sum=values[j]/4;
		// double average = sum / 4;
		double average = sum / values.length;
		// the result of two ints would be an int.
		return average;
		// return sum1;
		// return 0,false,j;
	}

	// 3. Complete the method so that it returns true if the integer
	// array contains the value specified by the second parameter.
	// It should otherwise return false.
	public static boolean containsIntValue(int[] array, int value) {

		for (int g = 0; g < array.length; g++) {

			// if(array==value) {
			// if(array[ara]==value){
			// for loop can be another term for array. Make sure whatever is inside array
			// brackets is the same as the variable of for loop.
			if (array[g] == value) {
				return true;
			}
		}
		return false;
	}

	// 4. Complete the method so that it returns the index of the,
	// first instance that the specified value occurs in the array.
	// If the array does not contain the specified value, it should return -1.
	public static int getIndex(int[] arr, int value) {
		for (int o = 0; o < arr.length; o++) {
			if (arr[o] == value) {
				return o;
				// return value;
			}
		}
		return -1;
	}
}