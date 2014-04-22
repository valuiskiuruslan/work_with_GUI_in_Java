package ru.valuev.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Form_151UseJPanelForGraphic extends JFrame
{
	MyPanel myPanel;
	JPanel buttons;
	JButton redButton;
	JButton greenButton;
	JButton yellowButton;

	public Form_151UseJPanelForGraphic()
	{
		this.setSize(new Dimension(400, 200));
		Container c = this.getContentPane();

		myPanel = new MyPanel();

		redButton = new JButton("red");
		redButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				myPanel.draw(MyPanel.RED);
			}
		});
		
		greenButton = new JButton("green");
		greenButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				myPanel.draw(MyPanel.GREEN);
			}
		});
		
		yellowButton = new JButton("yellow");
		yellowButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				myPanel.draw(MyPanel.YELLOW);
			}
		});
		
		buttons = new JPanel();
		buttons.setLayout(new GridLayout(1, 3));
		
		buttons.add(redButton);
		buttons.add(greenButton);
		buttons.add(yellowButton);
		
		c.setLayout(new BorderLayout());
		
		c.add(myPanel, BorderLayout.CENTER);
		c.add(buttons, BorderLayout.SOUTH);
	}
}

class MyPanel extends JPanel
{
	public final static int RED = 1, GREEN = 2, YELLOW = 3;
	int color = 1;

	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		switch (color)
		{
		case RED:
			g.setColor(Color.RED);
			break;
			
		case GREEN:
			g.setColor(Color.GREEN);
			break;
			
		case YELLOW:
			g.setColor(Color.YELLOW);
			break;

		default:
			JOptionPane.showMessageDialog(null, "Sorry");
		}

		g.fillRect(50, 10, 60, 60);
	}

	public void draw(int color)
	{
		this.color = color;
		repaint();
	}
}
