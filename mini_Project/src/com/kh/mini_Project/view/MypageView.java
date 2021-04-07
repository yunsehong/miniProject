package com.kh.mini_Project.view;

import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


import com.kh.mini_Project.controller.MyPageController;
import com.kh.mini_Project.model.Person;

public class MypageView extends Panel {
	
	MyPageController controller = new MyPageController();
	Person person = new Person();
	
	public MypageView (JFrame mf) {
		JLabel text = new JLabel("MyPage");
		this.add(text);
		
		JButton showKeepListbtn = new JButton("1. ���ã��");
		JButton LogOutbtn = new JButton("2. �α׾ƿ�");
		JButton returnBtn = new JButton("���ư���");
		
		showKeepListbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) { // 1. ���ã�� ����Ʈ ���� (Ŭ�� �� ���ã�� ����Ʈ ��� + ����Ʈ Ŭ�� �� �� ���װ� �� �������� �̵�)
				// Ŭ���� ���ã�� ����Ʈ ���
				person.getFavoriteList();

			}
		});
		
		LogOutbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) { // 2. �α׾ƿ� ����
				// �α׾ƿ� �� �α��� �������� �̵�
				JOptionPane.showMessageDialog(null, "�α׾ƿ� �Ϸ�");
				mf.getContentPane().removeAll();
	            mf.getContentPane().add(new LoginPage(mf));
	            mf.repaint();
	            mf.setVisible(true);

			}
		});
		
		// ���ư��� ��ư
		returnBtn.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				mf.getContentPane().removeAll();
				mf.getContentPane().add(new MainPage(mf));
				mf.repaint();
				mf.setVisible(true);
			}
		});

	
		this.add(showKeepListbtn);
		this.add(LogOutbtn);
		this.add(returnBtn);
		
	}

	
		
		
		
		
		
	}
	
		

