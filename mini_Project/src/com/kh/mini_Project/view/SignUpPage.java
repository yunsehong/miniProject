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
		idPanel.add(new JLabel("���̵� : "));
		JTextField idText = new JTextField(10);
		idPanel.add(idText);
		mainPanel.add(idPanel);
		this.add(mainPanel);

		JPanel pwdPanel = new JPanel();
		pwdPanel.add(new JLabel("��й�ȣ : "));
		JTextField pwdText = new JTextField(10);
		pwdPanel.add(pwdText);
		mainPanel.add(pwdPanel);
		this.add(mainPanel);

		JPanel pwdCheckPanel = new JPanel();
		pwdCheckPanel.add(new JLabel("��й�ȣ Ȯ�� : "));
		JTextField pwdCheckText = new JTextField(10);
		pwdCheckPanel.add(pwdCheckText);
		mainPanel.add(pwdCheckPanel);
		this.add(mainPanel);

		JPanel namePanel = new JPanel();
		namePanel.add(new JLabel("�̸� : "));
		JTextField nameText = new JTextField(10);
		namePanel.add(nameText);
		mainPanel.add(namePanel);
		this.add(mainPanel);

		JPanel agePanel = new JPanel();
		agePanel.add(new JLabel("���� : "));
		JTextField ageText = new JTextField(10);
		agePanel.add(ageText);
		mainPanel.add(agePanel);
		this.add(mainPanel);

		JButton btn = new JButton("Ȯ��");
		btn.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// ȸ�� ���� �Է°� �޾ƿ�
				String inputId = idText.getText();
				String inputPwd = pwdText.getText();
				String inputPwdCheck = pwdCheckText.getText();
				String inputName = nameText.getText();
				String inputAge = ageText.getText();
				
				// ȸ�� ���� ���Է� ��
				if (inputId.isEmpty()) {
					JOptionPane.showMessageDialog(null, "ȸ�������� �Է��ϼ���.");
					return;
				}

				// ��й�ȣ, 2�� ��й�ȣ ��
				if (!inputPwd.equals(inputPwdCheck)) {
					JOptionPane.showMessageDialog(null, "��й�ȣ�� �ٸ��ϴ�.");
					return;
				}
				// fileSave
				try (BufferedWriter file = new BufferedWriter(new FileWriter("user.txt", true))) {

					String contents = inputId + ", " + inputPwd + ", " + inputName + ", " + inputAge;
					file.write(contents);
					file.newLine();

					JOptionPane.showMessageDialog(null, " ȸ�������� �Ǿ����ϴ�! ");

					mf.getContentPane().removeAll();
					mf.getContentPane().add(new LoginPage(mf));
					mf.repaint();
					mf.setVisible(true);

				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		// ���ư��� ������ �α���â����
		JButton returnBtn = new JButton("���ư���");
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
