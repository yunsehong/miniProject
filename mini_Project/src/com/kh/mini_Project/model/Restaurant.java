package com.kh.mini_Project.model;

public class Restaurant {
	private String fName;  // 지점명 
	private String Address; // 주소 
	private String fTeleNumber; // 전화번호 
	private String Time; // 영업시간 
	private String fImagePath;   // 이미지 지도 
	
	public Restaurant() {}

	public Restaurant(String fName, String address, String fTeleNumber, String time, String fImagePath) {
		super();
		this.fName = fName;
		Address = address;
		this.fTeleNumber = fTeleNumber;
		Time = time;
		this.fImagePath = fImagePath;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getfTeleNumber() {
		return fTeleNumber;
	}

	public void setfTeleNumber(String fTeleNumber) {
		this.fTeleNumber = fTeleNumber;
	}

	public String getTime() {
		return Time;
	}

	public void setTime(String time) {
		Time = time;
	}

	public String getfImagePath() {
		return fImagePath;
	}

	public void setfImagePath(String fImagePath) {
		this.fImagePath = fImagePath;
	}

	@Override
	public String toString() {
		return "음식점명: " + fName + ", 주소:" + Address + ", 전화번호:" + fTeleNumber + ", 영업시간: " + Time
				+ ", 이미지" + fImagePath + "]";
	}

	

	}

	