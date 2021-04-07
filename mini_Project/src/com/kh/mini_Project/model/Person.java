package com.kh.mini_Project.model;

import java.util.ArrayList;

public class Person {
		
		private String name;
		private int age;
		private String id;
		private String pw;
		private ArrayList<Culture> favoriteList; 
		
		public Person() {}
		
		public Person(String name, int age, String id, String pw) {
			super();
			this.age = age; 
			this.name = name;
			this.id = id;
			this.pw = pw;
			this.favoriteList = new ArrayList<>();
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getPw() {
			return pw;
		}

		public void setPw(String pw) {
			this.pw = pw;
		}

		public ArrayList<Culture> getFavoriteList() {
			return favoriteList;
		}

		public void setFavoriteList(ArrayList<Culture> favoriteList) {
			this.favoriteList = favoriteList;
		}

		@Override
		public String toString() {
			return "Person [name=" + name + ", age=" + age + ", id=" + id + ", pw=" + pw + "]";
		}
		
//		public boolean keepMyFavoriteThings(Culture favorite) { 
//			
//			boolean flag = false;
//			// 1. �렪�쓽�떆�꽕 由ъ뒪�듃 媛��졇�삤湲� 
//			ArrayList<Culture> originalList = Culture.list;
//					
//			// 2. 由ъ뒪�듃�뿉�꽌 �씠由꾧낵 媛숈� �렪�쓽�떆�꽕�쓣 李얜뒗�떎.
//			if (originalList.contains(favorite)) {
//				favoriteList.add(favorite);	
//				flag = true;
//				// 3. 李얠쑝硫� 利먭꺼李얘린�뿉 異붽��븳�떎. 
//			} 
//			return flag;
//		}
		

}
