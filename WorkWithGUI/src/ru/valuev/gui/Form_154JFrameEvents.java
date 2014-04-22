package ru.valuev.gui;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class Form_154JFrameEvents extends JFrame
{
	public Form_154JFrameEvents()
	{
		this.setSize(new Dimension(400, 200));
		Container c = this.getContentPane();

		addWindowListener(new WindowListener() // WindowAdapter
		{

			@Override
			public void windowOpened(WindowEvent e)
			{
				System.out.println("Opened");
			}

			// before close window
			@Override
			public void windowClosing(WindowEvent e)
			{
				System.out.println("Closing");
				System.exit(0);
			}

			// After closed window
			@Override
			public void windowClosed(WindowEvent e)
			{
				System.out.println("Closed");				
			}

			
			// When user iconify window
			@Override
			public void windowIconified(WindowEvent e)
			{
				System.out.println("Iconified");
			}

			@Override
			public void windowDeiconified(WindowEvent e)
			{
				System.out.println("Deiconified");
			}

			@Override
			public void windowActivated(WindowEvent e)
			{
				System.out.println("Activated");
			}

			@Override
			public void windowDeactivated(WindowEvent e)
			{
				System.out.println("Deactivated");
			}

		});
	}
}
