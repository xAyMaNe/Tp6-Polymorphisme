package entities;

public class Bibliotheque {

	private Document[] docs;
	private int index = 0;
	private int capacite;

	public Bibliotheque(int capacite) {
		this.capacite = capacite;
		docs = new Document[capacite];
	}

	public boolean ajouter(Document doc) {
		if (index >= capacite)
			return false;
		docs[index++] = doc;
		return true;
	}

	public boolean supprimer(Document doc) {
		for (int i = 0; i < index; i++) {
			if (docs[i] != null && docs[i].getNumEnreg() == doc.getNumEnreg()) {
				docs[i] = null;
				return true;
			}
		}
		return false;
	}

	public void afficherDocuments() {
		for (Document d : docs) {
			if (d != null)
				System.out.println(d);
		}
	}

	public Document document(int numEnreg) {
		for (Document d : docs) {
			if (d != null && d.getNumEnreg() == numEnreg)
				return d;
		}
		return null;
	}

	public void afficherAuteurs() {
		for (Document d : docs) {
			if (d instanceof Livre) {
				System.out.println(((Livre) d).getAuteur());
			}
		}
	}
}
