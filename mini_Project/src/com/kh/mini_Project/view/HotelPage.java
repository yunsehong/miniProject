package com.kh.mini_Project.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.kh.mini_Project.controller.HotelController;
import com.kh.mini_Project.model.Hotel;

public class HotelPage extends JPanel implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private HotelController hc = new HotelController();
	private JFrame mainFrame;
	private JPanel changePanel;
	private JTextField search;

	public HotelPage(JFrame mf) {
		mainFrame = mf;	
		
		JPanel panel = new JPanel();
		panel.setSize(400, 500);	
		
		panel.add(new JLabel("�˻� : "));
		search = new JTextField(30);
		panel.add(search);
		
		JButton btn = new JButton("Ȯ��");
		
		btn.addActionListener(this);

		JButton returnBtn = new JButton("�ڷΰ���");
		panel.add(returnBtn);
		
		panel.add(btn);
		
		returnBtn.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				mf.getContentPane().removeAll();
				mf.getContentPane().add(new MainPage(mf));
				mf.repaint();
				mf.setVisible(true);
			}
		});
		
		// ȣ�� ��ü����Ʈ ��� �޼ҵ� ȣ��
		ArrayList<com.kh.mini_Project.model.Hotel> list = hc.selectList();
		
		// �˻��ϸ� �Ѿ ���ο� �г�
		changePanel = new SearchList(mainFrame, list);	// JFrame �ּҰ�, ȣ�� ����Ʈ ����
		
		mainFrame.getContentPane().removeAll();
		mainFrame.getContentPane().add(panel,"North");
		mainFrame.getContentPane().add(changePanel,"Center");
		mainFrame.repaint();
		mainFrame.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() instanceof JButton) {
			
			JButton btn = (JButton)e.getSource();
			switch(btn.getText()) {
			case "Ȯ��" : 
				mainFrame.getContentPane().remove(1);
				String searchText = search.getText();
				ArrayList<Hotel> list = hc.searchList(searchText);
				changePanel = new SearchList(mainFrame, list);
				mainFrame.getContentPane().add(changePanel, "Center");
				mainFrame.repaint();
				mainFrame.setVisible(true);
				break;
			
			}
		}
		
	}
	
}
