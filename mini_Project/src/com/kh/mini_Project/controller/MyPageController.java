package com.kh.mini_Project.controller;

import java.util.ArrayList;

import com.kh.mini_Project.model.Facility;
import com.kh.mini_Project.model.Person;

public class MyPageController {
	
	Facility facility = new Facility();
	Person person = new Person();
	
	// ���ã�� ����Ʈ
	public static ArrayList<Person> favoriteList = new ArrayList<Person>();
	
	// �Ķ���ͷ� �Ѱܹ��� keep�� ����Ʈ�� �߰� // personŸ��? facility Ÿ��?
	public static ArrayList<Person> addList(Person keep) {
		favoriteList.add(keep);
		return favoriteList;
	}
	
	// ���ã�� ����
	public void removeList(Person delete) {
		favoriteList.remove(delete);
	}
	
}
