package com.kh.mini_Project.controller;

import java.util.ArrayList;

import com.kh.mini_Project.model.Facility;
import com.kh.mini_Project.model.Person;

public class MyPageController {
	
	Facility facility = new Facility();
	Person person = new Person();
	
	// 즐겨찾기 리스트
	public static ArrayList<Person> favoriteList = new ArrayList<Person>();
	
	// 파라미터로 넘겨받은 keep을 리스트에 추가 // person타입? facility 타입?
	public static ArrayList<Person> addList(Person keep) {
		favoriteList.add(keep);
		return favoriteList;
	}
	
	// 즐겨찾기 삭제
	public void removeList(Person delete) {
		favoriteList.remove(delete);
	}
	
}
