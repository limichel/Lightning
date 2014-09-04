
void setup()
{
	size(500,500);
	strokeWeight(0.5);
}
void mousePressed()
{
	int startX = mouseX;
	int startY = 0;
	int endX = startX + (int)(Math.random() * 10 - 5);
	int endY = startY + (int)(Math.random() * 5);
	while(startX < 500)
	{
		stroke(startX/2, 100, 150);
		line(startX, startY, endX, endY);
		startX = endX;
		startY = endY;
		endX = endX + (int)(Math.random() * 10 - 5);
		endY = endY + (int)(Math.random() * 5);
	}
}
void draw()
{
	//rain
	frameRate(8);
	background(50);
	stroke(132, 172, 225, 50);
	for(int y = 0; y<500; y = y + 20)
	{
		for(int x = 0; x<500; x= x + 10)
		{
			line(x, y, x, y+(int)(Math.random() * 10));
		}
	}

}
