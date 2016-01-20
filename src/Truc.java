import java.awt.Color;
import java.awt.event.KeyEvent;


import javax.swing.JFrame;


public class Truc extends JFrame {

	/**
	 * @param args
	 */
	Panneau pan;
	InputGestionnaire ig;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Truc t = new Truc();
		t.setVisible(true);
		
		while(true)
		{
			//long now = System.nanoTime();
			if (t.ig.keys[KeyEvent.VK_LEFT] )
			{
			t.pan.cam.translation(-1, 0);
			}
			if (t.ig.keys[KeyEvent.VK_RIGHT] )
			{
			t.pan.cam.translation(1, 0);
			}
			if (t.ig.keys[KeyEvent.VK_UP] )
			{
			t.pan.cam.translation(0, -1);
			}
			if (t.ig.keys[KeyEvent.VK_DOWN] )
			{
			t.pan.cam.translation(0, 1);
			}
			
			t.pan.render();
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
		
	}

	
	public Truc()
	{
		this.setTitle("zobi la mouk");
		this.setSize(600,400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);

		Arene ar = new Arene();
		System.out.println("weee");
		ar.triangles.add(new Triangle(10,10,50,100,250,150));
		
		Panneau pan = new Panneau(this,ar);
		this.pan = pan;
		//pan.setBackground(Color.ORANGE);
		this.add(pan);
		this.setVisible(true);
		this.pack();
		
		this.ig = new InputGestionnaire();
		this.addKeyListener(this.ig);
		
		pan.render();
	}
	
}
