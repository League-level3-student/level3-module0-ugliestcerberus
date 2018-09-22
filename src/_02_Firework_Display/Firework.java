package _02_Firework_Display;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

/*
 * 
 * You can think of a fire work as an array of sparks. Run the demo jar to see the finished product
 * then complete the steps. 
 *
 */

public class Firework {
	public static final int GRAVITY = 1;

	// 1. Create an array of Spark objects called sparks. Don't initialize it.
	// 2. Initialize the Spark array to contain 100 Sparks.

	Spark[] sparks = new Spark[100];

	public boolean dead = false;

	public Firework() {

		// 3. Iterate through the sparks and initialize each one to a new Spark.
		// Make each spark start at the middle bottom of the screen.
		for (int y = 0; y < sparks.length; y++) {
			int h = new Random().nextInt(500);
			// sparks[y].getX(h);
			// sparks[y].getY(550);
			sparks[y] = new Spark(550, y);
		}
	}

	public void launch() {
		// 4. Iterate through the sparks and reset their x and y location
		// to their original starting point.
		for (int i = 0; i < 100; i++) {
			sparks[i].x =100;
			//sparks[i].x;
			//sparks[i].y;
			//sparks[i]=x;
			//sparks[i]=y;
			sparks[i].y =100;
		}
	}

	public void updateSparks() {
		// 8. Uncomment this code. See if you can understand what it is doing.

		for(int i = 0; i < sparks.length; i++) {
		Spark s = sparks[i];
		s.x += s.xVelocity;
		s.y += s.yVelocity;
		s.yVelocity += GRAVITY;
		
		//This code is telling us that for every spark, it increases the x Velocity when x increases
		//The y velocity would increase when the y value increases
		
		if(s.yVelocity >= 0 && !s.fire) {
		Random r = new Random();
		s.xVelocity = r.nextInt(40) - 20;
		s.yVelocity += -r.nextInt(10) - 5;
		s.size = r.nextInt(7) + 2;
		s.fire = true;
		}
		
		//This code tells me that if the y Velocity is greater than or equal to o, then the spark will not fire. 
		
		if(s.y >= FireworkDisplay.HEIGHT) {
		s.dead = true;
		}
		}
		
		//This code shows that if the sparks reach beyond the minimum or maximum height, then it would kill the spark
		//
		for(int i = 0; i < sparks.length; i++) {
		if(!sparks[i].dead) {
		dead = false;
		break;
		}
		dead = true;
		// This code shows that if the spark is not dead, then it would break apart so the spark can die. 
		}
	}

	public void drawSparks(Graphics g) {
		// 5. Iterate through each spark //
		for (int p = 0; p < sparks.length; p++) {
			sparks[p]= new Spark(100,100);
		//sparks[p]= g.setColor();
		//sparks[p]= g.getColor();
		g.setColor(Color.BLACK);
		}
		// 6. Set the color to the spark's color with g.setColor()
		
		// 7. Fill in an oval using the spark's x, y, and size with g.fillOval()
		g.fillOval(50,50,100,100);
	}
}
