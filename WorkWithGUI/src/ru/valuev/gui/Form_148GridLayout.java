package ru.valuev.gui;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Breaks container on the table and puts each specific component in a cell
 * @author RUSLAN
 *
 */
public class Form_148GridLayout extends JFrame
{
	GridLayout layout;
	
	public Form_148GridLayout() {
		this.setSize(new Dimension(400, 200));
		Container c = this.getContentPane();
		
		layout = new GridLayout(3, 2, 20, 20); // size gap
		
		c.setLayout(layout);
		
		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		JButton b3 = new JButton("3");
		JButton b4 = new JButton("4");
		JButton b5 = new JButton("5");
		JButton b6 = new JButton("6");
		
		c.add(b1);
		c.add(b2);
		c.add(b3);
		c.add(b4);
		c.add(b4);
		c.add(b5);
		c.add(b6);
	}
}
