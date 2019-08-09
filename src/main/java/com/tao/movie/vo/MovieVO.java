package com.tao.movie.vo;

import java.io.Serializable;

import com.tao.movie.domain.Movie;

public class MovieVO extends Movie implements Serializable{
	private String uptiemStart;
	private String uptimeEnd;
	private String longtimeStart;
	private String longtimeEnd;
	private String priceStart;
	private String priceEnd;
	public String getUptiemStart() {
		return uptiemStart;
	}
	public void setUptiemStart(String uptiemStart) {
		this.uptiemStart = uptiemStart;
	}
	public String getUptimeEnd() {
		return uptimeEnd;
	}
	public void setUptimeEnd(String uptimeEnd) {
		this.uptimeEnd = uptimeEnd;
	}
	public String getLongtimeStart() {
		return longtimeStart;
	}
	public void setLongtimeStart(String longtimeStart) {
		this.longtimeStart = longtimeStart;
	}
	public String getLongtimeEnd() {
		return longtimeEnd;
	}
	public void setLongtimeEnd(String longtimeEnd) {
		this.longtimeEnd = longtimeEnd;
	}
	public String getPriceStart() {
		return priceStart;
	}
	public void setPriceStart(String priceStart) {
		this.priceStart = priceStart;
	}
	public String getPriceEnd() {
		return priceEnd;
	}
	public void setPriceEnd(String priceEnd) {
		this.priceEnd = priceEnd;
	}
}
