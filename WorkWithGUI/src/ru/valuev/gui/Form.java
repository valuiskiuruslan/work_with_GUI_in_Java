package ru.valuev.gui;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Form extends JFrame {
	private JPasswordField pwdHiddenText;
	private JTextField txtText;
		
	public Form() {
		setSize(new Dimension(400, 200));
		setTitle("My Frame\r\n");
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		txtText = new JTextField();
		txtText.setText("Text");
		getContentPane().add(txtText);
		txtText.setColumns(10);
		
		pwdHiddenText = new JPasswordField();
		pwdHiddenText.setText("Hidden Text");
		getContentPane().add(pwdHiddenText);
	
		
		FieldHandler handler = new FieldHandler();
		txtText.addActionListener(handler);
		pwdHiddenText.addActionListener(handler);
	
	}
	
	class FieldHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == txtText) {
				JOptionPane.showMessageDialog(null, "Text Field");
			} else if (e.getSource() == pwdHiddenText) {
				JOptionPane.showMessageDialog(null, "Password Field");
			}
			
		}
		
	}

}
