package com.capgemini.sprint.flightmgnt.dto;

public class FlightMgnt {
		private int Flight_Number;
		private String source;
		private String destination;
		private String departure;
		private String arrival;
		public FlightMgnt(){
			super();
		}
		@Override
		public String toString() {
			return "Flight [Flight_Number=" + Flight_Number + ", source=" + source + ", destination=" + destination + ", departure="
					+ departure + ", arrival=" + arrival + "]";
		}
		public FlightMgnt(int Flight_Number,String source,String destination,String arrival,String departure)
		{
			super();
			this.Flight_Number=Flight_Number;
			this.arrival=arrival;
			this.source=source;
			this.destination=destination;
			this.departure=departure;
		}
		public int getFlight_Number() {
			return Flight_Number;
		}
		public void setFlight_Number(int flight_Number) {
			Flight_Number = flight_Number;
		}
		public String getSource() {
			return source;
		}
		public void setSource(String source) {
			this.source = source;
		}
		public String getDestination() {
			return destination;
		}
		public void setDestination(String destination) {
			this.destination = destination;
		}
		public String getDeparture() {
			return departure;
		}
		public void setDeparture(String departure) {
			this.departure = departure;
		}
		public String getArrival() {
			return arrival;
		}
		public void setArrival(String arrival) {
			this.arrival = arrival;
		}
}

