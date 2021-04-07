package com.kh.mini_Project.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.kh.mini_Project.model.Hotel;
public class HotelDao {
	
	public ArrayList<Hotel> fileOpen() {
		ArrayList<Hotel> list = new ArrayList<>();
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("HotelList.dat"))){
			list = (ArrayList<Hotel>) ois.readObject();
			
		} catch (FileNotFoundException e) {
			System.out.println("h>");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("Cannot casting to Array<Hotel>");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Cannot loaded file");
			e.printStackTrace();
		} 
		return list;
	}
	
	public void fileSave(ArrayList<Hotel> list) {
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("HotelList.dat"))){
			
			oos.writeObject(list);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
		
}
