package ru.valuev.gui;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Form_145HandlingKeyboardEvents extends JFrame {
	public Form_145HandlingKeyboardEvents() {
		setTitle("Handling Keyboard Event");
		setSize(new Dimension(132, 272));
		getContentPane().setLayout(null);
		
		JButton btnPressme = new JButton("pressMe");
		btnPressme.setBounds(10, 11, 89, 23);
		getContentPane().add(btnPressme);
		
		btnPressme.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "PressMe");				
			}
			
		});
		
		final JPanel panel = new JPanel();
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				panel.requestFocusInWindow();
			}
		});
		panel.setBounds(205, 11, 169, 119);
		getContentPane().add(panel);
		panel.setLayout(null);
		panel.addKeyListener(new KeyListener() {

			@Override 
			public void keyPressed(KeyEvent e) {
				JOptionPane.showMessageDialog(null, "Pressed " + e.getKeyText(e.getKeyCode()));
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				JOptionPane.showMessageDialog(null, "Released " + e.getKeyText(e.getKeyCode()));
			}
			
			// Получить любую клавишу, кроме управляющий
			// Get any key, except the control
			@Override
			public void keyTyped(KeyEvent e) {
				JOptionPane.showMessageDialog(null, "Typed " + e.getKeyChar());
			}
			
		});
		
		final JButton btnIwantfocus = new JButton("IWantFocus");
		btnIwantfocus.setBounds(10, 11, 128, 23);
		panel.add(btnIwantfocus);
		btnIwantfocus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "IWantFocus");				
			}
		});
		
		
		this.setMinimumSize(new Dimension(400, 200));
		this.pack();
		this.setSize(new Dimension(400, 200));
	//	btnIwantfocus.requestFocusInWindow();
		panel.requestFocusInWindow();
		
		this.setSize(new Dimension(400, 200));
		//Make btnIwantfocus get the focus whenever frame is activated.
//		this.addWindowFocusListener(new WindowAdapter() {
//			@Override
//			public void windowGainedFocus(WindowEvent e) {
//				btnIwantfocus.requestFocusInWindow();
//			}
//		});
		
		//addKeyListener(this);
	}
	
}
