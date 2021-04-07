package model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import model.vo.Facility;

public class DetailDao {

	public ArrayList<Facility> fileOpen(){
		ArrayList<Facility> detailList = new ArrayList<>();
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("facililty.txt"))){
			detailList = (ArrayList<Facility>) ois.readObject();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return detailList;
		
	}
	public void fileSave(ArrayList<Facility> detailList) {
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("facility.txt"))){
			oos.writeObject(detailList);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
