//Created by Ayush Verma
//4B CS3 Mr. McBrayer

import java.awt.Font;

enum GemType {
    GREEN, BLUE, ORANGE; //define the different types of Gems, comma delimited
}

public class Gem 
{

	private GemType color;
	private int points;

	public Gem() {
		points = ((int)(11*Math.random())) * 5;
		int c = (int)(3*Math.random());
		switch(c) {
			case 0: 
				color = GemType.GREEN;
				break;
			case 1: 
				color = GemType.BLUE;
				break;
			case 2: 
				color = GemType.ORANGE;
				break;
		}
	}

	public Gem(GemType type, int pts) {
		color = type;
		points = pts;
	}

	public String toString() {
		return color.toString().toLowerCase() + "[" + points + "]";
	}

	public GemType getType() {
		return color;
	}

	public int getPoints() {
		return points;
	}

	public void draw(double x, double y) {
		StdDraw.picture(x, y, "gem_" + color.toString().toLowerCase() + ".png");
		StdDraw.setPenColor(StdDraw.WHITE);
		StdDraw.text(x,y, Integer.toString(points));
	}

	/** Tester main method */
	public static void main(String [] args)
	{
		final int maxGems = 16;
		
		// Create a gem of each type
		Gem green  = new Gem(GemType.GREEN, 10);
		Gem blue   = new Gem(GemType.BLUE, 20);
		Gem orange = new Gem(GemType.ORANGE, 30);
		System.out.println(green  + ", " + green.getType()  + ", " + green.getPoints());		
		System.out.println(blue   + ", " + blue.getType()   + ", " + blue.getPoints());
		System.out.println(orange + ", " + orange.getType() + ", " + orange.getPoints());
		green.draw(0.3, 0.7);
		blue.draw(0.5, 0.7);
		orange.draw(0.7, 0.7);
		
		// A row of random gems
		for (int i = 0; i < maxGems; i++)
		{
			Gem g = new Gem();
			g.draw(1.0 / maxGems * (i + 0.5), 0.5);
		}
	}
}