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
		
		JButton showKeepListbtn = new JButton("1. 즐겨찾기");
		JButton LogOutbtn = new JButton("2. 로그아웃");
		JButton returnBtn = new JButton("돌아가기");
		
		showKeepListbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) { // 1. 즐겨찾기 리스트 로직 (클릭 시 즐겨찾기 리스트 출력 + 리스트 클릭 시 각 가테고리 상세 페이지로 이동)
				// 클릭시 즐겨찾기 리스트 출력
				person.getFavoriteList();

			}
		});
		
		LogOutbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) { // 2. 로그아웃 로직
				// 로그아웃 후 로그인 페이지로 이동
				JOptionPane.showMessageDialog(null, "로그아웃 완료");
				mf.getContentPane().removeAll();
	            mf.getContentPane().add(new LoginPage(mf));
	            mf.repaint();
	            mf.setVisible(true);

			}
		});
		
		// 돌아가기 버튼
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
	
		

