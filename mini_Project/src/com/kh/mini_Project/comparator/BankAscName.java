package com.kh.mini_Project.comparator;

import java.util.Comparator;

import com.kh.mini_Project.model.Facility;

public class BankAscName implements Comparator <Facility> {

	@Override
	public int compare(Facility o1, Facility o2) {
		return o1.getName().compareTo(o2.getName());
	}

}