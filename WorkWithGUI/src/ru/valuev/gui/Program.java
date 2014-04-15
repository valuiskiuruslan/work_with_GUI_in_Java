package ru.valuev.gui;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class Program {

	public static void main(String[] args) {
	//	Form f = new Form();
	//	FormWorkWithButton f = new FormWorkWithButton();
	//	FormWorkWithButtonsState f = new FormWorkWithButtonsState();
		//FormRadioButton f = new FormRadioButton();
		//FormComboBox f = new FormComboBox();
		//FormJListSingleChoice f = new FormJListSingleChoice();
		//FormJListMultipleChoice f = new FormJListMultipleChoice();
		Form_142HandlingMouseEvent f = new Form_142HandlingMouseEvent();
		//Form_143AdapterClasses f = new Form_143AdapterClasses();
		
//		Form_144_AdapterClasses2DifferentMouseKey f = new Form_144_AdapterClasses2DifferentMouseKey();
//		f.addWindowListener(new WindowAdapter() {
//			@Override
//			public void windowClosing(WindowEvent e) {
//				System.exit(0);
//			}
//		});
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

}
