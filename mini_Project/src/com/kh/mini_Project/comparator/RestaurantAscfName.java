package com.kh.mini_Project.comparator;

import java.util.Comparator;

import com.kh.mini_Project.model.Restaurant;

public class RestaurantAscfName implements Comparator <Restaurant> {
 
	@Override   
	public int compare(Restaurant o1, Restaurant o2) {
		return o1.getfName().compareTo(o2.getfName());
	}

}
