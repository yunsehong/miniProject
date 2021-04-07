package com.kh.mini_Project.controller;

import java.util.ArrayList;
import com.kh.mini_Project.dao.HotelDao;
import com.kh.mini_Project.model.Hotel;

public class HotelController {
	private ArrayList<Hotel> list = new ArrayList<>();
	private HotelDao hd = new HotelDao();
	
	public HotelController() {
		this.initialize();
	}
	
	public ArrayList<Hotel> selectList(){
		return list;
	}
	
	public ArrayList<Hotel> searchList(String input) {
		ArrayList<Hotel> search = new ArrayList<>();
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getName().contains(input)) {
				search.add(list.get(i));
			}
		}
		return search; 
	}

	public ArrayList<Hotel> addFavorite() {
		ArrayList<Hotel> favorList = new ArrayList<>();
		
		return favorList;
	}
	
	public void loadDetail() {	// ������ �����ֱ�(facility.txt)
		
	}
	
	public void viewReview() {	// ����
		
	}
	
	public void viewMap() {	// ����
		
	}

	public void addList(Hotel hotel) {
		list.add(hotel);
		
	}
	public void loadHotelList() {
		list = hd.fileOpen();
	}
	
	public void saveHotelList() {
		hd.fileSave(list);
	}

	
	private void initialize() {
		// ȣ�ڸ���Ʈ ����
		Hotel[] hotel = new Hotel[20];
		// ��� ����
		String one = "1";
		String two = "2";
		String thr = "3";
		String fou = "4";
		String fiv = "5";
		// üũ��,üũ�ƿ� �ð� ����
		String ck1 = "üũ�� 15:00 / üũ�ƿ� 12:00";
		String ck2 = "üũ�� 15:00 / üũ�ƿ� 11:00";
		String ck3 = "üũ�� 14:00 / üũ�ƿ� 12:00";
		// ���� ����
		String park1 = "����(1��) 15,000��";
		String park2 = "����(1��) 10,000��";
		String park3 = "����(1��) 5,000��";
		String park4 = "����(1��) ����";
		String park5 = "���� �Ұ�";
		// 5
		hotel[0] = new Hotel("�ȴ��� ���� ����","292,500",fiv,"����Ư���� ������ ������ 854","02-2193-1234",ck1,park1,10);
		hotel[1] = new Hotel("������Ƽ��Ż �׷��� ���� �ĸ�����","192,000",fiv,"����Ư���� ������ �Ｚ1�� ������� 521","02-555-5656",ck1,park4,3);
		hotel[2] = new Hotel("JW �޸���Ʈ ȣ�� ����","280,000",fiv,"����Ư���� ������ ���ʱ� �Ź����� 176","02-6282-6262",ck1,park1,5);
		hotel[3] = new Hotel("��ũ �Ͼ�Ʈ ����","348,750",fiv,"����Ư���� ������ ������� 606"," 02-2016-1234",ck2,park2,2);
		hotel[4] = new Hotel("�� �޸���� ����","242,500",fiv,"����Ư���� ������ ������� 120","02-3451-8000",ck3,park2,9);
		// 4
		hotel[5] = new Hotel("�۷��� ���� �ڿ��� ����","80,700",fou,"����Ư���� ������ ������� 610","02-6474-5000",ck1,park4,6);
		hotel[6] = new Hotel("�Ŷ� ������ �Ｚ","148,000",fou,"����Ư���� ������ ������� 506","02-2175-9000",ck1,park2,5);
		hotel[7] = new Hotel("��Ŭ���� ȣ�� ����","300,000",fou,"����Ư���� ���ʱ� ���ʵ� 1303-14","1899-9994",ck2,park1,7);
		hotel[8] = new Hotel("�۷�����̺� ȣ��","196,000",fou,"����Ư���� ������ ������� 223","02-6177-5000",ck3,park4,8);
		hotel[9] = new Hotel("��� �Ͽ콺 C-2","141,800",fou,"����Ư���� ������ ������� 4�� 6","No Phone",ck2,park5,2);
		// 3
		hotel[10] = new Hotel("������ ���� ����","240,000",thr,"����Ư���� ������ ���ﵿ 603-1","02-548-5489",ck1,park2,1);
		hotel[11] = new Hotel("����� �� ���� ����","139,000",thr,"����Ư���� ���ʱ� ������� 323","02-3472-1045",ck1,park1,3);
		hotel[12] = new Hotel("ȣ�� ���׷� ����","228,600",thr,"����Ư���� ������ �Ż絿 ������ 153","02-542,2300",ck1,park2,3);
		hotel[13] = new Hotel("�Ŷ����� ����","108,300",thr,"����Ư���� ���ʱ� ���ʵ� ȿ�ɷ� 42","02-2219,9000",ck2,park3,5);
		hotel[14] = new Hotel("ȣ�� ���� ����","270,000",thr,"����Ư���� ������ ���� 4�� ������ 66","02-2058-1178",ck3,park4,2);
		// 2,1
		hotel[15] = new Hotel("���÷� ȣ����","93,400",two,"����Ư���� ���ʱ� ���ʴ�� 56�� 18","02-3474-1214",ck1,park1,7);
		hotel[16] = new Hotel("���Ÿ ȣ��","57,000",two,"����Ư���� ������ ������� 712","02-545-0015",ck2,park1,8);
		hotel[17] = new Hotel("���̿�Ƽ ȣ�� ����","68,000",two,"����Ư���� ���ʱ� ���� 3�� ȿ�ɷ� 53�� 49","02-522-2838",ck3,park2,8);
		hotel[18] = new Hotel("���� ���Ƽ �Խ�Ʈ�Ͽ콺","47,800",one,"����Ư���� ������ ������ ������� 146�� 7-12","02-511-7422",ck1,park5,11);
		hotel[19] = new Hotel("ȣ�� �Ҽ�","111,300",one,"����Ư���� ���ʱ� ���ʵ� ������� 14�� 53","02-507- 0505",ck2,park4,5);
		
		for(int i = 0; i < hotel.length; i++) {
			this.addList(hotel[i]);
		}
		
		this.saveHotelList();
		
	}


	
}
