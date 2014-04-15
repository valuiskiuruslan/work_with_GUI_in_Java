package ru.valuev.gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class Form_140JListSingleChoice extends JFrame {
	private JTextField txtWorkWithJlist;
	private String[] colors = {"red", "blue", "green", "yellow", "white"};
	
	private Color[] stat = {Color.red, Color.blue, Color.green, Color.yellow, Color.white};
	private JList list;
	
	public Form_140JListSingleChoice() {
		setSize(new Dimension(400, 200));
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		txtWorkWithJlist = new JTextField();
		txtWorkWithJlist.setText("Work with JList");
		getContentPane().add(txtWorkWithJlist);
		txtWorkWithJlist.setColumns(10);
		
		list = new JList(colors);
		list.setVisibleRowCount(4);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		getContentPane().add(new JScrollPane(list));
		
		list.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				txtWorkWithJlist.setBackground(stat[list.getSelectedIndex()]);
			}
			
		});
	}

}
