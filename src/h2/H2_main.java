package h2;

public class H2_main {
	public static void main(String[] args) {
		Bus busA = new Bus();
		Bus busB = new Bus();
		
		busA.enterBus(new Passenger("Anna", 2, true));
		busA.enterBus(new Passenger("Ben", 1, false));
		busA.enterBus(new Passenger("Clara", 3, true));
		
		System.out.println(busA);
		System.out.println(busB);
		
		busA.nextStop();
		System.out.println(busA);
		
		var ohneTicket = busA.findPassengersWithoutTickets();
		System.out.println("ohne Ticket: " + ohneTicket.stream().map(Passenger::getName).toList());
		
		busA.transferPassengers(busB, new String[] {"Anna", "Clara"});
		System.out.println("Bus A nach Umstieg: " + busA);
		System.out.println("Bus B nach Umstieg: " + busB);
	}
}
