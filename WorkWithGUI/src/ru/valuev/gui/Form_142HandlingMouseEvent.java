package ru.valuev.gui;

import javax.swing.JFrame;

import java.awt.FlowLayout;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JTextField;

public class Form_142HandlingMouseEvent extends JFrame implements MouseListener, MouseMotionListener {
	private JTextField txtText;
	public Form_142HandlingMouseEvent() {
		setSize(new Dimension(400, 200));
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		txtText = new JTextField();
		txtText.setText("text");
		getContentPane().add(txtText);
		txtText.setColumns(20);
		
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	
	// MouseListener
	//---------------------------------------------
	@Override
	public void mouseClicked(MouseEvent e) {
		txtText.setText("Click in " + e.getX() + " " + e.getY());
		
	}
	
	@Override	
	 /**
	  * Если мышь входит в пределы компонента
	  */
	public void mouseEntered(MouseEvent e) {
		txtText.setText("enter");	
	}
	
	@Override
	/**
	 * Если мышь покинула пределы компонента
	 */
	public void mouseExited(MouseEvent e) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		txtText.setText("exit");
	}
	
	@Override
	/**
	 * Обработка события нажатия на кнопку мыши
	 */
	public void mousePressed(MouseEvent e) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		txtText.setText("Press in " + e.getX() + " " + e.getY());
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {
		txtText.setText("Release in " + e.getX() + " " + e.getY());
	}
	//---------------------------------------------

	// MouseMotionListener
	//---------------------------------------------
	@Override
	public void mouseDragged(MouseEvent e) {
		txtText.setText("Drag in " + e.getX() + " " + e.getY());		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		txtText.setText("Move in " + e.getX() + " " + e.getY());
	}
	// ---------------------------------------------
	
	

}
