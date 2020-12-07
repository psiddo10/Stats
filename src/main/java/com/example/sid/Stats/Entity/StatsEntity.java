package com.example.sid.Stats.Entity;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@Document
@Component
public class StatsEntity {
private long time;
	
	private double close;
	private double high;
	private double low;
	private double open;
	private double volumefrom;
	private double volumeto;
	private String conversionType;
	private double buy;
	private double sell;
	private long at;
	

	public StatsEntity() {}
	
	public void setAt(long at) {
		time = at;
	}


	public void setBuy(double buy) {
		close= buy;
		
	}

	

	
//	public void setSell(double close2) {
//		open = close2;
//	}


	
	


	public StatsEntity(int time, double close, double high, double low, double open, double volumefrom,
			double volumeto, String conversionType) {
		super();
		this.time = time;
		this.close = close;
		this.high = high;
		this.low = low;
		this.open = open;
		this.volumefrom = volumefrom;
		this.volumeto = volumeto;
		this.conversionType = conversionType;
	}
	
	


	public long getTime() {
		return time;
	}


	public void setTime(int time) {
		this.time = time;
	}


	public double getClose() {
		return close;
	}


	public void setClose(double close) {
		this.close = close;
	}


	public double getHigh() {
		return high;
	}


	public void setHigh(double high) {
		this.high = high;
	}


	public double getLow() {
		return low;
	}


	public void setLow(double low) {
		this.low = low;
	}


	public double getOpen() {
		return open;
	}


	public void setOpen(double open) {
		this.open = open;
	}


	public double getVolumefrom() {
		return volumefrom;
	}


	public void setVolumefrom(double volumefrom) {
		this.volumefrom = volumefrom;
	}


	public double getVolumeto() {
		return volumeto;
	}


	public void setVolumeto(double volumeto) {
		this.volumeto = volumeto;
	}


	public String getConversionType() {
		return conversionType;
	}


	public void setConversionType(String conversionType) {
		this.conversionType = conversionType;
	}
	
	
}
