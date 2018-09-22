package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	
public static void main(String[]args) {
	MoreArrayFun yes= new MoreArrayFun();
	String[] ues= new String[56];
	//The purpose of making an instance is to call nonstatic methods. 
	yes.setNames(ues);
	yes.seteveryother(ues);
	yes.reverseprint(ues);
	
}
//2. Write a method that takes an array of Strings and prints all the Strings in the array.
void setNames(String[] names2) {
	//String names[]= new String[6];
	for (int i = 0; i < names2.length; i++) {
	System.out.println(names2[i]);
	//The parameters in the methods are there so I can put in a general value for any of them. 
	}
}
//3. Write a method that takes an array of Strings and prints all the Strings in the array in reverse order.
void reverseprint(String[] names2) {
	for (int n = 0; n < names2.length; n++) {
	names2[n]= "Jar";
	System.out.println(names2[n]);	
	}
}
//4. Write a method that takes an array of Strings and prints every other String in the array.
void seteveryother(String[]names2) {
	for (int j = 0; j < names2.length; j+=2) {
	names2[j]= "I will";	
	System.out.println(names2[j]);
	}
}

//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	
	
	
	
	
	}
	
	

	
	
	

