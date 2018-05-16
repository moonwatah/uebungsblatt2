
public abstract class MediumElektronisch extends Medium{
	String pfad;
	public MediumElektronisch(String name, String autor, int jahr, String  pfad) {
		super(name,autor,jahr);
		this.pfad=pfad;
	}
	public String getPfad() {
		return pfad;
	}
	public void setPfad(String pfad) {
		this.pfad = pfad;
	}
}
