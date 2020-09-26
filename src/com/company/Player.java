package com.company;

import java.awt.Color;
import java.awt.Graphics;

import java.util.ArrayList;

public abstract class Player extends Object {

    // State of player
    Color color;
    boolean alive = true;
    boolean jetWall = true;

    // Initial Condition
    int initialVelocity = 5;

    // Height and Width of a player
    static int HEIGHT = 5;
    static int WIDTH = 5;

    // Player's Path
    ArrayList<Shape> lines = new ArrayList
            <Shape>();

    // Default Constructor
    public Player(int randX, int randY, int velocityX, int velocityY, Color color, String DIR, boolean jetWall) {
        super(randX, randY, velocityX, velocityY, WIDTH, HEIGHT, DIR);
        initialVelocity = Math.max(Math.abs(velocityX), Math.abs(velocityY));
        this.color = color;
        this.jetWall = jetWall;
    }

    public String isJetWall() {
        String jetwallStatus = "";
        if (jetWall)
            jetwallStatus = "yes";
        else if (!(jetWall))
            jetwallStatus = "no";
        return jetwallStatus;
    }

    // Changes State of jetwall of players
    public void setjetWall(boolean jetWall) {
        this.jetWall = jetWall;
    }

    public void changeJetWall() {
        if (jetWall) {
            jetWall = false;
        }
        if (!jetWall) {
            jetWall = true;
        }
    }

    // Changes Player State if it Exits Map Boundary
    public void clip() {
        if (x < 0 || x > 800) {
            velocityX = 0;
            alive = false;
        }
        else if (y < 0 || y > 800) {
            velocityY = 0;
            alive = false;
        }
    }


    public abstract void move();

    // if true draws Players and Jetwall
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x - WIDTH/2, y - HEIGHT/2, WIDTH, HEIGHT);
        if (jetWall){
            for (Shape k: lines) {
                k.draw(g);
            }
        }
    }

    public boolean getAlive() {
        return alive;
    }

    public ArrayList<Shape> getPath() {
        return lines;
    }

    // Checks if the Player has crashed with a path
    public void crash(Intersection i) {
        if (i == Intersection.UP) {
            velocityX = 0;
            velocityY = 0;
            alive = false;
        }
    }
}

