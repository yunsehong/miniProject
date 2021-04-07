package com.kh.mini_Project.controller;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.mini_Project.model.Restaurant;

public class RestaurantsController {
	
	//��ĳ�ʷ� �Ʒ����� �˻� ����Ʈ �̱�
		Scanner sc = new Scanner(System.in);
		
		//1.ArrayList�� ���� ����Ʈ ���
		ArrayList<Restaurant> rList = new ArrayList<>();
		//ArrayList<ATM> aList = new ArrayList<>();
		 
		public void restaurantListReader() {
			System.out.println("======================================��ü����Ʈ���==========================================");
			rList.add(new Restaurant("�����ٶ� ����","���� ������ ������� 96��2��", "0507-1343-9474","11:00-20:00","image.PNG"));
			rList.add(new Restaurant("����" ,"���� ������ ������ 211 �������� 1F","0507-1436-0018","11:00-20:00","image.PNG"));
			rList.add(new Restaurant("�̿��� ���μ��溻��","���� ������ �������156�� 32 1��","02-545-8250","11:00-20:00","image.PNG"));
			rList.add(new Restaurant("���ʽ�����������","���� ������ �������98�� 16 �ĺ����º��� 6��","0507-1392-8886","11:00-20:00","image.PNG"));
//			fList.add(new Restaurant("�����̺ξ��б����ε�����","���� ������ ������157��25 2��","02-511-5982,","11:00-20:00","image.PNG"));
//			fList.add(new Restaurant("ȣ����","���� ���������ַ�164��39","0507-1399-3353,","11:00-20:00","image.PNG"));
//			fList.add(new Restaurant("��Ŀ���۴Ͼб�����","���ﰭ�������ַ�167��23","0507-1357-1456","11:00-20:00","image.PNG"));
//			fList.add(new Restaurant("�����趱����","���� ������ ������153��18","0507-1442-3312","11:00-20:00","image.PNG"));
//			fList.add(new Restaurant("���յ��������","���� ���������ַ�164��24��ũ�ν���1��","02-511-9451","11:00-20:00","image.PNG"));
//			fList.add(new Restaurant("�±���","���ﰭ�����б�����4��13-9 1��","02-545-7940","11:00-20:00","image.PNG"));
//			fList.add(new Restaurant("�ι�Ÿ���̺��","���ﰭ����������148��52����1��","0507-1324-8005","11:00-20:00","image.PNG"));
//			fList.add(new Restaurant("�˶� ������ ","���� ������ �������129 ����NŸ��1�� ","0507-1318-0939","11:00-21:00","image.PNG"));
//		    fList.add(new Restaurant("õ�̹�","���� ������ �������152��11���� ","0507-1304-7202","11:00-20:00","image.PNG")); 
//		    fList.add(new Restaurant("���ͽ�Ƽ���̸Ŵϸְ�����","���� ������ �������98�� ","02-2052-3003","11:00-20:00","image.PNG"));
//	        fList.add(new Restaurant("���ڹ�","���� ������ ������11��28 ","02-3443-0030","11:00-24:00","image.PNG")); 		
//		    fList.add(new Restaurant("��Ʋ�� û��","���� ������ ������ 51��17","0507-1400-1476","11:00-24:00","image.PNG"));		
//		    fList.add(new Restaurant("����ī��","���� ������ ������146�� 27-10 ","0507-1547-9238","11:00-25:00","image.PNG"));
//		    fList.add(new Restaurant("�߶�","���� ������ �������142��13-3 ","02-543-2987","11:00-20:00","image.PNG")); 
//			fList.add(new Restaurant("��ġ����","���� ������ ������82��45","02-508-3465 ","11:00-25:00","image.PNG"));
//		    fList.add(new Restaurant("�޽�Ź","���ﰭ���� ������15��11","02-511-9440","11:00-20:00","image.PNG")); 
//		    fList.add(new Restaurant("���̺�","���ﰭ�����б�����14��12","02-3445-7335","11:00-20:00","image.PNG"));
//	        fList.add(new Restaurant("������","���ﰭ�����б�����338","02-544-3710","11:00-20:00","image.PNG")); 		
//		    fList.add(new Restaurant("��Ʈ���������","���� ���������ַ�164��23","070-7756-3145","11:00-21:00","image.PNG"));		
//		    fList.add(new Restaurant("��ġ�����尭����","���ﰭ�����������4��23 2��","0507-1396-9933","11:00-20:00","image.PNG"));	
//		    fList.add(new Restaurant("�����ξ��繮","���ﰭ����������824","0507-1327-5490","11:00-20:00","image.PNG"));
//	        fList.add(new Restaurant("����","���ﰭ����������152��30 1������","0507-1307-8388","11:00-21:00","image.PNG")); 		
//		    fList.add(new Restaurant("���丶��","���ﰭ����������45��7","02-546-3643","11:00-20:00","image.PNG"));		
//		    fList.add(new Restaurant("���ѿ�","���� ������ �б�����10��35����1��","070-7627-0057","11:00-21:00","image.PNG"));							
//		    fList.add(new Restaurant("����ȿû����","���ﰭ����������146��25��������","02-545-0023","11:00-20:00","image.PNG"));
//		    
		    		
		}
		public void ascRestaurantName() { 
			for(int i=0; i < rList.size(); i++) {
				System.out.println(rList.get(i));
			}
		}
	
		//4.�˻�â�� �̿��Ͽ� ���� ���ϴ� ��ϸ� ����ϰ� �����
		public void searchFinancialList() {
			System.out.println("=========================================�˻�=========================================================");
			
			System.out.print("�������� �˻��ϼ��� : ");
			String keyword = sc.nextLine();
			for(int j=0; j <rList.size(); j++) {
				if(rList.get(j).getfName().contains(keyword)) {
					System.out.println(rList.get(j));
				}
			}

		}
}
