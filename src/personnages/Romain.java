package personnages;
import lieux.Village;

public class Romain {
	
	private String nom;
	private int force;
	
public Romain(String nom, int force) {
	this.nom = nom;
	this.force = force;
	assert(force>0);
	}

public String getNom() {
	return nom;
	}

public void parler(String texte) {
	System.out.println(prendreParole() + "« " + texte + "»");
	}

private String prendreParole() {
	return "Le romain " + nom + " : ";
	}

public void recevoirCoup(int forceCoup) {
	assert(forceCoup>0);
	int forcedeb = force;
	force -= forceCoup;
	if (force > 0) {
	parler("Aïe");
	} 
	else {
	parler("J'abandonne...");
	}

	assert(forcedeb>force);
	}

public static void main(String[] args) {
	/*Romain gary = new Romain("Garyr",6);
	gary.parler("testtt");
	gary.recevoirCoup(8);*/
	
	
	System.out.println(Equipement.CASQUE);
	}



}
