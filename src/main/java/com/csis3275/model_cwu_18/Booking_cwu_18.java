package com.csis3275.model_cwu_18;

import java.sql.Date;
import java.sql.Time;

import org.springframework.format.annotation.DateTimeFormat;

public class Booking_cwu_18 {

	private int booking_id;
	private Date dateTime;
	private Time startTime;
	private Time endTime;
	private String title;
	private String description;
	private int user_id;
	private String room_id;
	
	
	public int getBooking_id() {
		return booking_id;
	}
	public void setBooking_id(int booking_id) {
		this.booking_id = booking_id;
	}
	public Time getStartTime() {
		return startTime;
	}
	@DateTimeFormat(pattern = "HH:mm")
	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}
	public Time getEndTime() {
		return endTime;
	}
	@DateTimeFormat(pattern = "HH:mm")
	public void setEndTime(Time endTime) {
		this.endTime = endTime;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getRoom_id() {
		return room_id;
	}
	public void setRoom_id(String room_id) {
		this.room_id = room_id;
	}
	public Date getDateTime() {
		return dateTime;
	}
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
}
