package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;



public class NematodeVisualiser extends PApplet
{
	ArrayList<Nematode> nematodes = new ArrayList<Nematode>();

	public float border;

	char mode = 0;

	public void keyPressed()
	{		
		if (keyCode == LEFT)
		{

		}
		if (keyCode == RIGHT)
		{
			 
		}		
	}


	public char getMode() {
		return mode;
	}


	public void setMode(char mode) {
		this.mode = mode;
	}


	public void settings()
	{
		size(800, 800);
	}

	public void setup() 
	{
		colorMode(HSB);
		background(0);
		smooth();
		loadNematodes();			
	}
	

	public void loadNematodes()
	{
		Table table = loadTable("nametodes.csv", "header");
        for(TableRow r:table.rows())
        {
            Nematode s = new Nematode(r);
            nematodes.add(s);
        }
	}

	public void drawNematodes()
	{
		for(Nematode n:nematodes)
		{
			n.render(this);
		}
	}


	public void draw()
	{	
		background(0);
		noFill();
		stroke(255);
		drawNematodes();
	}
}
