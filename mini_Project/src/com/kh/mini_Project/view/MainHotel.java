package com.kh.mini_Project.view;

import java.awt.GridLayout;

import javax.swing.JFrame;

public class MainHotel extends JFrame{

   public MainHotel() {
      this.setTitle("HOTEL");
      this.setLayout(new GridLayout(1,20,10,20));
      this.setSize(1200, 800);
      this.setLocationRelativeTo(null);
      this.setResizable(false);
      
      this.getContentPane().add(new HotelPage(this));
      
      this.setVisible(true);
   
   }
}