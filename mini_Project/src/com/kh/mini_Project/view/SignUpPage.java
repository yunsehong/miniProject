package com.kh.mini_Project.view;

import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SignUpPage extends JPanel {

	public SignUpPage(JFrame mf) {

		JPanel mainPanel = new JPanel();

		mainPanel.setLayout(new GridLayout(6, 1));

		JPanel idPanel = new JPanel();
		idPanel.add(new JLabel("아이디 : "));
		JTextField idText = new JTextField(10);
		idPanel.add(idText);
		mainPanel.add(idPanel);
		this.add(mainPanel);

		JPanel pwdPanel = new JPanel();
		pwdPanel.add(new JLabel("비밀번호 : "));
		JTextField pwdText = new JTextField(10);
		pwdPanel.add(pwdText);
		mainPanel.add(pwdPanel);
		this.add(mainPanel);

		JPanel pwdCheckPanel = new JPanel();
		pwdCheckPanel.add(new JLabel("비밀번호 확인 : "));
		JTextField pwdCheckText = new JTextField(10);
		pwdCheckPanel.add(pwdCheckText);
		mainPanel.add(pwdCheckPanel);
		this.add(mainPanel);

		JPanel namePanel = new JPanel();
		namePanel.add(new JLabel("이름 : "));
		JTextField nameText = new JTextField(10);
		namePanel.add(nameText);
		mainPanel.add(namePanel);
		this.add(mainPanel);

		JPanel agePanel = new JPanel();
		agePanel.add(new JLabel("나이 : "));
		JTextField ageText = new JTextField(10);
		agePanel.add(ageText);
		mainPanel.add(agePanel);
		this.add(mainPanel);

		JButton btn = new JButton("확인");
		btn.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// 회원 정보 입력값 받아옴
				String inputId = idText.getText();
				String inputPwd = pwdText.getText();
				String inputPwdCheck = pwdCheckText.getText();
				String inputName = nameText.getText();
				String inputAge = ageText.getText();
				
				// 회원 정보 미입력 시
				if (inputId.isEmpty()) {
					JOptionPane.showMessageDialog(null, "회원정보를 입력하세요.");
					return;
				}

				// 비밀번호, 2차 비밀번호 비교
				if (!inputPwd.equals(inputPwdCheck)) {
					JOptionPane.showMessageDialog(null, "비밀번호가 다릅니다.");
					return;
				}
				// fileSave
				try (BufferedWriter file = new BufferedWriter(new FileWriter("user.txt", true))) {

					String contents = inputId + ", " + inputPwd + ", " + inputName + ", " + inputAge;
					file.write(contents);
					file.newLine();

					JOptionPane.showMessageDialog(null, " 회원가입이 되었습니다! ");

					mf.getContentPane().removeAll();
					mf.getContentPane().add(new LoginPage(mf));
					mf.repaint();
					mf.setVisible(true);

				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		// 돌아가기 누르면 로그인창으로
		JButton returnBtn = new JButton("돌아가기");
		returnBtn.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				mf.getContentPane().removeAll();
				mf.getContentPane().add(new LoginPage(mf));
				mf.repaint();
				mf.setVisible(true);
			}

		});

		this.add(btn);
		this.add(returnBtn);

	}

}
