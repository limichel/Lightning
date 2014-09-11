import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Lightning extends PApplet {


public void setup()
{
	size(500,500);
	strokeWeight(0.5f);
	frameRate(8);
}
public void draw()
{
	//rain
	background(50);
	fill(70);
	noStroke();
	ellipse(150, 0, 400, 100);
	ellipse(400, 0, 400, 100);
	stroke(132, 172, 225, 80);
	for(int y = 50; y<500; y = y + 30)
	{
		for(int x = 0; x<500; x= x + 50)
		{
			line(x, y, x, y+(int)(Math.random() * 10));
		}
	}
}
public void mousePressed()
{
	int startX = mouseX;
	int startY = 0;
	int endX = startX + (int)(Math.random() * 10 - 5);
	int endY = startY + (int)(Math.random() * 5);
	while(startY < 500)
	{
		stroke(startX/2, 100, 150);
		line(startX, startY, endX, endY);
		startX = endX;
		startY = endY;
		endX = endX + (int)(Math.random() * 10 - 5);
		endY = endY + (int)(Math.random() * 5);
	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Lightning" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
