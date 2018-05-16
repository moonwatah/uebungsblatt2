
public abstract class Medium {
	String name;
	String autor;
	int jahr;
	
	public Medium(String name, String autor, int jahr) {
		this.name=name;
		this.autor=autor;
		this.jahr=jahr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getJahr() {
		return jahr;
	}

	public void setJahr(int jahr) {
		this.jahr = jahr;
	}
}
