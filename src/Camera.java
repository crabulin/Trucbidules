
public class Camera {

	int largeur ;
	int hauteur ;
	double x ;
	double y ;
	double echelle ;
	double angle ; //en degres
	
	public Camera (int largeur, int hauteur)
	{
		this.largeur = largeur ;
		this.hauteur = hauteur ;
		this.x = 0;
		this.y = 0 ;
		this.echelle = 1.0 ;
		this.angle = 0.0 ;
	}
	
	public void translation(double x, double y)
	
	{
		this.x += x;
		this.y += y;
		
	}
	
	public double[] coordonneesCamera(double x, double y)
	{
		double[] res = {x,y};
		return res;
	}
	
	public Triangle coordonneesCamera(Triangle t)
	{
		
		return new Triangle((int)(t.x1+this.x),
				(int)(t.y1+this.y),
				(int)(t.x2+this.x),
				(int)(t.y2+this.y),
				(int)(t.x3+this.x),
				(int)(t.y3+this.y));
	}
	
	
}

