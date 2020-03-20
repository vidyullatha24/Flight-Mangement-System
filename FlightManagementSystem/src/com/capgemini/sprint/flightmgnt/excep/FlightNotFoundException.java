package com.capgemini.sprint.flightmgnt.excep;

@SuppressWarnings("serial")
public class FlightNotFoundException extends Exception{
	public FlightNotFoundException(String msg)
	{
		super("Flight Not Found");
	}
}
