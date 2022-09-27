package personnages;



public class Viking {

	private String nom ;
	private int force ;
	private int effetPotion=1 ;

public Viking(String nom, int force) {
	super();
	this.nom = nom;
	this.force = force;
}

public String getNom() {
	return nom;
}

@Override
public String toString() {
	return "Viking [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
}

public static void main(String[] args) {
	
	
	}
public void parler(String texte) {
	System.out.println("test");
}



}

