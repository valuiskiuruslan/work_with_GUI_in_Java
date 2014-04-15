package ru.valuev.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Form_141JListMultipleChoice extends JFrame {
	private JTextField txtWorkWithJlist;
	private String[] colors = {"red", "blue", "green", "yellow", "white"};
	
	private Color[] stat = {Color.red, Color.blue, Color.green, Color.yellow, Color.white};
	private JList list;
	
	private JButton button;
	
	public Form_141JListMultipleChoice() {
		setSize(new Dimension(400, 200));
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		txtWorkWithJlist = new JTextField();
		txtWorkWithJlist.setText("Work with JList");
		getContentPane().add(txtWorkWithJlist);
		txtWorkWithJlist.setColumns(10);
		
		list = new JList(colors);
		list.setVisibleRowCount(4);
		list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		getContentPane().add(new JScrollPane(list));
		
		button = new JButton("Submit");
		getContentPane().add(button);
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, list.getSelectedValuesList());				
			}
			
		});
	}
}
