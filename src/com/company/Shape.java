package com.company;

import java.awt.Graphics;

// Interface for all shapes drawn on the court

public interface Shape {

    public void draw(Graphics gc);
    public boolean isVertical();
    public int getStartX();
    public int getStartY();
    public int getEndX();
    public int getEndY();
}

// Shape of trails drawn on court
class Line implements Shape {

    // Positions of starting and ending lines
    private int x;
    private int y;
    private int x2;
    private int y2;

    public Line(int x, int y, int x2, int y2) {
        this.x = x;
        this.y = y;
        this.x2 = x2;
        this.y2 = y2;
    }

    // Draws  line
    public void draw(Graphics gc) {
        gc.drawLine(x, y, x2, y2);
    }

    // Checks if line is vertical
    public boolean isVertical() {
        return (x == x2);
    }

    // Returns the starting X position
    public int getStartX() {
        return x;
    }

    // Returns the starting Y position
    public int getStartY() {
        return y;
    }

    // Returns the ending X position
    public int getEndX() {
        return x2;
    }

    // Returns the ending Y position
    public int getEndY() {
        return y2;
    }
}