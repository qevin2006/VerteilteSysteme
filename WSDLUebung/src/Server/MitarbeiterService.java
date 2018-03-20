package Server;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

@WebService
public class MitarbeiterService {
	List<Mitarbeiter> all = new ArrayList<Mitarbeiter>();

	public Mitarbeiter add(int persNr, String name) {
		Mitarbeiter m = new Mitarbeiter(persNr, name);
		all.add(m);
		return m;
	}

	public Mitarbeiter search(int persnr) {
		for (Mitarbeiter m : all) {
			if (m.getPersonalnummer() == persnr) {
				return m;
			}
		}
		return null;
	}

	public boolean setpersNr(Mitarbeiter m, int persnr) {
		for (Mitarbeiter mi : all) {
			if (m.equals(mi)) {
				mi.setPersonalnummer(persnr);
				return true;
			}
		}
		return false;
	}

	public boolean setName(Mitarbeiter m, String name) {
		for (Mitarbeiter mi : all) {
			if (m.equals(mi)) {
				mi.setName(name);
				return true;
			}
		}
		return false;
	}

	public int getpersNr(Mitarbeiter m) {
		for (Mitarbeiter mi : all) {
			if (m.equals(mi)) {
				return mi.getPersonalnummer();
			}
		}
		return 0;
	}

	public String getName(Mitarbeiter m) {
		for (Mitarbeiter mi : all) {
			if (m.equals(mi)) {
				return mi.getName();
			}
		}
		return null;
	}

	public List<Mitarbeiter> getall() {

		return all;
	}
}
