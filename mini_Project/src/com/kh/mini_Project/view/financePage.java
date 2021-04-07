package com.kh.mini_Project.view;

import java.awt.Component;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class financePage extends Panel {
	public financePage(JFrame mf) {
		JButton culture = new JButton("금융시설");
		add(culture);
		
		JButton returnBtn = new JButton("돌아가기");
		returnBtn.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				mf.getContentPane().removeAll();
				mf.getContentPane().add(new MainPage(mf));
				mf.repaint();
				mf.setVisible(true);
			}

		});

		this.add(returnBtn);

	}
}
