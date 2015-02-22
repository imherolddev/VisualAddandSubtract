package com.imherolddev.visualaddandsubtract.models;

/**
 * Circle - a definition of a circle drawn to the canvas
 *
 * @author Jason Hall - imherolddev
 * @since 1.0
 */
public class Circle {

    //Circle attributes
    private int radius = 0;
    private int x = 0;
    private int y = 0;

    /**
     * Constructor to create Circle of a given radius at a given x and y location
     * @param radius - the radius to set
     * @param x - the x to set
     * @param y - the y to set
     */
    public Circle(int radius, int x, int y) {

        this.setRadius(radius);
        this.setX(x);
        this.setY(y);

    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}
