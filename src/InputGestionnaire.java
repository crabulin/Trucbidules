import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class InputGestionnaire implements KeyListener {
	public boolean[] keys = new boolean[65536];
	
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		int code = e.getKeyCode(); 
		if (code>0 && code<keys.length) {
			keys[code] = true;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		int code = e.getKeyCode(); 
		if (code>0 && code<keys.length) {
			keys[code] = false;
		}
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

}
