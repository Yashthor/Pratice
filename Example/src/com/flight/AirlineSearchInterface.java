package com.flight;

import java.util.List;

public interface AirlineSearchInterface {
	
	public List<FlightData> getAllFlightData(String src, String dst);

}
