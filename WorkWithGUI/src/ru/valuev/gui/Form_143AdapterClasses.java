package ru.valuev.gui;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class Form_143AdapterClasses extends JFrame {
	private int x = 0;
	private int y = 0;
	private JTextField textField;
	
	public Form_143AdapterClasses() {
		setSize(new Dimension(400, 200));
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		textField = new JTextField();
		getContentPane().add(textField);
		textField.setColumns(10);
		
//		addMouseListener(new MouseAdapter() {
//			@Override
//			public void mousePressed(MouseEvent arg0) {
//			}
//		});
		
		addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				x = e.getX();
				y = e.getY();
				repaint();
			}
		});
	}
	
	@Override
	public void paint(Graphics g) {
		g.drawRect(x, y, 5, 5);
	}

}
