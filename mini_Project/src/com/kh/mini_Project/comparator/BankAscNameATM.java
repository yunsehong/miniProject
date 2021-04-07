package com.kh.mini_Project.comparator;

import java.util.Comparator;

import com.kh.mini_Project.model.ATM;

public class BankAscNameATM implements Comparator <ATM> {
	@Override
	public int compare(ATM o1, ATM o2) {
		return o1.getfName().compareTo(o2.getfName());
	}
}
