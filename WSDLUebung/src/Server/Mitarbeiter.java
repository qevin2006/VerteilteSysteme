package Server;

public class Mitarbeiter implements java.io.Serializable {

	int personalnummer;
	String name;

	public Mitarbeiter() {
		super();
	}

	public Mitarbeiter(int personalnummer, String name) {
		super();
		this.personalnummer = personalnummer;
		this.name = name;
	}

	public int getPersonalnummer() {
		return personalnummer;
	}

	public void setPersonalnummer(int personalnummer) {
		this.personalnummer = personalnummer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + personalnummer;
		return result;
	}

	@Override
	public boolean equals(Object obj) {

		Mitarbeiter other = (Mitarbeiter) obj;
		if (!name.equals(other.name))
			return false;
		if (personalnummer != other.personalnummer)
			return false;
		return true;
	}

}
