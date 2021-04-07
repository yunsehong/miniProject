package com.kh.mini_Project.model;

import java.io.Serializable;

public class Hotel implements Comparable<Hotel>, Serializable{

	private static final long serialVersionUID = -4373329522202316326L;
	private String name;
	private String price;
	private String grade;
	private String address;
	private String call;
	private String checkTime;
	private String parking;
	private int useableRoom;
	
	public Hotel() {}

	public Hotel(String name, String price, String grade, String address, String call, String checkTime, String parking,
			int useableRoom) {
		super();
		this.name = name;
		this.price = price;
		this.grade = grade;
		this.address = address;
		this.call = call;
		this.checkTime = checkTime;
		this.parking = parking;
		this.useableRoom = useableRoom;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	
	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getCall() {
		return call;
	}


	public void setCall(String call) {
		this.call = call;
	}


	public String getCheckTime() {
		return checkTime;
	}


	public void setCheckTime(String checkTime) {
		this.checkTime = checkTime;
	}


	public String getParking() {
		return parking;
	}


	public void setParking(String parking) {
		this.parking = parking;
	}


	public int getUseableRoom() {
		return useableRoom;
	}


	public void setUseableRoom(int useableRoom) {
		this.useableRoom = useableRoom;
	}


	

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((call == null) ? 0 : call.hashCode());
		result = prime * result + ((checkTime == null) ? 0 : checkTime.hashCode());
		result = prime * result + ((grade == null) ? 0 : grade.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((parking == null) ? 0 : parking.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result + useableRoom;
		return result;
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hotel other = (Hotel) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (call == null) {
			if (other.call != null)
				return false;
		} else if (!call.equals(other.call))
			return false;
		if (checkTime == null) {
			if (other.checkTime != null)
				return false;
		} else if (!checkTime.equals(other.checkTime))
			return false;
		if (grade == null) {
			if (other.grade != null)
				return false;
		} else if (!grade.equals(other.grade))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (parking == null) {
			if (other.parking != null)
				return false;
		} else if (!parking.equals(other.parking))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		if (useableRoom != other.useableRoom)
			return false;
		return true;
	}




	@Override
	public String toString() {
		return "Hotel [name=" + name + ", price=" + price + ", grade=" + grade + ", address=" + address + ", call="
				+ call + ", checkTime=" + checkTime + ", parking=" + parking + ", useableRoom=" + useableRoom + "]";
	}


	@Override
	public int compareTo(Hotel o) {
		
		return grade.compareTo(o.getGrade());
	}

	public String displayOnList() {
		return this.name + " " + this.grade + "성급 ₩ " + this.price;
	}
	
}
