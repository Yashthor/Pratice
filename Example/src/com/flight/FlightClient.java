package com.flight;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class FlightClient {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		AirlineSearchInterface airlineSearchInterface1 = new Airindia();
		AirlineSearchInterface airlineSearchInterface2 = new Indigo();
		AirlineSearchInterface airlineSearchInterface3 = new SpiceJet();
		List<AirlineSearchInterface> list = new ArrayList<>();
		list.add(airlineSearchInterface1);
		list.add(airlineSearchInterface2);
		list.add(airlineSearchInterface3);
		
		AggregatorService aggregatorService = new AggregatorService(list);
		System.out.println(aggregatorService.getAllFlightData("lko", "ndls"));

	}

}
