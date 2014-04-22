package ru.valuev.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Form_152UseJPanelForHandlingEvents extends JFrame
{
	private static final long serialVersionUID = 1L;
	MyPanel1 myPanel;

	public Form_152UseJPanelForHandlingEvents()
	{
		this.setSize(new Dimension(400, 200));
		Container c = this.getContentPane();

		c.setLayout(new BorderLayout());

		myPanel = new MyPanel1();
		c.add(myPanel, BorderLayout.CENTER);

	}
}

class MyPanel1 extends JPanel
{
	private static final long serialVersionUID = 1L;
	private int x;
	private int y;

	public MyPanel1()
	{
		// addMouseListener(new MouseAdapter()
		// {
		// @Override
		// public void mousePressed(MouseEvent e)
		// {
		// x = e.getX();
		// y = e.getY();
		//
		// repaint();
		// }
		// });

		addMouseMotionListener(new MouseAdapter()
		{
			// @Override
			// public void mouseMoved(MouseEvent e)
			// {
			// x = e.getX();
			// y = e.getY();
			//
			// repaint();
			// }

			@Override
			public void mouseDragged(MouseEvent e)
			{
				x = e.getX();
				y = e.getY();
				
				repaint();
			}
		});
	}

	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);

		g.setColor(Color.GRAY);
		g.fillRect(x, y, 10, 10);
	}
}
