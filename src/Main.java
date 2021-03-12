import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Chien Boney = new Chien (40, 12, "Boney", "bon chien");
		Chien Cerise = new Chien (20, 14, "Cerise", "Yorkshire");
		Rat Jerma = new Rat ();
		Etudiant Mathis = new Etudiant ("Bonjour", "Mathis", 21, "BTS SIO", Boney);
		List<Chien> chenil = new ArrayList<Chien>();
		chenil.add(Boney);
		chenil.add(Cerise);
		
		Mathis.ajouterChien(Boney);
		Mathis.ajouterChien(Cerise);

		Mathis.sePresenter();
		}

}
