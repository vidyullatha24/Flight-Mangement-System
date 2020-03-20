package com.capgemini.sprint.flightmgnt.dao;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.capgemini.sprint.flightmgnt.dto.FlightMgnt;
import com.capgemini.sprint.flightmgnt.util.DBconn;
public class FlightMgntDaoImpl implements FlightMgntDao{
	public boolean addFlight(FlightMgnt fm){
		boolean flag=false;
		try{
			Connection con=DBconn.getconnection();
			PreparedStatement pst=con.prepareStatement("insert into Flight_Details values(?,?,?,?,?)");
		pst.setInt(1, fm.getFlight_Number());
		pst.setString(2, fm.getSource());
		pst.setString(3, fm.getDestination());
		pst.setString(4, fm.getArrival());
		pst.setString(5, fm.getDeparture());
		pst.execute();
		System.out.println("Insertion done Successfully");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return flag;
	}
	public boolean updateFlight(FlightMgnt fm)
	{
		boolean flag=false;
		try{
			Connection con=DBconn.getconnection();
			PreparedStatement pst=con.prepareStatement("update Flight_Details set source=? where Flight_Number=?");
			pst.setInt(2, fm.getFlight_Number());
			pst.setString(1, fm.getSource());
			pst.execute();
			//System.out.println("update done Successfully");
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return flag;
	}
	public boolean deleteFlight(FlightMgnt fm){
		boolean flag=false;
		try{
			Connection con=DBconn.getconnection();
			PreparedStatement pst=con.prepareStatement("delete from Flight_Details where Flight_Number=?");
			pst.setInt(1, fm.getFlight_Number());
			pst.execute();
			System.out.println("deletion done Successfully");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return flag;
	}
	public boolean searchFlight(FlightMgnt fm)
	{
		boolean flag=false;
		ResultSet rs = null;
		try{
			Connection con=DBconn.getconnection();
			PreparedStatement pst=con.prepareStatement("select * from  Flight_Details  where Flight_Number=?");
			pst.setInt(1,fm.getFlight_Number());
			rs = pst.executeQuery();
			flag = rs.next();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return flag;
	}

	public List<FlightMgnt> getAllFlight()
	{
		List<FlightMgnt> alist=new ArrayList<FlightMgnt>();
		try
		{
			Connection con=DBconn.getconnection();
			Statement pst=con.createStatement();
			ResultSet rs=pst.executeQuery("select * from Flight_Details");
			while(rs.next())
			{
				FlightMgnt fm=new FlightMgnt();
				fm.setFlight_Number(rs.getInt(1));
				fm.setSource(rs.getString(2));
				fm.setDestination(rs.getString(3));
				fm.setArrival(rs.getString(4));
				fm.setDeparture(rs.getString(5));
				alist.add(fm);
			}
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return alist;
	}
	public boolean checkFlightid(FlightMgnt fm){
		boolean flag=false;
		try{
			Connection con=DBconn.getconnection();
			PreparedStatement pst=con.prepareStatement("select * from Flight_Details  where Flight_Number=?");
			pst.setInt(1,fm.getFlight_Number());
			ResultSet rs=pst.executeQuery();
			if(rs.next())
				flag=true;
			else
				flag=false;
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return flag;
		}
	@Override
	public boolean checkFlight_Number(FlightMgnt fm) {
		// TODO Auto-generated method stub
		return false;
	}

	}

