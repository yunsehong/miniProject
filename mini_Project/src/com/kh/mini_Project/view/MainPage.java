package com.kh.mini_Project.view;

import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingConstants;
import javax.swing.JSplitPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class MainPage extends JPanel {
   public void paintComponent(Graphics g) {
      Dimension d = getSize();
      ImageIcon image = new ImageIcon("MainPage.jpg");
      g.drawImage(image.getImage(), 0, 0, d.width, d.height, null);
   }

   private JTextField textField;

   public MainPage(JFrame mf) {
      setLayout(null);

      // 음식점버튼
      JButton foodBtn = new JButton("음식점");
      foodBtn.setFont(new Font("굴림", Font.BOLD, 30));
      foodBtn.setForeground(new Color(255, 255, 255));
      foodBtn.setOpaque(false);
      foodBtn.setContentAreaFilled(false);
      foodBtn.setBorderPainted(false);

      foodBtn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            mf.getContentPane().removeAll();
            mf.getContentPane().add(new FoodPage(mf));
            mf.repaint();
            mf.setVisible(true);

         }
      });
      foodBtn.setBounds(69, 396, 300, 70);
      add(foodBtn);

      // 숙박버튼
      JButton lodgmentBtn = new JButton("숙박시설");
      lodgmentBtn.setFont(new Font("굴림", Font.BOLD, 30));
      lodgmentBtn.setForeground(new Color(255, 255, 255));
      lodgmentBtn.setOpaque(false);
      lodgmentBtn.setContentAreaFilled(false);
      lodgmentBtn.setBorderPainted(false);

      lodgmentBtn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            mf.getContentPane().removeAll();
            mf.getContentPane().add(new MainHotel());
            mf.repaint();
            mf.setVisible(true);

         }
      });

      lodgmentBtn.setBounds(69, 465, 300, 70);
      add(lodgmentBtn);

      // 여가버튼
      JButton culture = new JButton("여가시설");
      culture.setFont(new Font("굴림", Font.BOLD, 30));
      culture.setForeground(new Color(255, 255, 255));
      culture.setOpaque(false);
      culture.setContentAreaFilled(false);
      culture.setBorderPainted(false);
      culture.setBounds(69, 533, 300, 70);

      culture.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            mf.getContentPane().removeAll();
            mf.getContentPane().add(new culturePage(mf));
            mf.repaint();
            mf.setVisible(true);
         }
      });

      add(culture);

      // 금융버튼
      JButton financeBtn = new JButton("금융시설");
      financeBtn.setFont(new Font("굴림", Font.BOLD, 30));      
      financeBtn.setForeground(new Color(255, 255, 255));
      financeBtn.setOpaque(false);
      financeBtn.setContentAreaFilled(false);
      financeBtn.setBorderPainted(false);
      financeBtn.setBounds(69, 602, 300, 70);
      financeBtn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            mf.getContentPane().removeAll();
            mf.getContentPane().add(new financePage(mf));
            mf.repaint();
            mf.setVisible(true);

         }
      });

      add(financeBtn);

      // Mypage
      JButton MyPageBtn = new JButton("마이페이지");
      MyPageBtn.setFont(new Font("굴림", Font.BOLD, 20));
      MyPageBtn.setForeground(new Color(255, 255, 255));
      MyPageBtn.setBounds(925, 707, 161, 43);
      MyPageBtn.setOpaque(false);
      MyPageBtn.setContentAreaFilled(false);
      MyPageBtn.setBorderPainted(false);

      MyPageBtn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            mf.getContentPane().removeAll();
            mf.getContentPane().add(new MypageView(mf));
            mf.repaint();
            mf.setVisible(true);
         }
      });

      add(MyPageBtn);

      // 어서오세요 라벨
      JLabel lblNewLabel = new JLabel("어서오세요!");
      lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 60));
      lblNewLabel.setForeground(new Color(255, 255, 255));
      lblNewLabel.setBounds(682, 350, 323, 222);
      add(lblNewLabel);

      JLabel lblNewLabel_1 = new JLabel("\uC190\uC548\uC5D0 \uAC15\uB0A8");
      lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 70));
      lblNewLabel_1.setForeground(new Color(255, 255, 255));
      lblNewLabel_1.setBounds(404, 101, 400, 136);
      add(lblNewLabel_1);

   }
}