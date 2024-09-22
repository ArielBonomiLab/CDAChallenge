package com.bonomia.cda.dto;

public class Station {
	
	private long stationId;
	private String name;
	
	public Station() {}
	
	public Station(int stationId, String name) {
		this.stationId = stationId;
		this.name = name;
	}
	
	public long getStationId() {
		return stationId;
	}
	public void setStationId(long stationId) {
		this.stationId = stationId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
