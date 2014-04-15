package ru.valuev.gui;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Form_136WorkWithButton extends JFrame {
	public Form_136WorkWithButton() {
		setSize(new Dimension(400, 200));
		
		final JButton btnMyButton = new JButton("Click me!");
		btnMyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnMyButton)
				JOptionPane.showMessageDialog(null, "Button");
			}
		});
		getContentPane().add(btnMyButton); //, BorderLayout.NORTH);
	}

}
