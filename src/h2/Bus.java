package h2;

import java.util.ArrayList;

public class Bus {
	
	public ArrayList<Passenger>passengers;
	
	public Bus() {
		passengers = new ArrayList<>();
	}
	
	public void enterBus(Passenger p) {
		passengers.add(p);
	}
	
	private void exitBus() {
		ArrayList<Passenger>entfernen = new ArrayList<>();
		for(Passenger p : passengers) {
			if(p.getPlanned() == p.getVisited()) {
				entfernen.add(p);
			}
		}
		passengers.removeAll(entfernen);
	}
	
	public void nextStop(Passenger[] boarding) {
		for(Passenger p : passengers) {
			p.visited++;
		}
		exitBus();
		for(Passenger p : boarding) {
			enterBus(p);
		}
	}
		
	public void nextStop() {
		for(Passenger p : passengers) {
			p.visited++;
		}
		exitBus();
		}
	
	public ArrayList<Passenger> findPassengersWithoutTickets() {
		ArrayList<Passenger>gefundeneOhneTicket = new ArrayList<>();
		for(Passenger p : passengers) {
			if(p.getTicket() == false) {
				gefundeneOhneTicket.add(p);
			}
			passengers.removeAll(gefundeneOhneTicket);
			}
		return gefundeneOhneTicket;
	  }
	
	public void transferPassengers(Bus otherBus, String[] passengerNames) {
		ArrayList<Passenger>transfer = new ArrayList<>();
		for(String name : passengerNames) {
			for(Passenger p : passengers) {
				if(p.getName().equals(name)) {
					transfer.add(p);
					}
			}
		}
	}
	}

