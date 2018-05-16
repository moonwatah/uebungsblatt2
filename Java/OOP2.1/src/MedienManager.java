import java.util.*;

public class MedienManager {
	ArrayList<Medium> medienListe = new ArrayList<>();

	public MedienManager() {
	}

	public void add(Medium m) {
		medienListe.add(m);
	}

	public boolean suche(String name) {
		if (medienListe != null) {
			for (int i = 0; i < medienListe.size(); i++) {
				if (medienListe.get(i).getName().contains(name)) {
					Medium m = medienListe.get(i);
					if (m instanceof Buch) {
						System.out.println(name + " ist bei " + ((Buch) m).besitzer);
						return true;
					}
					if (m instanceof EBuch) {
						System.out.println(name + " zu finden in " + ((EBuch) m).pfad);
						return true;
					}
					if (m instanceof Film) {
						System.out.println(name + " ist bei " + ((Film) m).besitzer);
						return true;
					}
					if (m instanceof EFilm) {
						System.out.println(name + " zu finden in " + ((EFilm) m).pfad);
						return true;
					}
					if (m instanceof Foto) {
						System.out.println(name + " ist bei " + ((Foto) m).besitzer);
						return true;
					}
					if (m instanceof EFoto) {
						System.out.println(name + " zu finden in " + ((EFoto) m).pfad);
						return true;
					}
					if (m instanceof Musik) {
						System.out.println(name + " ist bei " + ((Musik) m).besitzer);
						return true;
					}
					if (m instanceof EMusik) {
						System.out.println(name + " zu finden in " + ((EMusik) m).pfad);
						return true;
					}
				}
				System.out.println("! ! !  NICHTS GEFUNDEN  ! ! !");
				return false;
			}

		}
		System.out.println("! ! !  ERROR MEDIENLISTE LEER  ! ! !");
		return false;
	}
}
