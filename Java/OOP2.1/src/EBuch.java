
public class EBuch extends MediumElektronisch{
	String verlag;
	public EBuch(String name, String autor, int jahr, String verlag, String pfad) {
		super(name, autor, jahr, pfad);
		this.verlag=verlag;
	}
	public String getVerlag() {
		return verlag;
	}
	public void setVerlag(String verlag) {
		this.verlag = verlag;
	}

}
