package h1;

import java.util.ArrayList;

public class PrioListe {
	
	public ArrayList<Patient>myList = new ArrayList<Patient>();
	
	public void addpatient(Patient p) {
		int i = 0;
		while (i < myList.size() && myList.get(i).getPrio() < p.getPrio()) {
			i++;
		}
		myList.add(i,p);
	}
	
	public Patient getNextPatient() {
		if(myList.isEmpty()) {
			return null;
		}
		return myList.remove(0);
	}
	
	public int getPosition(Patient p) {
		return myList.indexOf(p);
		}
}



