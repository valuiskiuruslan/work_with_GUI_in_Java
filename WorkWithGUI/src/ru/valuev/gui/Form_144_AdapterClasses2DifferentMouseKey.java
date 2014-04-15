package ru.valuev.gui;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Form_144_AdapterClasses2DifferentMouseKey extends JFrame {
	public Form_144_AdapterClasses2DifferentMouseKey() {
		setTitle("Frame will never close");
		setSize(new Dimension(400, 200));
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		class MyMouse extends MouseAdapter {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.isMetaDown())
					JOptionPane.showMessageDialog(null, "Right");
				else if (e.isAltDown())
					JOptionPane.showMessageDialog(null, "Middle");
				else
					JOptionPane.showMessageDialog(null, "Left");
			}
		}
		
		addMouseListener(new MyMouse());
	}

}
