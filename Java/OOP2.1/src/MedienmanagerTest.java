
public class MedienmanagerTest {
	public static void main(String[] args) {
		MedienManager m = new MedienManager();
		m.add(new EBuch("Objektorientierte Programmierung in Java", "Niemann, Alexander", 2012, "bhv",
				"/Dokumente/Uni/eBooks"));
		m.add(new Buch("Java ist auch eine Insel", "Ullenboom, Christian", 2011, "Gallileo", "HWR Lichtenberg"));
		System.out.println("***************************");
		System.out.println("Erste Suche nach \"Java\": ");
		System.out.println("***************************");
		m.suche("Java");

		System.out.println("***************************");
		System.out.println("Erweiterung um Medium (Digitalfoto).");
		System.out.println("Zweite Suche nach \"Java\":");
		System.out.println("***************************");
		m.add(new EFoto("Java-Funktionen", "Bert", 2016, "C:\\Java\\Bilder"));
		m.suche("Java");
	}
}
