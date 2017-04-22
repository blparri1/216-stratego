package edu.asu.stratego.gui;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.JComponent;
import javax.swing.JScrollPane;
import javax.swing.JViewport;

import edu.asu.stratego.media.ImageConstants;

import java.awt.Rectangle;
import java.awt.TexturePaint;

/**
 * Task #153 - Viewpoint needed to create the watermarks
 * @author Bryan Parrish
 *
 */
public class ScrollPort extends JViewport {
	
	static TexturePaint texture;
	
	public ScrollPort(){
		super();
	}
	
	public static void setBackground(BufferedImage image){
		Rectangle rect = new Rectangle(0, 0, 256, 256); 
		texture = new TexturePaint(image, rect);
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D) g;
		g2.setPaint(texture);
		g.fillRect(0, 0, 256, 256);
	}

	public void setView(JComponent view) {
	    view.setOpaque(false);
	    super.setView(view);
	}
}
