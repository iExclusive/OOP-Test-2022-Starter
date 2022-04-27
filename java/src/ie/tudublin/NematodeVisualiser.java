package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

import ddf.minim.AudioBuffer;
import ddf.minim.AudioInput;
import ddf.minim.AudioPlayer;
import ddf.minim.Minim;

public class NematodeVisualiser extends PApplet
{

	ArrayList<Nematode> nematodes = new ArrayList<Nematode>();
	public float border;

	public void keyPressed()
	{		
		if (keyCode == LEFT)
		{

		}
		
	}


	public void settings()
	{
		size(800, 800);
	}

	public void setup() 
	{
		colorMode(HSB);
		background(100);
		smooth();	
		loadNematodes();			
	}
	

	public void loadNematodes()
	{
		Table table = loadTable("nematodes.csv", "header");
		for(TableRow r:table.rows())
        {
            Nematode n = new Nematode(r);
            nematodes.add(n);
        }
	}

	public void drawNematodes(){
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