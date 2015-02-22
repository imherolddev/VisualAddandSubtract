package com.imherolddev.visualaddandsubtract.models;

import java.util.ArrayList;

/**
 * CircleGroup - a group of Circle objects representing a number in the equation
 *
 * @author Jason Hall - imherolddev
 * @since 1.0
 */
public class CircleGroup {

    /**
     * List of circles in group
     */
    private ArrayList<Circle> circles;

    /**
     * Constructor taking an argument of ArrayList<Circle>
     * @param circles - the circles to set
     */
    public CircleGroup(ArrayList<Circle> circles) {
        this.setCircles(circles);
    }

    public ArrayList<Circle> getCircles() {
        return circles;
    }

    public void setCircles(ArrayList<Circle> circles) {
        this.circles = circles;
    }

    public void addCircle(Circle circle) {
        circles.add(circle);
    }

    public void removeCircle(int index) {
        circles.remove(index);
    }

}
