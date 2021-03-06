package io.javabrains.coronavirustracker.models;

public class LocationStats {
	private String State;
	private String country;
	private int latestTotalCases;
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public int getLatestTotalCases() {
		return latestTotalCases;
	}
	public void setLatestTotalCases(int latestTotalCases) {
		this.latestTotalCases = latestTotalCases;
	}
	@Override
	public String toString() {
		return "LocationStats [State=" + State + ", country=" + country + ", latestTotalCases=" + latestTotalCases
				+ "]";
	}
}
