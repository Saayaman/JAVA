package com.spaceinvaders;

import java.awt.Graphics;
import java.awt.Image;

/**
 * A sprites to be displayed on the screen. Note that a sprites
 * contains no state information, i.e. its just the image and 
 * not the location. This allows us to use a single sprites in
 * lots of different places without having to store multiple 
 * copies of the image.
 *
 * @author Kevin Glass
 */
public class Sprite {
    /** The image to be drawn for this sprites */
    private Image image;

    /**
     * Create a new sprites based on an image
     *
     * @param image The image that is this sprites
     */
    public Sprite(Image image) {
        this.image = image;
    }

    /**
     * Get the width of the drawn sprites
     *
     * @return The width in pixels of this sprites
     */
    public int getWidth() {
        return image.getWidth(null);
    }

    /**
     * Get the height of the drawn sprites
     *
     * @return The height in pixels of this sprites
     */
    public int getHeight() {
        return image.getHeight(null);
    }

    /**
     * Draw the sprites onto the graphics context provided
     *
     * @param g The graphics context on which to draw the sprites
     * @param x The x location at which to draw the sprites
     * @param y The y location at which to draw the sprites
     */
    public void draw(Graphics g,int x,int y) {
        g.drawImage(image,x,y,null);
    }
}