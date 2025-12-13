package poly;

public class Cercle extends Forme {
	
	private double rayon;

	public Cercle(double rayon) {
		this.rayon = rayon;
	}
	
	@Override
	public double getSurface() {
		return  Math.PI * Math.pow(rayon, 2);
	}
		
	public String toString() {
		return "Cercle (rayon"+rayon+ "cm )";
	}
	
	

}
