package com.capgemini.sprint.flightmgnt.dao;
import java.util.List;
import com.capgemini.sprint.flightmgnt.dto.FlightMgnt;

public interface FlightMgntDao {
	public boolean addFlight(FlightMgnt fm);
	public boolean updateFlight(FlightMgnt fm);
	public boolean searchFlight(FlightMgnt fm);
	public boolean deleteFlight(FlightMgnt fm);
	public List<FlightMgnt> getAllFlight(); 
	public boolean checkFlight_Number(FlightMgnt fm);
}