package ru.valuev.gui;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 * With his help create a rectangular area to work with text that it represents
 * a set of line
 * 
 * @author RUSLAN
 * 
 */
public class Form_150JTextArea extends JFrame
{
	JTextArea text;
	JButton button;

	public Form_150JTextArea()
	{
		this.setSize(new Dimension(400, 200));
		Container c = this.getContentPane();
		c.setLayout(new GridLayout(1, 2));

		text = new JTextArea("", 10, 15);
		//text.setCaretPosition(text.getWidth());
		text.setLineWrap(true);
		c.add(text);

		button = new JButton("Submit");
		button.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null, text.getText());
			}

		});

		c.add(button);
	}

}
