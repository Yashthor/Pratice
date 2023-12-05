package com.flight;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Indigo implements AirlineSearchInterface {

	@Override
	public List<FlightData> getAllFlightData(String src, String dst) {
		List<FlightData> list = new ArrayList<>();
		FlightData flightData1 = new FlightData("lko","ndls",new Date(),3,6500,"Indigo");
		FlightData flightData2 = new FlightData("lko","ndls",new Date(),2,3500,"Indigo");
		FlightData flightData3 = new FlightData("lko","ndls",new Date(),1,5500,"Indigo");
		FlightData flightData4 = new FlightData("lko","ndls",new Date(),4,2800,"Indigo");
		list.add(flightData1);
		list.add(flightData2);
		list.add(flightData3);
		list.add(flightData4);
		return list;
	}

}
