package poly;

public class Carre extends Forme {
	private double cote;

	public Carre(double cote) {
		this.cote = cote;
	}
	@Override
	public double getSurface() {
		return cote * cote;
	}
	
	public String toString () {
		return "Carre (coté"+cote+ "cm )";
	}
	
	

}
