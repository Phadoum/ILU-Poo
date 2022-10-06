package histoire;

import personnages.*;


public class Scenario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gaulois axterix = new Gaulois("Astérix",8);
		Romain minus = new Romain("Minus",6);
		axterix.parler("Bonjour à tous");
		minus.parler("Un Gau... Un GAUGAU...");
		axterix.frapper(minus);
		axterix.frapper(minus);
		axterix.frapper(minus);
		Druide druide = new Druide("druide",0,10);
		int potion = druide.preparerPotion();
		System.out.println(potion);
	}

}
