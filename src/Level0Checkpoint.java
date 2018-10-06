import javax.swing.JOptionPane;

public class Level0Checkpoint {
public static void main(String[]args){
	//main methods is not public static void 
	//main method was created here
int[]quotes= new int[5];
//Array was created here
quotes[0]= 10;
quotes[1]= 19;
quotes[2]= 29;
quotes[3]= 89;
quotes[4]= 90;
//Array was initialized here	

String jash= JOptionPane.showInputDialog("Type something");
JOptionPane.showMessageDialog(null, "The sum is");	
for(int g=0; g<quotes.length; g++) {
	
}
//In this code, we are trying to create a for loop and collect the user input,
//to fill the array. then we will convery their input to an integer using Integer.parseInt(string);
for(int h=0;h<quotes.length;h++) {
	JOptionPane.showInputDialog("Type something");
	int numberconverter= Integer.parseInt(jash);
	quotes[h]= numberconverter;
}
}

}
