package ru.valuev.gui_155;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class L_156_WorkWithMenu_1 extends JFrame
{
	public L_156_WorkWithMenu_1()
	{
		this.setSize(new Dimension(400, 200));
		Container c = this.getContentPane();
		
		

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
		
		JMenu action = new JMenu("Action");
		action.setMnemonic('C');
		
		JMenuItem ok = new JMenuItem("OK");
		ok.setMnemonic('O');
		ok.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showMessageDialog(null, "OK");
			}
		});
		
		action.add(ok);
		
		bar.add(action);

	}
}
