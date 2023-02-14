package Components;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JPanel;

public class PanelCustomWhite extends JPanel {
	public PanelCustomWhite() {
	}

	/**
	 * Create the panel.
	 */

		   protected void paintComponent(Graphics g) {
		        super.paintComponent(g);
		        Graphics2D g2d = (Graphics2D) g;
		        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
		        int w = getWidth(), h = getHeight();
		        Color color1 = new Color( 255, 255, 255 );
		        Color color2 = new Color(112, 159, 255);
		        GradientPaint gp = new GradientPaint(0, 0, color1 , w, h, color2);
		        g2d.setPaint(gp);
		        g2d.fillRect(0, 0, w, h);
		    }

	}


