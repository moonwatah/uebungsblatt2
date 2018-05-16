
public abstract class MediumPhysisch extends Medium {
	String besitzer;
	public MediumPhysisch(String name, String autor, int jahr, String besitzer) {
		super(name, autor, jahr);
		this.besitzer=besitzer;
	}
	public String getBesitzer() {
		return besitzer;
	}
	public void setBesitzer(String besitzer) {
		this.besitzer = besitzer;
	}
}
