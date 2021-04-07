package com.kh.mini_Project.model.vo;

public class Culture {
	private String cName;
	private String cAddress;
	private String cTelenumber;
	private String cImagePath;

	public Culture() {}
	
	public Culture(String cName, String cAddress, String cTelenumber, String cImagePath) {
		super();
		
		this.cName = cName;
		this.cAddress = cAddress;
		this.cTelenumber = cTelenumber;
		this.cImagePath = cImagePath;
	
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcAddress() {
		return cAddress;
	}

	public void setcAddress(String cAddress) {
		this.cAddress = cAddress;
	}

	public String getcTelenumber() {
		return cTelenumber;
	}

	public void setcTelenumber(String cTelenumber) {
		this.cTelenumber = cTelenumber;
	}

	public String getcImagePath() {
		return cImagePath;
	}

	public void setcImagePath(String cImagePath) {
		this.cImagePath = cImagePath;
	}
	



	@Override
	public String toString() {
		return " 문화시설 = " + cName + ", 주소 = " + cAddress + ", 전화번호 = " + cTelenumber + ", 이미지 주소 = "
				+ cImagePath;
	}
	
	
	
	
}
