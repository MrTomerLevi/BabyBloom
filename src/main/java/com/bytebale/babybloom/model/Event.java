package com.bytebale.babybloom.model;

import java.util.Date;

public class Event {
	String type;
	String comments;
	Date time;
	
	
	public Event(){}
	
	public Event(String type, String comments, Date time) {
		super();
		this.type = type;
		this.comments = comments;
		this.time = time;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "Event [type=" + type + ", comments=" + comments + ", time="
				+ time + "]";
	}
	
   
}
