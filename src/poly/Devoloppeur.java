package poly;

import poly.Personne;

public class Devoloppeur extends Personne {
	public Devoloppeur(String nom, double salaireBase) {
		super(nom, salaireBase);
	}

	@Override
	public double calculerSalaire() {
		return salaireBase * 1.10; // +10%
	}
}