package ru.valuev.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Layout components in five areas: North, South, West, East
 * 
 * @author RUSLAN
 * 
 */
public class Form_147BorderLayout extends JFrame
{
	BorderLayout layout;

	public Form_147BorderLayout()
	{
		this.setSize(new Dimension(400, 200));

		layout = new BorderLayout(20, 20); // size gap

		this.getContentPane().setLayout(layout);

		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		JButton b3 = new JButton("3");
		JButton b4 = new JButton("4");
		JButton b5 = new JButton("5");

		Container c = this.getContentPane();
		c.add(b1, BorderLayout.NORTH);
		c.add(b2, BorderLayout.SOUTH);
		c.add(b3, BorderLayout.WEST);
		c.add(b4, BorderLayout.EAST);
		// c.add(b5, BorderLayout.CENTER);

	}
}
