package com.kh.mini_Project.view;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.kh.mini_Project.controller.LoginController;

public class LoginPage extends JPanel {
	LoginController lc = new LoginController();

	public LoginPage(JFrame mf) {

		this.add(new JLabel("ID"));
		JTextField id = new JTextField(10);

		this.add(id);

		this.add(new JLabel("Password"));
		JPasswordField pwd = new JPasswordField(10);

		this.add(pwd);
		// ��ư
		JButton logBtn = new JButton("Log In");
		logBtn.addMouseListener(new MouseAdapter() {
			// ��ư Ŭ�� �� �̺�Ʈ
			@Override
			public void mouseClicked(MouseEvent e) {
				String inputId = id.getText();
				char[] inputPwd = pwd.getPassword();

				if(inputId.isEmpty()) {
					JOptionPane.showMessageDialog(null, "���̵� Ȥ�� ��й�ȣ�� �Է��ϼ���");
					return;
				}
		// id pwd �޾Ƽ� LoginController�� �Ѱܼ� üũ
				boolean checkYn = lc.loginCheck(inputId, inputPwd);
				if (checkYn) {
					JOptionPane.showMessageDialog(null, " �α����� �Ǿ����ϴ�! ");
				} else {
					JOptionPane.showMessageDialog(null, " ���̵� Ȥ�� ��й�ȣ�� Ʋ�Ƚ��ϴ�. ");
					return;
				}
				mf.getContentPane().removeAll();
				mf.getContentPane().add(new MainPage(mf));
				mf.repaint();
				mf.setVisible(true);
			}

		});
		this.add(logBtn);

		JButton signUpBtn = new JButton("SignUp");
		signUpBtn.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// 1. ���� �������� �����̳ʸ� ���� ��� ���� �����
				mf.getContentPane().removeAll();
				// 2. ���� �������� �����̳ʿ� �̵��ϰ��� �ϴ� �г��� �߰��Ѵ�
				mf.getContentPane().add(new SignUpPage(mf));
				// 3. �ٽ� �׸���	
				mf.repaint();
				mf.setVisible(true);
			}

		});
		this.add(signUpBtn);
	}
}
