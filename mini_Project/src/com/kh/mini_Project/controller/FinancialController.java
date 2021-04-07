package com.kh.mini_Project.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

import com.kh.mini_Project.comparator.BankAscName;
import com.kh.mini_Project.comparator.BankAscNameATM;
import com.kh.mini_Project.model.ATM;
import com.kh.mini_Project.model.Facility;
import com.kh.mini_Project.model.Person;

public class FinancialController {
	//��ĳ�ʷ� �Ʒ����� �˻� ����Ʈ �̱�
	Scanner sc = new Scanner(System.in);
	
	//1.ArrayList�� ���� ����Ʈ ���
	ArrayList<Facility> fList = new ArrayList<>();
	ArrayList<ATM> aList = new ArrayList<>();
	
	public void FacilityListReader() {
		aList.add(new ATM("KB�������� 365(ATM)","07:00 ~ 23:55","���� ���ʱ� ���ʵ�(������ 10�� �ⱸ 294m)","image.PNG"));
		fList.add(new Facility("KB�������� �������", "���� ���ʱ� ���ʴ�� 411 2�� (���ʵ�)","1599-9999","image.PNG", null));
		fList.add(new Facility("KB�������� �ＺŸ������", "���� ���ʱ� ���ʴ��74�� 14 �Ｚ����","1599-9999","image.PNG", null));
		fList.add(new Facility("KB�������� ���ﵿ���ձ�������", "���� ������ ������� 354(����Ÿ�� �� ��õ���� ���� ��ġ)","1599-9999","image.PNG", null));
		
		aList.add(new ATM("�������� 365(ATM)","07:00 ~ 23:55","���� ���ʱ� ���ʵ�(������ 8�� �ⱸ 500m)","image.PNG"));
		fList.add(new Facility("�������� ����������������", "���� ���ʱ� ���ʴ�� 398","02-581-5055","image.PNG", null));
		fList.add(new Facility("�������� �����߾ӱ����������", "���� ������ ������� 147","02-562-6100","image.PNG", null));
		fList.add(new Facility("�������� �����߾�����", "���� ������ ������� 147 ���������� 2��","02-538-5505","image.PNG", null));
		
//		fList.add(new Facility("IBK������� ����������", "���� ���ʱ� ������� 403 �غ���","02-3481-2713","image.PNG"));
//		fList.add(new Facility("IBK������� ��������߾�����", "���� ���ʱ� ������� 341","02-523-6092","image.PNG"));
//		fList.add(new Facility("IBK������� �����������", "���� ������ ������� 132 �ѵ���ǰ����","02-553-1315","image.PNG"));
//		
//		fList.add(new Facility("KEB�ϳ����� ����������", "���� ���ʱ� ������� 405","02-534-0312","image.PNG"));
//		fList.add(new Facility("KEB�ϳ����� �Ｚ��������", "���� ���ʱ� ���ʴ��74�� 11","02-756-1111","image.PNG"));
//		fList.add(new Facility("KEB�ϳ����� ������ ������������", "���� ���ʱ� ������� 381","02-597-1110","image.PNG"));
//		
//		fList.add(new Facility("NH�������� �����������","���� ������ ������� 123 ������� 1��","0507-1355-4010","image.PNG"));
//		fList.add(new Facility("NH�������� ��������������","���� ������ ������� 108 ��������� 1-2��","02-557-3260","image.PNG"));
//		fList.add(new Facility("NH�������� ���ﵿ����","���� ���ʱ� ������� 351 û������ 1��","02-566-9762","image.PNG"));
//		
//		fList.add(new Facility("�츮���� ������α�������","���� ������ ������� 124","02-553-6347","image.PNG"));
//		fList.add(new Facility("�츮���� �Ｚ���� �ＺŸ��","���� ���ʱ� ���ʴ��74�� 4 �Ｚ���� ����Ÿ��","02-521-5071","image.PNG"));
//		fList.add(new Facility("�츮���� �ＺŸ�� ��������","���� ���ʱ� ���ʴ��74�� 11 �Ｚ���� ���ʻ��","02-583-7301","image.PNG"));
//		
//		fList.add(new Facility("�ѱ���Ƽ���� ����������","���� ������ ������� 508 �ؼ�2����","02-557-8400","image.PNG"));
//		fList.add(new Facility("�ѱ���Ƽ���� ��ġ�����","���� ������ ���μ�ȯ�� 2909","02-553-2500","image.PNG"));
//		fList.add(new Facility("�ѱ���Ƽ���� �����","���� ������ ���ַ�30�� 39","02-3498-5700","image.PNG"));
//		
//		fList.add(new Facility("SC�������� ����������","���� ������ ������� 406 GLASS TOWER","02-558-4041","image.PNG"));
//		fList.add(new Facility("SC�������� �ＺŸ����","���� ���ʱ� ���ʴ��74�� 11 �Ｚ���ں���","02-598-8410","image.PNG"));
//		fList.add(new Facility("SC�������� ���ʵ�����","���� ���ʱ� ������� 76 ���ȸ��","02-586-7011","image.PNG"));
//		
//		fList.add(new Facility("�����߾ӻ������ݰ� ������","���� ���ʱ� ������� 300-3 1��","02-535-2332","image.PNG"));
//		fList.add(new Facility("�����߾ӻ������ݰ� ����","���� ������ ������64�� 15","02-553-8996","image.PNG"));
//		fList.add(new Facility("�����߾ӻ������ݰ� ��������","���� ������ ����� 173 õȣ����","02-2052-1114","image.PNG"));
//	
		
	}
	
	//2.��������Ʈ add�� ������������ ����Ʈ �̱�
	public void ascAtmName() {
		//3. ATM�� ���� ����ó ĭ�� �����ð��� ������ �ϰ� �� ��ܿ� ����Ϸ��� ���� ���
		aList.sort(new BankAscNameATM());
		for(int j =0; j < aList.size(); j++) {
			System.out.println(aList.get(j));
		}
	}
	
	public void ascFacilityName() { 
		//4. ATM��� �� ��ܿ� ��� �� ������ ������ ���
		for(int i=0; i < fList.size(); i++) {
			fList.sort(new BankAscName());
			System.out.println(fList.get(i));
		}
	}
	
	
	
	//4.�˻�â�� �̿��Ͽ� ���� ���ϴ� ��ϸ� ����ϰ� �����
	public void searchFacilityList() {
		System.out.print("������� �˻��ϼ��� : ");
		String keyword = sc.nextLine();
		for(int j=0; j <aList.size(); j++) {
			if(aList.get(j).getfName().contains(keyword)) {
				System.out.println(aList.get(j));
			}
		}
		for(int i =0; i < fList.size();i++) {
			if(fList.get(i).getName().contains(keyword)) {
				System.out.println(fList.get(i));
			}
		}
	}
	
	//���ã�� ������ �����
	/*public ArrayList<Person> myFavorite() {
		ArrayList<Person> list = new ArrayList<>();
		System.out.print("���ã�⿡ �߰��� ������� �Է��ϼ��� : ");
		String favorite = sc.nextLine();
		for(int i=0; i < fList.size(); i++) {
			if(fList.get(i).getName().contains(favorite)) {
				System.out.println(fList.get(i));
			}
		}
		return list;
		
		
	}*/
	
	
	
	
}
	
	
