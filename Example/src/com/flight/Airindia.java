package com.flight;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Airindia implements AirlineSearchInterface {

	@Override
	public List<FlightData> getAllFlightData(String src, String dst) {
		List<FlightData> list = new ArrayList<>();
		FlightData flightData1 = new FlightData("lko","ndls",new Date(),2.5,2500,"AirIndia");
		FlightData flightData2 = new FlightData("lko","ndls",new Date(),2,3500,"AirIndia");
		FlightData flightData3 = new FlightData("lko","ndls",new Date(),1,1500,"AirIndia");
		FlightData flightData4 = new FlightData("lko","ndls",new Date(),4,2800,"AirIndia");
		list.add(flightData1);
		list.add(flightData2);
		list.add(flightData3);
		list.add(flightData4);
		return list;
	}

}
