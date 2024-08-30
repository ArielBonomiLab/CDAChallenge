package com.bonomia.cda.dto;

public class Path {
	
	private long pathId;
	private long sourceId;
	private long destinationId;
	private double cost;
	
	public Path() {}

	public Path(long pathId, long sourceId, long destinationId, double cost) {
		this.pathId = pathId;
		this.sourceId = sourceId;
		this.destinationId = destinationId;
		this.cost = cost;
	}

	public long getPathId() {
		return pathId;
	}

	public void setPathId(long pathId) {
		this.pathId = pathId;
	}

	public long getSourceId() {
		return sourceId;
	}

	public void setSourceId(long sourceId) {
		this.sourceId = sourceId;
	}

	public long getDestinationId() {
		return destinationId;
	}

	public void setDestinationId(long destinationId) {
		this.destinationId = destinationId;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

}
