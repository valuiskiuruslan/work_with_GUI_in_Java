package ru.valuev.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Form_149JPanel extends JFrame
{
	JPanel p1;
	JPanel p2;
	
	public Form_149JPanel()
	{
		this.setSize(new Dimension(400, 200));
		Container c = this.getContentPane();
		
		c.setLayout(new BorderLayout());
		
		p1 = new JPanel();
		p2 = new JPanel();
		
		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		JButton b3 = new JButton("3");
		
		p1.setLayout(new GridLayout(2, 2));
		
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);	 
		
		JButton b4 = new JButton("4");
		JButton b5 = new JButton("5");
		JButton b6 = new JButton("6");
		
		p2.setLayout(new FlowLayout());
		
		p2.add(b4);
		p2.add(b5);
		p2.add(b6);
		
		
		c.add(p1, BorderLayout.NORTH);
		c.add(p2, BorderLayout.SOUTH);
		
		
	}
}
