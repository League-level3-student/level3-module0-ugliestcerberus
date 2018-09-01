//Copy the code into a new Processing sketch and complete then steps. 
import java.util.Random;
//1. create an array of ints. don't initialize it yet.
   int [] manystuff= new int[7];

void setup() {
  //2. set the size of your window
  //window.setSize();
  size(500,500);
  //  if you are using Processing 3, you cannot use variables because the developers don't know how programming is supposed to work.
  

  //3. initialize your array with the built in width variable
  int width=0;
  for(int i=0; i<7; i++){
   //manystuff[]= width; 
  }
  //4. initialize the ints in the array with random numbers
  //   from 0 to the built in height variable
    int height= new Random().nextInt(50);
    for(int j=0; j<7; j++){
     j=height; 
    }
  
  //5. call the noStroke() method
  noStroke();
}

void draw() {
  //6. set the background color with background(r, g, b);
  background(98,100,98);

  //7. set the color for your graph
  fill(90,86,96);

  //8. draw a rectangle for each int in your array.
  for(int i=0; i<manystuff.length; i++){
    rect(i,height,1,-manystuff[i]);
  }
  //   the x value will be the element of the int(should be the index, which is the i).
  //   the y value will the height variable(height) 
  //   the width is 1. This is being explicitly said. 
  //   the height is negative the value of the int at that element in the array. The value of this would be negative, and this needs the name of the array. 
  //   There should be a for loop around that rectangle statement. This is true because in the directions, it says array. 

  //9. call the stepSort method
  stepSort(manystuff);

  //10. extract the code that randomizes the array into a method.
  //void mousePressed(){
  //}
  void randomize(){
    int height= new Random().nextInt(50);
    for(int j=0; j<7; j++){
     j=height; 
    }
  }
  
  //11. call the method you made in step 10 when the mouse is pressed
  randomize();
}

void stepSort(int[] arr) {
  for (int i = 1; i < arr.length; i++) {
    if (arr[i - 1] > arr[i]) {
      int t = arr[i];
      arr[i] = arr[i - 1];
      arr[i - 1] = t;
    }
  }
}