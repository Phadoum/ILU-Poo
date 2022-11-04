package histoire;

import lieux.Musee;
import personnages.Druide;
import personnages.Equipement;
import personnages.Gaulois;
import personnages.Romain;
//import villagegaulois.Musee;

public class Scenario {

	public static void main(String[] args) {
		Druide druide = new Druide("Panoramix", 5, 10);
		druide.parler("Je vais aller préparer une petite potion...");
		druide.preparerPotion();
		Gaulois obelix = new Gaulois("Obélix", 25);
		Gaulois asterix = new Gaulois("Astérix", 8);
		druide.booster(obelix);
		obelix.parler("Par Bélénos, ce n'est pas juste !");
		druide.booster(asterix);
		asterix.parler("Bonjour");
		Romain minus = new Romain("Minus", 6);
		Romain milexcus = new Romain("Milexcus", 8);
		Romain tete = new Romain("tete", 7);
		Romain tete2 = new Romain("tete", 7);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE);
		milexcus.sEquiper(Equipement.CASQUE);
		tete.sEquiper(Equipement.CASQUE);
		tete.sEquiper(Equipement.BOUCLIER);
		tete2.sEquiper(Equipement.BOUCLIER);
		minus.parler("UN GAU... UN GAUGAU...");
		do {
			asterix.frapper(minus);
		} 
		while (minus.getForce() > 0);
			milexcus.parler("UN GAU... UN GAUGAU...");
			
		do {
			asterix.frapper(milexcus);
		}
		while (milexcus.getForce() > 0);
		
		do {
			asterix.frapper(tete);
		}
		while (tete.getForce() > 0);
		
		do {
			asterix.frapper(tete2);
		}
		while (tete2.getForce() > 0);

		Musee musee = new Musee();
		asterix.faireUneDonation(musee);
		String texte=musee.extraireInstructionsCaml();
		System.out.println(texte);
	}

}
