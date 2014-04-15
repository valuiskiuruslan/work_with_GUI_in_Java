package ru.valuev.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Form_138RadioButton extends JFrame {
	private JTextField txtHello;
	private JRadioButton rdbtnRed;
	private JRadioButton rdbtnBlue;
	public Form_138RadioButton() {
		setSize(new Dimension(400, 200));
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		txtHello = new JTextField();
		txtHello.setText("Hello");
		txtHello.setBackground(Color.RED);
		getContentPane().add(txtHello);
		txtHello.setColumns(10);
		
		rdbtnRed = new JRadioButton("red");
		rdbtnRed.setSelected(true);
		getContentPane().add(rdbtnRed);
		
		rdbtnBlue = new JRadioButton("blue");
		getContentPane().add(rdbtnBlue);
		
		Handler handler = new Handler();
		rdbtnRed.addItemListener(handler);
		rdbtnBlue.addItemListener(handler);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnRed);
		group.add(rdbtnBlue);
		
		
		
	}
	
	class Handler implements ItemListener {
		Color color;		

		@Override
		public void itemStateChanged(ItemEvent e) {
			if (e.getSource() == rdbtnRed) {
				txtHello.setBackground(Color.RED);
			} else if (e.getSource() == rdbtnBlue) {
				txtHello.setBackground(Color.BLUE);	
			}
		}
		
	}

}
