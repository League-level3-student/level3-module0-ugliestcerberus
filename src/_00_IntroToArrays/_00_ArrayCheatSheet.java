package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		// 1. make an array of 5 Strings
		String[] man = new String[5];
		man[0] = "I am nice";
		man[1] = "I will improve my reading";
		man[2] = "No way";
		man[3] = "I will help you";
		man[4] = "let's go";
		// 2. print the third element in the array
		System.out.println(man[2]);
		// 3. set the third element to a different value
		man[2] = "I will work harder";
		// 4. print the third element again
		System.out.println(man[2]);
		// 5. use a for loop to set all the elements in the array to a string of your
		// choice
		for (int i = 0; i < 4; i++) {
			man[i] = "something";
		}
		//if we don't know exactly what are the values of anything, we use a variable. 
		
		// 6. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < 4; i++) {
			System.out.println(man[i]);
		}
		
		// 7. make an array of 50 integers
		int[] randomnumbers = new int[50];
		
		// 8. use a for loop to make every value of the integer array a random number
		for (int y = 0; y < 50; y++) {
			int r = new Random().nextInt(500);
			randomnumbers[y] = r;
		}
		
		// 9. without printing the entire array, print only the smallest number on the
		// array
		int smallest = randomnumbers[0];
		for (int t = 0; t < 10; t++) {
			if (randomnumbers[0] < smallest) {
				smallest = randomnumbers[t];
			}
			System.out.println(smallest);
		}
		
		// 10 print the entire array to see if step 8 was correct
		System.out.println(randomnumbers);
		
		// 11. print the largest number in the array.
		int largest = randomnumbers[0];
		for (int b = 0; b < 10; b++) {
			if (randomnumbers[0] > largest) {
				largest = randomnumbers[b];
			}
		}
		System.out.println(largest);
		// 12. print only the last element in the array
		int last = randomnumbers[0];
		System.out.println(randomnumbers.length);
		System.out.println(randomnumbers.length - 1);
	}
}