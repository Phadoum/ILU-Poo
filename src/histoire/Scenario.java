package histoire;

import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gaulois axterix = new Gaulois("Astérix",8);
		Romain minus = new Romain("Minus",14);
		axterix.parler("Bonjour à tous");
		minus.parler("Un Gau... Un GAUGAU...");
		axterix.frapper(minus);
		axterix.frapper(minus);
		axterix.frapper(minus);
		
		
	}

}
