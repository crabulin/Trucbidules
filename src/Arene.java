import java.util.ArrayList;
import java.util.Observable;


public class Arene extends Observable {
	
	ArrayList<Triangle> triangles;
	
	public Arene()
	{
		this.triangles = new ArrayList<Triangle>();
	}

}
