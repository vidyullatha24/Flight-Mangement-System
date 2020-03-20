package com.capgemini.sprint.flightmgnt.application;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import com.capgemini.sprint.flightmgnt.dao.FlightMgntDao;
import com.capgemini.sprint.flightmgnt.dao.FlightMgntDaoImpl;
import com.capgemini.sprint.flightmgnt.dto.FlightMgnt;
import com.capgemini.sprint.flightmgnt.excep.FlightNotFoundException;
import com.capgemini.sprint.flightmgnt.service.FlightMgntService;
import com.capgemini.sprint.flightmgnt.service.FlightMgntServiceImpl;
public class FlightDetails {
		public static void main(String[] args) throws Exception
			{
			BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
			int choice=0;
			do{
				System.out.println("******MENU LIST******");
				System.out.println("1.Add Flight details");
				System.out.println("2.modify Flight Details");
				System.out.println("3.search Flight Details");
				System.out.println("4.delete Flight Details");
				System.out.println("5.List of the Flight Details");
				
				FlightMgntService fmservice=new FlightMgntServiceImpl();
				FlightMgntDao dao=new FlightMgntDaoImpl();
				System.out.println("Enter the option");
				choice=Integer.parseInt(sc.readLine());
				switch(choice)
				{
				case 1:
				{
					System.out.println("enter flight Number,source,destination,arrivaltime,departuretime");
					int Flight_Number=Integer.parseInt(sc.readLine());
					System.out.println("enter source");
					String source=sc.readLine();
					System.out.println("enter destination");
					String destination=sc.readLine();
					System.out.println("enter arrivaltime");
					String arrivaltime=sc.readLine();
					System.out.println("enter departuretime");
					String departuretime=sc.readLine();
					FlightMgnt fm=new FlightMgnt(Flight_Number,source,destination,arrivaltime,departuretime);
					fmservice.addFlight(fm);
					break;
				}
				case 2:
				{
					System.out.println("enter flight Number,source to be modified");
					int Flight_Number=Integer.parseInt(sc.readLine());
					System.out.println("enter source");
					String source=sc.readLine();
					FlightMgnt fm=new FlightMgnt();
					fm.setFlight_Number(Flight_Number);
					fm.setSource(source);
					boolean flag=dao.updateFlight(fm);
						if(flag==true)
							System.out.println("flight found");
					else
						//throw new FlightNotFoundException("Flight Not Found");
					fmservice=new FlightMgntServiceImpl();
					fmservice.updateFlight(fm);
					break;
				}
				case 3:
				{
					System.out.println("enter flight_Number to be searched");
					int Flight_Number=Integer.parseInt(sc.readLine());
					FlightMgnt fm=new FlightMgnt();
					fm.setFlight_Number(Flight_Number);
					boolean flag=dao.searchFlight(fm);
					try
					{
					if(flag)
						System.out.println("flight found");
					else
						throw new FlightNotFoundException("Flight Not Found");
					fmservice=new FlightMgntServiceImpl();
					fmservice.searchFlight(fm);
					break;
				}catch(FlightNotFoundException e)
				{
					System.out.println(e.getMessage());
				}
				}
				case 4:
				{
					System.out.println("enter flight_Number to be deleted");
					int Flight_Number=Integer.parseInt(sc.readLine());
					FlightMgnt fm=new FlightMgnt();
					fm.setFlight_Number(Flight_Number);
					boolean flag=dao.checkFlight_Number(fm);
					if(flag==true)
						System.out.println("flight found");
					else
						//throw new FlightNotFoundException("flight not found");
					fmservice=new FlightMgntServiceImpl();
					fmservice.deleteFlight(fm);
					break;
				}
				case 5:
				{
					fmservice=new FlightMgntServiceImpl();
					List<FlightMgnt> Flightlist=fmservice.getAllFlights();
					Flightlist.forEach(FlightMgnt->System.out.println(FlightMgnt));
					break;
				}
				case 6:
					System.exit(0);
					}
			        }
				while(choice<=6);
				}
				}


