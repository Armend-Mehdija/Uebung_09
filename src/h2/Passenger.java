package h2;

public class Passenger {
	public String name;
	public int planned; int visited;
	public boolean ticket;
	
	public Passenger(String name, int planned, boolean ticket) {
		this.name = name;
		this.planned = planned;
		this.ticket = ticket;
		this.visited = 0;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPlanned() {
		return planned;
	}
	
	public boolean getTicket() {
		return ticket;
	}
	
	public int getVisited() {
		return visited;
	}
}
