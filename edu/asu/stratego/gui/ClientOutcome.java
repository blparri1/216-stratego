package edu.asu.stratego.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JScrollPane;


/**
 * Creates a frame to popup at the end of the game to show the outcome.
 * Player must click Exit for the game and window to close.
 * @author Bryan Parrish
 *
 */
public class ClientOutcome extends JFrame {

	BorderLayout layout;
	Dimension dim;
	JScrollPane scroll;
	ScrollPort port;
	public BufferedImage youWin;
	public BufferedImage youLose;
	public BufferedImage dis;
	JButton button;
	
	public ClientOutcome(int outcome){
		this.setSize(256, 281);
		this.setLayout(null);
		this.setUndecorated(true);
//		panel = new JPanel(layout);
		button = new JButton("Exit");
		button.setBounds(50, 256, 156, 25);
		button.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);	
			}
		});
		try {
			youWin = ImageIO.read(ClientOutcome.class.getResource("images/YouWin.png"));
			youLose = ImageIO.read(ClientOutcome.class.getResource("images/YouLose.png"));
			dis = ImageIO.read(ClientOutcome.class.getResource("images/Disconnected.png"));
		} catch (IOException e) {
			System.out.println("[ERROR} Win/Lose image unable to load.");
		}
		port = new ScrollPort();
		dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		scroll = new JScrollPane();
		scroll.setSize(256, 256);
		scroll.setBounds(0, 0, 256, 256);
		this.add(scroll);
		if (outcome == 1)  { //win
			port.setBackground(youWin);
		} else if (outcome == 2) {
			port.setBackground(youLose);
		} else {
			port.setBackground(dis);
		}
		scroll.setViewport(port);
		this.add(button);
		this.setVisible(true);
		this.toFront();
	}
	
}
