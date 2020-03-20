package com.capgemini.sprint.flightmgnt.test;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.capgemini.sprint.flightmgnt.dao.FlightMgntDao;
import com.capgemini.sprint.flightmgnt.dao.FlightMgntDaoImpl;
import org.junit.Assert;
class FlightMgntTest {
FlightMgntDao fmdao = null;
@Before
 public void setUp()
 {
    fmdao = new FlightMgntDaoImpl();
 }
@After
 public void tearDown()
 {
   fmdao=null;
 }
@Test
 void testUpdateFlightPositive()
 {
 Assert.assertEquals(true,fmdao.updateFlight(1,"hyderabad","chennai","7:00","9:00"));
 }
@Test
 void testUpdateFlightNegative() 
 {
 Assert.assertNotEquals(true,fmdao.updateFlight(1,"hyderabad","chennai"," "," "));
 Assert.assertNotEquals(true,fmdao.updateFlight(1," "," ","7:00","9:00"));
 }
@Test
 void testSearchFlightPositive()
 {
 Assert.assertEquals(true,fmdao.searchFlight(1,"hyderabad","chennai","7:00","9:00"));
 }
@Test
 void testSearchFlightNegative() 
 {
 Assert.assertNotEquals(true,fmdao.searchFlight(1,"hyderabad","chennai"," "," "));
 Assert.assertNotEquals(true,fmdao.searchFlight(1," "," ","7:00","9:00"));
 }
}
