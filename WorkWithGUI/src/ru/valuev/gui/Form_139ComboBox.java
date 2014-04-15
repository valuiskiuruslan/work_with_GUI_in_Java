package ru.valuev.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Form_139ComboBox extends JFrame {
	JComboBox comboBox;
	private JTextField txtField;
	//String[] colors = {"red", "blue", "green"};
	
	enum MyColor {
		RED,
		BLUE,
		GREEN,
	}
	
	public Form_139ComboBox() {
		setSize(new Dimension(400, 200));
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		comboBox = new JComboBox();
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					switch (MyColor.values()[comboBox.getSelectedIndex()]) {
					case RED:
						txtField.setBackground(Color.red);
						break;
					case BLUE:
						txtField.setBackground(Color.blue);
						break;
					case GREEN:
						txtField.setBackground(Color.green);
						break;
						
					default:
						JOptionPane.showMessageDialog(null, "Please, selecte item");
					}						
				}
			}
		});
		
		txtField = new JTextField();
		txtField.setName("txtField\r\n");
		txtField.setText("ComboBox");
		txtField.setBackground(Color.red);
		getContentPane().add(txtField);
		txtField.setColumns(10);
		comboBox.setModel(new DefaultComboBoxModel(MyColor.values()));
		getContentPane().add(comboBox);
	
		
	}

}
