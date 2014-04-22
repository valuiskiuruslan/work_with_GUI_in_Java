package ru.valuev.gui;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class Program
{

	public static void main(String[] args)
	{
		java.awt.EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{

				// Form f = new Form();
				// FormWorkWithButton f = new FormWorkWithButton();
				// FormWorkWithButtonsState f = new FormWorkWithButtonsState();
				// FormRadioButton f = new FormRadioButton();
				// FormComboBox f = new FormComboBox();
				// FormJListSingleChoice f = new FormJListSingleChoice();
				// FormJListMultipleChoice f = new FormJListMultipleChoice();
				// Form_142HandlingMouseEvent f = new
				// Form_142HandlingMouseEvent();
				// Form_143AdapterClasses f = new Form_143AdapterClasses();

				// Form_144_AdapterClasses2DifferentMouseKey f = new
				// Form_144_AdapterClasses2DifferentMouseKey();
				// f.addWindowListener(new WindowAdapter() {
				// @Override
				// public void windowClosing(WindowEvent e) {
				// System.exit(0);
				// }
				// });

				// Form_145HandlingKeyboardEvents f = new
				// Form_145HandlingKeyboardEvents();
				//Form_146FlowLayout f = new Form_146FlowLayout();
				//Form_147BorderLayout f = new Form_147BorderLayout();
				//Form_148GridLayout f = new Form_148GridLayout();
				//Form_149JPanel f = new Form_149JPanel();
				
				//Form_150JTextArea f = new Form_150JTextArea();
				//Form_151UseJPanelForGraphic f = new Form_151UseJPanelForGraphic();
				//Form_152UseJPanelForHandlingEvents f = new Form_152UseJPanelForHandlingEvents();
				//Form_153JSlider f = new Form_153JSlider();
				
				Form_154JFrameEvents f = new Form_154JFrameEvents();
				
				f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				f.setVisible(true);
			}

		});
	}

}
