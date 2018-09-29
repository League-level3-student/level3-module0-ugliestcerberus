package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	
public static void main(String[]args) {
	MoreArrayFun yes= new MoreArrayFun();
	String[] ues= new String[5];
	//If there are specific strings we want to create, then we want to set them to different values.
	ues[0]="Have this?";
	ues[1]="We will";
	ues[2]= "Matthew";
	ues[3]= "Jasmine";
	ues[4]= "Hailey";
	//The purpose of making an instance is to call nonstatic methods. 
	yes.setNames(ues);
	System.out.println("NEXT--------------");
	yes.seteveryother(ues);
	System.out.println("NEXT---------------");
	yes.reverseprint(ues);
	System.out.println("NEXT---------------");
	yes.printallStringsinRandomOrder(ues);
	
	
	
}
//2. Write a method that takes an array of Strings and prints all the Strings in the array.
void setNames(String[] names2) {
	//String names[]= new String[6];
	for (int i = 0; i < names2.length; i++) {
	//names2[i]="Matthew";
	System.out.println(names2[i]);
	//The parameters in the methods are there so I can put in a general value for any of them. 
	}
}
//3. Write a method that takes an array of Strings and prints all the Strings in the array in reverse order.
void reverseprint(String[] names2) {
	for (int n = names2.length-1; n > -1; n--) {
	//names2[n]= "Jar";
	//We don't want to give values to an array. 
	//remember this: the starting value, <,and -- of int n=0; n<0; n-- tells us the order of how the strings are printed
	System.out.println(names2[n]);	
	}
}
//4. Write a method that takes an array of Strings and prints every other String in the array.
void seteveryother(String[]names2) {
	for (int j = 0; j < names2.length; j+=2) {
	//names2[j]= "I will";	
	System.out.println(names2[j]);
	}
}

//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	
void printallStringsinRandomOrder(String[]names2) {
	for (int l = 0; l < names2.length; l++) {
	//names2[l]= "matthew wang";
	System.out.println(names2[new Random().nextInt(5)]);	
	}
}
	}
	
	

	
	
	

