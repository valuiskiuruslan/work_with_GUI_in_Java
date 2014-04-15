package ru.valuev.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;


public class Form_136_WorkWithButtonsState extends JFrame {
	private JTextField txtAsdf;
	private JCheckBox chckbxChangeBackround;
	public Form_136_WorkWithButtonsState() {
		setSize(new Dimension(400, 200));
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		txtAsdf = new JTextField();
		txtAsdf.setText("asdf");
		getContentPane().add(txtAsdf);
		txtAsdf.setColumns(10);
		
		chckbxChangeBackround = new JCheckBox("red");
		chckbxChangeBackround.addItemListener(new ItemListener() {
			Color color;
			
			public void itemStateChanged(ItemEvent e) {
//				 if (e.getStateChange() == ItemEvent.SELECTED) {
//					 color = txtAsdf.getBackground();
//					 txtAsdf.setBackground(Color.RED);					 
//				 } else {
//					 txtAsdf.setBackground(color);					 
//				 }
				
				if (chckbxChangeBackround.isSelected()) {
					color = txtAsdf.getBackground();
					txtAsdf.setBackground(Color.RED);
				} else {
					txtAsdf.setBackground(color);	
				}
			}
		});
		getContentPane().add(chckbxChangeBackround);
	}
	
}
