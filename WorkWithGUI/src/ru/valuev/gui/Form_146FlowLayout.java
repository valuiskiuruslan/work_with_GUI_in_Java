package ru.valuev.gui;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Form_146FlowLayout extends JFrame
{
	FlowLayout layout;
	
	public Form_146FlowLayout()
	{
		this.setSize(new Dimension(400, 200));
		
		layout = new FlowLayout();
		layout.setAlignment(FlowLayout.CENTER);
		
		this.getContentPane().setLayout(layout); // components layout
															// from left to
															// right

		JButton b1 = new JButton("First");
		JButton b2 = new JButton("Second");
		JButton b3 = new JButton("Third");
		
		layout.setAlignment(FlowLayout.RIGHT);
		layout.layoutContainer(this.getContentPane());

		this.getContentPane().add(b1);
		this.getContentPane().add(b2);
		this.getContentPane().add(b3);

	}
}
