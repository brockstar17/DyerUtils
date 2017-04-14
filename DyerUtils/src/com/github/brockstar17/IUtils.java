package com.github.brockstar17;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

public class IUtils
{
	/**
	 * Returns the scale factor between two W x H measurements
	 * 
	 * @param ow
	 *            original width
	 * @param oh
	 *            original height
	 * @param maxw
	 *            maximum allowed width
	 * @param desh
	 *            desired height
	 * @return the scale factor
	 */
	public static double getScaleFactor(double ow, double oh, double maxw, double desh) {
		boolean done = false;
		double factor = 0;

		if(oh < desh)
		{
			double inc = desh - oh;

			while(!done)
			{
				factor = inc / oh;
				if((ow * factor) <= maxw)
				{
					done = true;
					break;
				}
			}
		}
		else if(oh > desh)
		{
			double dec = oh - desh;

			while(!done)
			{
				factor = dec / oh;
				if((ow * factor) <= maxw)
				{
					done = true;
					break;
				}

			}
		}
		else
		{
			done = true;
			factor = 1;
		}

		return factor;
	}

	/**
	 * Returns a scaled image
	 * 
	 * @param img
	 *            the image to be scaled
	 * @param scale
	 *            the scale factor to scale it by
	 * @return the scaled image
	 */
	public static BufferedImage scale(BufferedImage img, double scale) {

		int w = (int) (img.getWidth() * scale + img.getWidth()),
				h = (int) (img.getHeight() * scale + img.getHeight());

		BufferedImage scaledImage = null;
		if(img != null)
		{
			scaledImage = new BufferedImage(w, h, img.getType());
			Graphics2D graphics2D = scaledImage.createGraphics();
			graphics2D.drawImage(img, 0, 0, w, h, null);
			graphics2D.dispose();
		}
		return scaledImage;
	}

	/**
	 * Draws an image centered within a rectangle Pass 0 in for y to center an image only by the x axis
	 * 
	 * @param g
	 *            the graphics component
	 * @param x
	 *            the width of the area
	 * @param y
	 *            the height of the area
	 * @param ix
	 *            the width of the image
	 * @param iy
	 *            the height of the image
	 * @param img
	 *            the image to center
	 * @param o
	 *            the ImageObserver
	 */
	public static void drawCenteredImage(Graphics g, BufferedImage img, int x, int y, int ix, int iy, ImageObserver o) {
		int scx = x / 2 - ix / 2;
		int scy = 0;

		g.drawImage(img, scx, scy, null);

	}

}
