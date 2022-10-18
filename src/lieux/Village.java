package lieux;

import personnages.*;

public class Village {
		private String nom;
		private Chef chef;
		private int nbVillageois=0;
		private String[] villageois;
		
public Village(String nom,int nbVillageoisMaximum) {
		this.nom = nom;
		this.villageois = new String[nbVillageoisMaximum];
		
		}

public void setChef(Chef chef) {
		this.chef = chef;
		}

public String getNom() {
		return nom;
		
		}

public void ajouterHabitant(Gaulois gaulois) {
	villageois[nbVillageois]=gaulois;
	nbVillageois =+ 1;
	
}

public String trouverHabitant(int numVillageois) {
	return villageois[numVillageois];
	
}

public void afficherVillageois() {
	System.out.println( "Dans village du chef " + villageois[0] + " vivent les légendaires gaulois :");
	int i = 1;
	while(villageois[i]!="") {
		System.out.println("- "+villageois[i]);
		i =+ 1	;
		}
	}
	
}




		
