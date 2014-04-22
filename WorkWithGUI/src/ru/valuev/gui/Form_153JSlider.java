package ru.valuev.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Form_153JSlider extends JFrame
{
	MyPanel_2 myPanel;
	JSlider slider;

	public Form_153JSlider()
	{
		this.setSize(new Dimension(400, 200));
		Container c = this.getContentPane();

		myPanel = new MyPanel_2();

		slider = new JSlider(SwingConstants.HORIZONTAL, 0, 200, 5);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.setPaintTrack(true);
		
		slider.setMajorTickSpacing(5);
		slider.addChangeListener(new ChangeListener()
		{
			public void stateChanged(ChangeEvent e)
			{
				myPanel.setLength(slider.getValue());
			}
		});
		
		c.setLayout(new BorderLayout());
		
		c.add(slider, BorderLayout.SOUTH);
		c.add(myPanel, BorderLayout.CENTER);
		

	}
}

class MyPanel_2 extends JPanel
{
	private int length = 5;

	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		g.setColor(Color.DARK_GRAY);
		g.fillRect(5, 5, length, length);
	}

	public void setLength(int length)
	{
		if (length >= 0)
			this.length = length;
		else
			this.length = 5;

		repaint();
	}
}
