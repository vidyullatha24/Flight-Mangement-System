package com.capgemini.sprint.flightmgnt.service;
import java.util.List;
import com.capgemini.sprint.flightmgnt.dao.FlightMgntDao;
import com.capgemini.sprint.flightmgnt.dao.FlightMgntDaoImpl;
import com.capgemini.sprint.flightmgnt.dto.FlightMgnt;
public class FlightMgntServiceImpl implements FlightMgntService 
{
	FlightMgntDao fmdao=new FlightMgntDaoImpl();
	public void addFlight(FlightMgnt fm)
	{
		fmdao.addFlight(fm);
	}

	public void updateFlight(FlightMgnt fm)
	{
		fmdao.updateFlight(fm);
	}
	public  void deleteFlight(FlightMgnt fm)
	{
		fmdao.deleteFlight(fm);
	}
	public void searchFlight(FlightMgnt fm)
	{
		fmdao.searchFlight(fm);
	}
	public List<FlightMgnt> getAllFlights()
	{
		List<FlightMgnt>alist=fmdao.getAllFlight();
		return alist;
	}
	}
