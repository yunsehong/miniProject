package com.kh.mini_Project.view;

import javax.swing.JFrame;

public class MainFrame extends JFrame{
	public MainFrame() {
		this.setTitle("�վȿ� ����");
		this.setBounds(50, 50, 1200, 800);

		// �������� ���� �����̳� ȣ���ؼ� �̵��ϰ��� �ϴ� �г� �߰�
		// frame �Ű����� �����ϸ鼭
		this.getContentPane().add(new LoginPage(this));
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}