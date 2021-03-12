import java.util.ArrayList;
import java.util.List;

public class Etudiant {
	private String nom;
	private String prenom;
	private int age;
	private String classe;
	private Chien chien;
	private List<Chien> chiens; 
	
	public Etudiant(String nom, String prenom, int age, String classe, Chien chien) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.classe = classe;
		this.chiens= new ArrayList<>();
	}
	public void sePresenter() {
		System.out.println("Bonjour, je suis " + prenom + " " + nom + ", j'ai " + age + " ans, je suis en " + classe + " et voici mes chiens :");
		for (int i=0; i<chiens.size(); i++) {
			chiens.get(i).sePresenter();
		}
	}
	public void ajouterChien(Chien p_chien) {
		chiens.add(p_chien);
	}
	
}


