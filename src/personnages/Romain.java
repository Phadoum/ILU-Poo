package personnages;

import lieux.Village;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements = new Equipement[10];
	private int nbEquipement;

	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert force > 0;
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

	public Equipement[] recevoirCoup(int forceCoup) {
		Equipement[] equipementEjecte = null;
		// précondition
		assert force > 0;
		int oldForce = force;
		forceCoup = calculResistanceEquipement(forceCoup);
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			equipementEjecte = ejecterEquipement();
			parler("J'abandonne...");
		}
		// post condition la force a diminuée
		assert force < oldForce;
		return equipementEjecte;
	}

	private int calculResistanceEquipement(int forceCoup) {
		String texte = "Ma force est de " + this.force + ", et la force du coup est de " + forceCoup;
		int resistanceEquipement = 0;
		if ((nbEquipement != 0)) {
			texte += "\nMais heureusement, grace à mon équipement sa force est diminué de ";
			for (int i = 0; i < nbEquipement; i++) {
				if ((equipements[i] != null && equipements[i].equals(Equipement.BOUCLIER))) {
					resistanceEquipement += 8;
				} else {
					System.out.println("Equipement casque");
					resistanceEquipement += 5;
				}
			}
			texte += resistanceEquipement + "!";
		}
		parler(texte);
		forceCoup -= resistanceEquipement;
		if (forceCoup < 0) {
			return 0;
		} else {
			return forceCoup;
		}
	}

	private Equipement[] ejecterEquipement() {
		Equipement[] equipementEjecte = new Equipement[nbEquipement];
		System.out.println("L'équipement de " + nom + " s'envole sous la force du coup.");
		int nbEquipementEjecte = 0;
		for (int i = 0; i < nbEquipement; i++) {
			if (equipements[i] != null) {
				equipementEjecte[nbEquipementEjecte] = equipements[i];
				nbEquipementEjecte++;
				equipements[i] = null;
			}
		}
		return equipementEjecte;
	}

	public void sEquiper(Equipement equipement) {
		switch (nbEquipement) {
		case 2:
			System.out.println("Le soldat Minus est déjà bien protégé !");
			break;
		case 1:

			if (equipements[0] == equipement) {
				System.out.println("Le soldat " + nom + " possède déjà un " + equipement + "!");

			} else {
				nbEquipement += 1;
				equipements[nbEquipement] = equipement;
				System.out.println("Le soldat " + nom + " s’équipe avec un " + equipement + ".");
			}
			break;
		case 0:
			equipements[nbEquipement] = equipement;
			nbEquipement += 1;
			System.out.println("Le soldat " + nom + " s’équipe avec un " + equipement + ".");
			break;
		default:
			System.out.println("petit erreur de nb equipement");
			break;
		}

	}

	public static void main(String[] args) {
		
	}

	public int getForce() {
		return force;
	}

}
