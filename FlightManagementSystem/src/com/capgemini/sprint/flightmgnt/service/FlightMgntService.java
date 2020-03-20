package com.capgemini.sprint.flightmgnt.service;
import java.util.List;

import com.capgemini.sprint.flightmgnt.dto.FlightMgnt;

public interface FlightMgntService {

		void addFlight(FlightMgnt fm);
		public void updateFlight(FlightMgnt fm);
		public void deleteFlight(FlightMgnt fm);
		public void searchFlight(FlightMgnt fm);
		public List<FlightMgnt> getAllFlights();
	}

