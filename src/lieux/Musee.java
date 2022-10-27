package lieux;

import personnages.*;

public class Musee {
	private Trophee[] trophees = new Trophee[200];
	private int nbTrophees = 0;

	public void donnerTrophees(Gaulois gaulois, Equipement equipement) {

		this.trophees[nbTrophees] = new Trophee(gaulois, equipement);
		nbTrophees += 1;
	}

	public String extraireInstructionsCaml() {
		String texte = "let musee = [\n";
		for (int i = 0; i < nbTrophees; i++) {
			String nom = trophees[i].donnerNom();
			Equipement equipement = trophees[i].getEquipement();
			if (nbTrophees - 1 != i) {
				texte += "\"" + nom + "\"," + "\"" + equipement + "\";\n";
			} else {
				texte += "\"" + nom + "\"," + "\"" + equipement + "\"\n";
			}
		}
		texte += "]";
		return texte;
	}

	public static void main(String[] args) {

	}
}
