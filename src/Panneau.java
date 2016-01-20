import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferStrategy;
import java.util.Iterator;




public class Panneau extends Canvas {

	/**
	 * @param args
	 */

	Truc truc;
	BufferStrategy bs;
	Arene arene;
	Camera cam;
	
	public Panneau(Truc truc, Arene ar)
	{
		this.truc = truc;
		this.bs = null;
		
		this.arene = ar;
		this.cam = new Camera(600,400);
		
		
	}
	
	public void paint(Graphics g)
	{
		render();
		
	}
	
	public void render()
	{
		if (this.bs==null)
		{
			this.createBufferStrategy(3);
			this.bs = this.getBufferStrategy();
		}
		
		Graphics2D g = (Graphics2D) bs.getDrawGraphics();
		RenderingHints rh = new RenderingHints(
	             RenderingHints.KEY_ANTIALIASING,
	             RenderingHints.VALUE_ANTIALIAS_ON);
	    g.setRenderingHints(rh);
		
	    //efface l'ecran
	    g.setColor(Color.white);
	    g.fillRect(0, 0, 600, 400);
	    
	    g.setColor(Color.BLACK);
	    Iterator<Triangle> it = arene.triangles.iterator();
	    while (it.hasNext())
	    {
	    	Triangle t = cam.coordonneesCamera(it.next());
	    	
	    	g.drawLine(t.x1, t.y1, t.x2, t.y2);
	    	g.drawLine(t.x2, t.y2, t.x3, t.y3);
	    	g.drawLine(t.x3, t.y3, t.x1, t.y1);
	    	
	    }
	    
		g.dispose();
		bs.show();
		
	}
	
	
}

