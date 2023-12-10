package com.flight;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class AggregatorService {

	private List<AirlineSearchInterface> list;

	private ExecutorService executorService;

	public AggregatorService(List<AirlineSearchInterface> list) {
		this.list = list;
		executorService = Executors.newFixedThreadPool(list.size());
	}

	public List<FlightData> getAllFlightData(String src, String dst) throws InterruptedException, ExecutionException {
		List<Callable> CallableList = new ArrayList<>();
		List<FlightData> result = new ArrayList<>();
		List<Future<FlightData>> listOfFlightData = new ArrayList<>();
		for (AirlineSearchInterface impl : list) {
			CallableList.add(() -> {
				return impl.getAllFlightData(src, dst);
			});
		}
		for (Callable c : CallableList) {
			listOfFlightData.add(executorService.submit(c));
		}

		for (Future<FlightData> z : listOfFlightData) {
			result.addAll((Collection<? extends FlightData>) z.get());
		}
		return result;
	}
}
