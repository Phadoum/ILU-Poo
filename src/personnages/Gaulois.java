package personnages;

import lieux.*;

public class Gaulois {
	private String nom;
	private int force;
	private int nbTrophees = 0;
	private int effetPotion = 1;
	private Equipement[] trophees = new Equipement[100];

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;

	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}

	public void frapper(Romain romain) {

		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		Equipement[] tropheesWin = romain.recevoirCoup((force / 3) * effetPotion);
		for (int i = 0; tropheesWin != null && i < tropheesWin.length; i++, nbTrophees++) {
			this.trophees[nbTrophees] = tropheesWin[i];
		}

	}

	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}

	public void boirePotion(int forcePotion) {
		effetPotion = forcePotion;
		System.out.println("Merci Druide, je sens que ma force est " + effetPotion + " fois décuplée");

	}

	public void faireUneDonation(Musee musee) {
		System.out.println("Le gaulois " + nom + " Je donne au musee tous mes trophees:");
		for (int i = 0; nbTrophees > i; i++) {
			musee.donnerTrophees(this, trophees[i]);
			System.out.println("-" + trophees[i]);
		}
	}

	public static void main(String[] args) {
		/*
		 * Gaulois axterix = new Gaulois("Astérix",8);
		 * System.out.println(axterix.getNom()); System.out.println(axterix);
		 * axterix.parler("blabla"); axterix.boirePotion(8);
		 */

	}

}