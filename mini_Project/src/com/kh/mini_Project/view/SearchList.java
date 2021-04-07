package com.kh.mini_Project.view;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.kh.mini_Project.model.Hotel;

public class SearchList extends JPanel{

	public SearchList(JFrame mf,ArrayList<Hotel> list) {
		this.setLayout(new BorderLayout());
		
		JPanel listPanel = new JPanel();
		listPanel.setSize(300,400);
		
		for (int i = 0; i < list.size(); i++) {
			Hotel h = list.get(i);
			JTextField result = new JTextField(30);
			result.setEditable(false);
			result.setText(h.displayOnList());
			listPanel.add(result);
			System.out.println(h.displayOnList());
		}
		this.add(listPanel,"Center");
		
		
	}
	
}
