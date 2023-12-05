package com.flight;

import java.util.Date;

public class FlightData {
	
	private String src;
	
	private String dst;
	
	private Date date;
	
	private double duration;
	
	private double cost;
	
	private String airlineName;

	public FlightData(String src, String dst, Date date, double duration, double cost, String airlineName) {
		this.src = src;
		this.dst = dst;
		this.date = date;
		this.duration = duration;
		this.cost = cost;
		this.airlineName = airlineName;
	}

	public String getSrc() {
		return src;
	}

	public void setSrc(String src) {
		this.src = src;
	}

	public String getDst() {
		return dst;
	}

	public void setDst(String dst) {
		this.dst = dst;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getAirlineName() {
		return airlineName;
	}

	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}

	@Override
	public String toString() {
		return "FlightData [src=" + src + ", dst=" + dst + ", date=" + date + ", duration=" + duration + ", cost="
				+ cost + ", airlineName=" + airlineName + "]";
	}
	
	

}
