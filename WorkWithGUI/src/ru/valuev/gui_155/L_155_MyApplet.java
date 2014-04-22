package ru.valuev.gui_155;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class L_155_MyApplet extends JApplet
{
	public static void main(String[] args)
	{
		JFrame app = new JFrame("My App");
		L_155_MyApplet myApplet = new L_155_MyApplet();
		
		myApplet.setWidth(200);
		myApplet.setHeight(200);
		
		myApplet.init();
		myApplet.start();
		
		app.getContentPane().add(myApplet);
		
		app.setSize(new Dimension(200, 200));
		
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		app.setVisible(true);
	}
	
	JLabel label;
	JButton b1;
	JButton b2;
	
	int width;
	int height;
	
	@Override
	public void init()
	{
		this.setSize(new Dimension(width, height));
		
		label = new JLabel("First");
		b1 = new JButton("First");
		b2 = new JButton("Second");
		
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				label.setText("First");
			}
		});
		
		b2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				label.setText("Second");
			}
		});
		
		Container c = this.getContentPane();
		
		c.setLayout(new FlowLayout());
		
		c.add(label);
		c.add(b1);
		c.add(b2);
	}
	
	public void setWidth(int width)
	{
		this.width = width;
	}
	
	public void setHeight(int height)
	{
		this.height = height;
	}
}
