package h1;

public class H1_main {
	public static void main(String[] args) {
		PrioListe prioListe = new PrioListe();
		prioListe.addpatient(new Patient("A",1));
		prioListe.addpatient(new Patient("B",10));
		prioListe.addpatient(new Patient("C",5));
		prioListe.addpatient(new Patient("D",7));
		
		System.out.println(prioListe.getNextPatient().getName());
		System.out.println(prioListe.getNextPatient().getName());
		System.out.println(prioListe.getNextPatient().getName());
		System.out.println(prioListe.getNextPatient().getName());

	}
}
