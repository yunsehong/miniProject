package com.kh.mini_Project.controller;

import java.util.ArrayList;
import java.util.Scanner;

import com.kh.mini_Project.model.Book;
import com.kh.mini_Project.model.Culture;
import com.kh.mini_Project.model.Exhibit;
import com.kh.mini_Project.model.Health;
import com.kh.mini_Project.model.Hobby;
import com.kh.mini_Project.model.Library;
import com.kh.mini_Project.model.Movie;

public class CultureController {

	Scanner sc = new Scanner(System.in);

	ArrayList<Movie> movieList = new ArrayList<>();
	ArrayList<Book> bookList = new ArrayList<>();
	ArrayList<Library> libraryList = new ArrayList<>();
	ArrayList<Exhibit> exhibitList = new ArrayList<>();
	ArrayList<Hobby> hobbyList = new ArrayList<>();
	ArrayList<Health> healthList = new ArrayList<>();


	public void cultureListReader() { // # ������ �߰�

		// movieList
		movieList.add(new Movie("�ް��ڽ� ����", "���� ���ʱ� ���ʴ��77�� 3 �ƶ�Ÿ�� 8��", "1544-0070", "megaboxgangnam"));
		movieList.add(new Movie("CGV ����", "���� ������ ������� 438 ��Ÿ�÷���", "1544-1122", "cgvgangnam"));
		movieList.add(new Movie("�ް��ڽ� �ڿ���", "���� ������ ������� 513 �ڿ����� ���� 1��", "1544-0070", "megaboxcoex"));
		movieList.add(new Movie("CGV û�㾾�׽�Ƽ", "���� ������ ������ 323", "1544-1122", "cgvcheongdam"));
		movieList.add(new Movie("CGV �б���", "���� ������ �б�����30�� 45", "1544-1122", "cgvapgujeong"));
		movieList.add(new Movie("�̺�������", "���� ������ �б�����10�� 9 �������", "070-8233-4321", "ebomtheater"));
		movieList.add(new Movie("�Ե��ó׸� ��ε����", "���� ������ ������8�� 8", "1544-8855", "lottecinema"));
		// ��ȭ ������ �� ���߱� !!!!! 
		
		// libraryList
		libraryList.add(new Library("���ﱳ��û ����������", "���� ������ ������116�� 45", "02-3448-4741", "seoullibrary"));
		libraryList.add(new Library("�����絵����", "���� ������ �������513 ��Ÿ�ʵ� �ڿ����� ����1��", "02-6002-3031", "byeollibrary"));
		libraryList.add(new Library("�������û�ҳ⵵����", "���� ������ �������7�� 21", "02-3413-4800", "childrenlibrary"));
		
		// bookList 
		bookList.add(new Book("�������� ������", "����Ư���� ���ʱ� ������� 465 ����Ÿ�� ���� 1��~���� 2��", "1599-1000", "kyobogangnam"));
		bookList.add(new Book("�˶���߰��� ������", "����Ư���� ������ ������� 438 ��Ÿ�÷���", "1663-3399", "aladin" ));
		bookList.add(new Book("��ǳ���� ��������", "����Ư���� ������ ������� 408 YBM��������", "1600-1944", "young"));

		
		// exhibitList
		exhibitList.add(new Exhibit("�����ڹ���", "���� ������ ���ַ� 721 1��", "02-513-1082", "taxmuseum"));
		exhibitList.add(new Exhibit("ȣ����Ʈ����", "���� ������ ������ 317", "02-541-3540", "horimart"));
		exhibitList.add(new Exhibit("�÷����� ���������� ��Ʈ����", "���� ������ ���ַ�133�� 11", "02-6929-4470", "contemporaryartcenter"));
		exhibitList.add(new Exhibit("�����ڹ̼���", "���� ������ ������� 440 �����ڼ���", "02-3457-1665", "poscoart"));
		exhibitList.add(new Exhibit("������ ȭ��Ʈ��", "���� ������ �е��� 97�� 69", "02-6006-9300", "whiteoneart"));
		exhibitList.add(new Exhibit("K����̼���", "���� ������ ������ 807", "02-2138-0952", "khyundaiart"));
		exhibitList.add(new Exhibit("�����̽���", "���� ������ ���ַ� 827", "02-547-9177", "spacecart"));

		// healthList
		healthList.add(new Health("ũ�ν��Ͷ��Ӷ���", "���� ������ ���ַ�168�� 15", "02-3443-7272", "crossfit"));
		healthList.add(new Health("Ʈ����Ʈ��", "���� ������ �б�����28�� 19 �������̺���", "070-7543-3301", "traintrue"));
		healthList.add(new Health("�ٵ����̽�", "���� ������ �е��� 6�� 19", "02-517-6191", "bodyspace"));
		healthList.add(new Health("��Ͽ䰡��Ʃ���", "���� ������ ������ 126�� 6 3��", "02-516-5568", "sunnyyoga"));
		healthList.add(new Health("���Ǵٿ䰡", "���� ������ ������151�� 55", "02-543-5644", "spandayoga"));
		healthList.add(new Health("�Ҹ���������", "���� ������ ������6�� 15", "02-514-4655", "somahealing"));
		
		
		// hobbyList
		hobbyList.add(new Hobby("CIM �ǾƳ��п�", "���� ������ �������120�� 61 1��", "02-3445-6688", "classcimpiano"));
		hobbyList.add(new Hobby("�ǾƳ븮�극 ��������", "���� ������ �������96�� 20 �������� 3��", "02-563-9915", "pianolibre"));
		hobbyList.add(new Hobby("�����ǾƳ� ������", "���� ������ �Ｚ��91�� 36 ����Ÿ�� 9��", "010-5826-9374", "withpiano"));
		hobbyList.add(new Hobby("��Ʃ��� Ƽ", "����Ư���� ������ �����3�� 25 �Ｚ�ִ��� B101-2ȣ", "02-2039-3920", "studiot"));
		hobbyList.add(new Hobby("�Ʒθ� �����", "����Ư���� ������ �����3�� 19", "02-3023-2929", "aromalounge"));
		hobbyList.add(new Hobby("�߸��� �����ڸ���", "����Ư���� ������ ������� 298 11��", "02-300-2993", "yamaha"));
	}

	public void searchCultureList() { // # �˻� ���
		// movie, book, exhibit, health, hobby

		System.out.print("�˻�� �Է��ϼ��� : ");
		Scanner sc = new Scanner(System.in);
		String keyword = sc.nextLine();

		switch (keyword) {
		case "��ȭ" :
		case "��ȭ��" :
			for(Culture c : movieList) {
				System.out.println(c);
			}
				break;
			
		case "������" :
			for(Culture c : libraryList) {
				System.out.println(c);
			}
			break;
			
		case "����" :
		case "����" :
			for(Culture c : bookList) {
				System.out.println(c);
			}
			break;
			
		case "����" :
		case "å" : 
			for(Culture c : libraryList) {
				System.out.println(c);
			}
			for(Culture c : bookList) {
				System.out.println(c);
			}
			break;
			
		case "�ڹ���" :
		case "�̼���" :
		case "����" :
		case "����" :
		case "����ȸ" :
		case "�̼�" :
		case "������" :
		case "ü���н�" :
			for(Culture c : exhibitList) {
				System.out.println(c);
			}
			break;
		

		case "�ｺ" :
		case "�䰡" :
		case "��" :
		case "�ｺ��" :
		case "��Ʈ�Ͻ�" :
		case "�ʶ��׽�" :
		case "�" :
		case "ü��" :
		case "��ü�" :
		case "ü���ü�" :
			for(Culture c : healthList) {
				System.out.println(c);
			}
			break;
		
		case "����" :
		case "�ǾƳ�" :
		case "����" :
		case "��Ʃ���" :
		case "ü��":
			for(Culture c : hobbyList) {
				System.out.println(c);
			}
			break;
	
		case "�ڱ���" :
		case "���" :
			for(Culture c : healthList) {
				System.out.println(c);
			}
			for(Culture c : hobbyList) {
				System.out.println(c);
			}
		
		}
	}

	public void sendMyFavorite() { // # ���ã�⿡ ���
		// ��ư Ŭ�� ��,

		// private ArrayList<Facility> favoritexhibitList; �� ������

	}
}
