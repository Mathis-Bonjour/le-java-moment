import java.util.ArrayList;
import java.util.List;

public class Class {
	public String libelle;
	public List<Etudiant> etudiants;
	
	public Class(String libelle) {
		this.libelle = libelle;
		this.etudiants = new ArrayList<>();
	}
	
	public Etudiant getEtudiant(int index) {
		return etudiants.get(index);
	}
	
	public void ajouterEtudiant(Etudiant etudiant) {
		etudiants.add(etudiant);
	}
	
	public void retirerEtudiant(int numéroEtudiant) {
		etudiants.remove(numéroEtudiant);
	}
	
	public void presenterClasse() {
		System.out.println("Je suis en classe de " + libelle);
		for (int i = 0; i < etudiants.size(); i++) {
		System.out.println(etudiants);
		}
	}

}
