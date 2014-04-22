package ru.valuev.gui_155;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButtonMenuItem;

public class L_157_158_WorkWithMenu_2_3 extends JFrame
{
	JLabel text;
	Color[] colors = { Color.RED, Color.BLUE, Color.GREEN };
	String[] colorNames = { "Red", "Blue", "Green" };

	JRadioButtonMenuItem[] colItems;

	ButtonGroup group;

	JCheckBoxMenuItem[] colItems2;

	public L_157_158_WorkWithMenu_2_3()
	{
		this.setSize(new Dimension(400, 200));
		Container c = this.getContentPane();
		c.setLayout(new BorderLayout());

		// File
		// ------------------------------------------------------------
		JMenu file = new JMenu("File (F)");
		file.setMnemonic('F');

		JMenuItem about = new JMenuItem("About (A)");
		about.setMnemonic('A');
		about.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null, "About");
			}
		});

		file.add(about);

		JMenuBar bar = new JMenuBar();
		this.setJMenuBar(bar);

		bar.add(file);
		// ------------------------------------------------------------

		// Format2
		// ------------------------------------------------------------
		JMenu format2 = new JMenu("Format2 (T)");
		format2.setMnemonic('T');

		JMenu colorMenu2 = new JMenu("Color2 (O)");
		colorMenu2.setMnemonic('O');

		CheckHandler itemHandler2 = new CheckHandler();

		colItems2 = new JCheckBoxMenuItem[colors.length];
		for (int i = 0; i < colors.length; i++)
		{
			colItems2[i] = new JCheckBoxMenuItem(colorNames[i]);
			colorMenu2.add(colItems2[i]);

			colItems2[i].addItemListener(itemHandler2);
		}

		format2.add(colorMenu2);
		bar.add(format2);
		// ------------------------------------------------------------

		// Format
		// ------------------------------------------------------------
		JMenu format = new JMenu("Format (R)");
		format.setMnemonic('R');

		JMenu colorMenu = new JMenu("Colors (7)");
		colorMenu.setMnemonic('7');

		colItems = new JRadioButtonMenuItem[colors.length];

		group = new ButtonGroup();
		Handler itemHandler = new Handler();

		for (int i = 0; i < colors.length; i++)
		{
			colItems[i] = new JRadioButtonMenuItem(colorNames[i]);
			group.add(colItems[i]);
			colorMenu.add(colItems[i]);

			colItems[i].addActionListener(itemHandler);
		}

		colItems[0].setSelected(true);

		format.add(colorMenu);
		bar.add(format);
		// ------------------------------------------------------------

		text = new JLabel("Text");
		c.add(text);

		text.setForeground(Color.RED);
	}
	
	class CheckHandler implements ItemListener
	{
		int r = 0;
		int b = 0;
		int g = 0;

		public void itemStateChanged(ItemEvent e)
		{
			r = colItems2[0].isSelected() ? 128 : 0;
			b = colItems2[1].isSelected() ? 128 : 0;
			g = colItems2[2].isSelected() ? 128 : 0;

			text.setForeground(new Color(r, g, b));

			repaint();
		}
	}

	class Handler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			for (int i = 0; i < colors.length; i++)
			{
				if (colItems[i].isSelected())
				{
					text.setForeground(colors[i]);
					break;
				}
			}

			repaint();
		}
	}

}
