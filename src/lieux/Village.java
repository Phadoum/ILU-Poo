package lieux;

import personnages.*;

public class Village {
	private String nom;
	private Chef chef;
	private int nbVillageois = 0;
	private Gaulois[] villageois;

	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		this.villageois = new Gaulois[nbVillageoisMaximum];

	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}

	public String getNom() {
		return nom;

	}

	public void ajouterHabitant(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois;
		nbVillageois += 1;

	}

	public Gaulois trouverHabitant(int numVillageois) {
		return villageois[numVillageois];

	}

	public void afficherVillageois() {
		System.out.println("Dans village du chef " + chef.getNom() + " vivent les légendaires gaulois :");
		for (int i = 0; i < nbVillageois; i++) {
		
			System.out.println("-" + villageois[i].getNom());
		
		}

	}

	public static void main(String[] args) {
		Village village = new Village("Village des Irréductible", 30);
		Gaulois obelix = new Gaulois("Obélix", 25);
		Gaulois asterix = new Gaulois("Astérix",8);
		Chef abraracourcix = new Chef("Abraracourcix", 6,1,village);
		village.setChef(abraracourcix);

		/*Gaulois gaulois1 = village.trouverHabitant(30); hors de la taille du village de 0-29*/
	
		/*Gaulois gaulois = village.trouverHabitant(1);
		System.out.println(gaulois);
		Le numéro de villageois a cette case n'existe pas
		*/
		
		
		village.ajouterHabitant(asterix);
		village.ajouterHabitant(obelix);
		village.afficherVillageois();
		
		
		

	}

}
