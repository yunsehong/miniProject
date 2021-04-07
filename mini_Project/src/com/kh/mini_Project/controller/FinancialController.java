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
	//스캐너로 아래에서 검색 리스트 뽑기
	Scanner sc = new Scanner(System.in);
	
	//1.ArrayList로 지점 리스트 출력
	ArrayList<Facility> fList = new ArrayList<>();
	ArrayList<ATM> aList = new ArrayList<>();
	
	public void FacilityListReader() {
		aList.add(new ATM("KB국민은행 365(ATM)","07:00 ~ 23:55","서울 서초구 서초동(강남역 10번 출구 294m)","image.PNG"));
		fList.add(new Facility("KB국민은행 강남대로", "서울 서초구 서초대로 411 2층 (서초동)","1599-9999","image.PNG", null));
		fList.add(new Facility("KB국민은행 삼성타운지점", "서울 서초구 서초대로74길 14 삼성물산","1599-9999","image.PNG", null));
		fList.add(new Facility("KB국민은행 역삼동종합금융센터", "서울 강남구 강남대로 354(강남타워 앞 혜천빌딩 내에 위치)","1599-9999","image.PNG", null));
		
		aList.add(new ATM("신한은행 365(ATM)","07:00 ~ 23:55","서울 서초구 서초동(강남역 8번 출구 500m)","image.PNG"));
		fList.add(new Facility("신한은행 강남역금융센터점", "서울 서초구 서초대로 398","02-581-5055","image.PNG", null));
		fList.add(new Facility("신한은행 강남중앙기업금융센터", "서울 강남구 테헤란로 147","02-562-6100","image.PNG", null));
		fList.add(new Facility("신한은행 강남중앙지점", "서울 강남구 테헤란로 147 성지하이츠 2차","02-538-5505","image.PNG", null));
		
//		fList.add(new Facility("IBK기업은행 강남역지점", "서울 서초구 강남대로 403 준빌딩","02-3481-2713","image.PNG"));
//		fList.add(new Facility("IBK기업은행 강남대로중앙지점", "서울 서초구 강남대로 341","02-523-6092","image.PNG"));
//		fList.add(new Facility("IBK기업은행 테헤란로지점", "서울 강남구 테헤란로 132 한독약품빌딩","02-553-1315","image.PNG"));
//		
//		fList.add(new Facility("KEB하나은행 강남역지점", "서울 서초구 강남대로 405","02-534-0312","image.PNG"));
//		fList.add(new Facility("KEB하나은행 삼성센터지점", "서울 서초구 서초대로74길 11","02-756-1111","image.PNG"));
//		fList.add(new Facility("KEB하나은행 강남역 금융센터지점", "서울 서초구 강남대로 381","02-597-1110","image.PNG"));
//		
//		fList.add(new Facility("NH농협은행 역삼금융센터","서울 강남구 테헤란로 123 여삼빌딩 1층","0507-1355-4010","image.PNG"));
//		fList.add(new Facility("NH농협은행 강남역금융센터","서울 강남구 테헤란로 108 테헤란빌딩 1-2층","02-557-3260","image.PNG"));
//		fList.add(new Facility("NH농협은행 역삼동지점","서울 서초구 강남대로 351 청남빌딩 1층","02-566-9762","image.PNG"));
//		
//		fList.add(new Facility("우리은행 테헤란로금융센터","서울 강남구 테헤란로 124","02-553-6347","image.PNG"));
//		fList.add(new Facility("우리은행 삼성증권 삼성타운","서울 서초구 서초대로74길 4 삼성생명 서초타워","02-521-5071","image.PNG"));
//		fList.add(new Facility("우리은행 삼성타운 금융센터","서울 서초구 서초대로74길 11 삼성전자 서초사옥","02-583-7301","image.PNG"));
//		
//		fList.add(new Facility("한국씨티은행 강남영업부","서울 강남구 테헤란로 508 해성2빌딩","02-557-8400","image.PNG"));
//		fList.add(new Facility("한국씨티은행 대치출장소","서울 강남구 남부순환로 2909","02-553-2500","image.PNG"));
//		fList.add(new Facility("한국씨티은행 도곡센터","서울 강남구 언주로30길 39","02-3498-5700","image.PNG"));
//		
//		fList.add(new Facility("SC제일은행 강남역지점","서울 강남구 강남대로 406 GLASS TOWER","02-558-4041","image.PNG"));
//		fList.add(new Facility("SC제일은행 삼성타운점","서울 서초구 서초대로74길 11 삼성전자빌딩","02-598-8410","image.PNG"));
//		fList.add(new Facility("SC제일은행 서초동지점","서울 서초구 반포대로 76 사료회관","02-586-7011","image.PNG"));
//		
//		fList.add(new Facility("서초중앙새마을금고 반포점","서울 서초구 반포대로 300-3 1층","02-535-2332","image.PNG"));
//		fList.add(new Facility("강남중앙새마을금고 본점","서울 강남구 선릉로64길 15","02-553-8996","image.PNG"));
//		fList.add(new Facility("강남중앙새마을금고 역삼지점","서울 강남구 도곡로 173 천호빌딩","02-2052-1114","image.PNG"));
//	
		
	}
	
	//2.지점리스트 add후 오름차순으로 리스트 뽑기
	public void ascAtmName() {
		//3. ATM은 지점 연락처 칸에 영업시간이 적히게 하고 맨 상단에 출력하려고 따로 출력
		aList.sort(new BankAscNameATM());
		for(int j =0; j < aList.size(); j++) {
			System.out.println(aList.get(j));
		}
	}
	
	public void ascFacilityName() { 
		//4. ATM기기 젤 상단에 출력 후 나머지 영업점 출력
		for(int i=0; i < fList.size(); i++) {
			fList.sort(new BankAscName());
			System.out.println(fList.get(i));
		}
	}
	
	
	
	//4.검색창을 이용하여 내가 원하는 목록만 출력하게 만들기
	public void searchFacilityList() {
		System.out.print("은행명을 검색하세요 : ");
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
	
	//즐겨찾기 페이지 만들기
	/*public ArrayList<Person> myFavorite() {
		ArrayList<Person> list = new ArrayList<>();
		System.out.print("즐겨찾기에 추가할 은행명을 입력하세요 : ");
		String favorite = sc.nextLine();
		for(int i=0; i < fList.size(); i++) {
			if(fList.get(i).getName().contains(favorite)) {
				System.out.println(fList.get(i));
			}
		}
		return list;
		
		
	}*/
	
	
	
	
}
	
	
