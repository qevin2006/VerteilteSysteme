package Client;

import java.util.List;

import de.mbg.webservice.client.gen.Mitarbeiter;
import de.mbg.webservice.client.gen.MitarbeiterService;
import de.mbg.webservice.client.gen.MitarbeiterServiceService;

public class Client {
	public static void main(String[] args) {
		MitarbeiterServiceService service = new MitarbeiterServiceService();
		MitarbeiterService mitarbeiter = service.getMitarbeiterServicePort();
		Mitarbeiter m = mitarbeiter.add(123, "kevko");
		// System.out.println(mitarbeiter.getName(m));
		int i = mitarbeiter.getpersNr(m);
		System.out.println(i);
		List<Mitarbeiter> all = mitarbeiter.getall();
		System.out.println(all);
	}

}
