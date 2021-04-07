package com.kh.mini_Project.model;

public class ATM {
	private String fName;
	private String fOpenTime;
	private String fAddress;
	private String fImagePath;
	
	public ATM() {}

	public ATM(String fName, String fOpenTime, String fAddress, String fImagePath) {
		super();
		this.fName = fName;
		this.fOpenTime = fOpenTime;
		this.fAddress = fAddress;
		this.fImagePath = fImagePath;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getfOpenTime() {
		return fOpenTime;
	}

	public void setfOpenTime(String fOpenTime) {
		this.fOpenTime = fOpenTime;
	}

	public String getfAddress() {
		return fAddress;
	}

	public void setfAddress(String fAddress) {
		this.fAddress = fAddress;
	}

	public String getfImagePath() {
		return fImagePath;
	}

	public void setfImagePath(String fImagePath) {
		this.fImagePath = fImagePath;
	}

	@Override
	public String toString() {
		return "ATM [name=" + fName + ", fAddress=" + fAddress + ", openTime=" + fOpenTime + ", ImagePath"
				+ fImagePath;
	}
	
	
	
}
