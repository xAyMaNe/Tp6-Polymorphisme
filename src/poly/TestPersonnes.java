package poly;

import java.util.*;

public class TestPersonnes {

	public static void main(String[] args) {

		List<Personne> equipe = new ArrayList<>();

		equipe.add(new Devoloppeur("Ali", 2000));
		equipe.add(new Manager("Hamid", 3000));
		equipe.add(new Devoloppeur("Hanane", 2200));

		Utils.listerPersonnes(equipe);
	}
}
