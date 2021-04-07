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
		// 버튼
		JButton logBtn = new JButton("Log In");
		logBtn.addMouseListener(new MouseAdapter() {
			// 버튼 클릭 시 이벤트
			@Override
			public void mouseClicked(MouseEvent e) {
				String inputId = id.getText();
				char[] inputPwd = pwd.getPassword();

				if(inputId.isEmpty()) {
					JOptionPane.showMessageDialog(null, "아이디 혹은 비밀번호를 입력하세요");
					return;
				}
		// id pwd 받아서 LoginController로 넘겨서 체크
				boolean checkYn = lc.loginCheck(inputId, inputPwd);
				if (checkYn) {
					JOptionPane.showMessageDialog(null, " 로그인이 되었습니다! ");
				} else {
					JOptionPane.showMessageDialog(null, " 아이디 혹은 비밀번호가 틀렸습니다. ");
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
				// 1. 메인 프레임의 컨테이너를 얻어와 모든 값을 지운다
				mf.getContentPane().removeAll();
				// 2. 메인 프레임의 컨테이너에 이동하고자 하는 패널을 추가한다
				mf.getContentPane().add(new SignUpPage(mf));
				// 3. 다시 그린다	
				mf.repaint();
				mf.setVisible(true);
			}

		});
		this.add(signUpBtn);
	}
}
