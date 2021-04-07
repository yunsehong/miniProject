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


	public void cultureListReader() { // # 데이터 추가

		// movieList
		movieList.add(new Movie("메가박스 강남", "서울 서초구 서초대로77길 3 아라타워 8층", "1544-0070", "megaboxgangnam"));
		movieList.add(new Movie("CGV 강남", "서울 강남구 강남대로 438 스타플렉스", "1544-1122", "cgvgangnam"));
		movieList.add(new Movie("메가박스 코엑스", "서울 강남구 영동대로 513 코엑스몰 지하 1층", "1544-0070", "megaboxcoex"));
		movieList.add(new Movie("CGV 청담씨네시티", "서울 강남구 도산대로 323", "1544-1122", "cgvcheongdam"));
		movieList.add(new Movie("CGV 압구정", "서울 강남구 압구정로30길 45", "1544-1122", "cgvapgujeong"));
		movieList.add(new Movie("이봄씨어터", "서울 강남구 압구정로10길 9 대원빌딩", "070-8233-4321", "ebomtheater"));
		movieList.add(new Movie("롯데시네마 브로드웨이", "서울 강남구 도산대로8길 8", "1544-8855", "lottecinema"));
		// 영화 가나다 순 맞추기 !!!!! 
		
		// libraryList
		libraryList.add(new Library("서울교육청 강남도서관", "서울 강남구 선릉로116길 45", "02-3448-4741", "seoullibrary"));
		libraryList.add(new Library("별마당도서관", "서울 강남구 영동대로513 스타필드 코엑스몰 지하1층", "02-6002-3031", "byeollibrary"));
		libraryList.add(new Library("국립어린이청소년도서관", "서울 강남구 테헤란로7길 21", "02-3413-4800", "childrenlibrary"));
		
		// bookList 
		bookList.add(new Book("교보문고 강남점", "서울특별시 서초구 강남대로 465 교보타워 지하 1층~지하 2층", "1599-1000", "kyobogangnam"));
		bookList.add(new Book("알라딘중고서점 강남점", "서울특별시 강남구 강남대로 438 스타플렉스", "1663-3399", "aladin" ));
		bookList.add(new Book("영풍문고 강남역점", "서울특별시 강남구 강남대로 408 YBM강남센터", "1600-1944", "young"));

		
		// exhibitList
		exhibitList.add(new Exhibit("관세박물관", "서울 강남구 언주로 721 1층", "02-513-1082", "taxmuseum"));
		exhibitList.add(new Exhibit("호림아트센터", "서울 강남구 도산대로 317", "02-541-3540", "horimart"));
		exhibitList.add(new Exhibit("플랫폼엘 컨템포러리 아트센터", "서울 강남구 언주로133길 11", "02-6929-4470", "contemporaryartcenter"));
		exhibitList.add(new Exhibit("포스코미술관", "서울 강남구 테헤란로 440 포스코센터", "02-3457-1665", "poscoart"));
		exhibitList.add(new Exhibit("갤러리 화이트원", "서울 강남구 학동로 97길 69", "02-6006-9300", "whiteoneart"));
		exhibitList.add(new Exhibit("K현대미술관", "서울 강남구 선릉로 807", "02-2138-0952", "khyundaiart"));
		exhibitList.add(new Exhibit("스페이스씨", "서울 강남구 언주로 827", "02-547-9177", "spacecart"));

		// healthList
		healthList.add(new Health("크로스핏라임라잇", "서울 강남구 언주로168길 15", "02-3443-7272", "crossfit"));
		healthList.add(new Health("트레인트루", "서울 강남구 압구정로28길 19 제이제이빌딩", "070-7543-3301", "traintrue"));
		healthList.add(new Health("바디스페이스", "서울 강남구 학동로 6길 19", "02-517-6191", "bodyspace"));
		healthList.add(new Health("써니요가스튜디오", "서울 강남구 선릉로 126길 6 3층", "02-516-5568", "sunnyyoga"));
		healthList.add(new Health("스판다요가", "서울 강남구 논현로151길 55", "02-543-5644", "spandayoga"));
		healthList.add(new Health("소마힐링센터", "서울 강남구 도산대로6길 15", "02-514-4655", "somahealing"));
		
		
		// hobbyList
		hobbyList.add(new Hobby("CIM 피아노학원", "서울 강남구 강남대로120길 61 1층", "02-3445-6688", "classcimpiano"));
		hobbyList.add(new Hobby("피아노리브레 강남센터", "서울 강남구 강남대로96길 20 혜진빌딩 3층", "02-563-9915", "pianolibre"));
		hobbyList.add(new Hobby("위드피아노 선릉점", "서울 강남구 삼성로91길 36 제이타워 9층", "010-5826-9374", "withpiano"));
		hobbyList.add(new Hobby("스튜디오 티", "서울특별시 강남구 도곡로3길 25 삼성애니텔 B101-2호", "02-2039-3920", "studiot"));
		hobbyList.add(new Hobby("아로마 라운지", "서울특별시 강남구 도곡로3길 19", "02-3023-2929", "aromalounge"));
		hobbyList.add(new Hobby("야마하 뮤직코리아", "서울특별시 강남구 강남대로 298 11층", "02-300-2993", "yamaha"));
	}

	public void searchCultureList() { // # 검색 기능
		// movie, book, exhibit, health, hobby

		System.out.print("검색어를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		String keyword = sc.nextLine();

		switch (keyword) {
		case "영화" :
		case "영화관" :
			for(Culture c : movieList) {
				System.out.println(c);
			}
				break;
			
		case "도서관" :
			for(Culture c : libraryList) {
				System.out.println(c);
			}
			break;
			
		case "서점" :
		case "문고" :
			for(Culture c : bookList) {
				System.out.println(c);
			}
			break;
			
		case "도서" :
		case "책" : 
			for(Culture c : libraryList) {
				System.out.println(c);
			}
			for(Culture c : bookList) {
				System.out.println(c);
			}
			break;
			
		case "박물관" :
		case "미술관" :
		case "유물" :
		case "전시" :
		case "전시회" :
		case "미술" :
		case "갤러리" :
		case "체험학습" :
			for(Culture c : exhibitList) {
				System.out.println(c);
			}
			break;
		

		case "헬스" :
		case "요가" :
		case "짐" :
		case "헬스장" :
		case "피트니스" :
		case "필라테스" :
		case "운동" :
		case "체육" :
		case "운동시설" :
		case "체육시설" :
			for(Culture c : healthList) {
				System.out.println(c);
			}
			break;
		
		case "음악" :
		case "피아노" :
		case "공방" :
		case "스튜디오" :
		case "체험":
			for(Culture c : hobbyList) {
				System.out.println(c);
			}
			break;
	
		case "자기계발" :
		case "취미" :
			for(Culture c : healthList) {
				System.out.println(c);
			}
			for(Culture c : hobbyList) {
				System.out.println(c);
			}
		
		}
	}

	public void sendMyFavorite() { // # 즐겨찾기에 담기
		// 버튼 클릭 시,

		// private ArrayList<Facility> favoritexhibitList; 로 보내기

	}
}
