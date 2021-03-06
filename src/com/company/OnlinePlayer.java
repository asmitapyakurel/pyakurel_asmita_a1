package com.company;


import java.awt.Color;
import java.util.Random;

public class OnlinePlayer extends Player {

    private Player[] players = new Player[1];

    private Random rand = new Random();
    String NAME;

    public OnlinePlayer(int x, int y, int velocityX, int velocityY, Color color, String DIR, String name, boolean jetWall){
        super(x, y, velocityX, velocityY, color, DIR, jetWall);
        this.NAME = name;
    }

    // This does nothing as human players can see screen

    public void move(){

    }

    public void changePosition(int xNew, int yNew) {
        int a = x;
        int b = y;

        if (jetWall) {
            x = xNew;
            y = yNew;
            if (lines.size() > 1) {
                Shape l1 = lines.get(lines.size() - 2);
                Shape l2 = lines.get(lines.size() - 1);
                if (a == l1.getStartX() && l1.getEndY() == l2.getStartY()) {
                    lines.add(new Line(l1.getStartX(), l1.getStartY(), l2.getEndX(), l2.getEndY()));
                    lines.remove(lines.size() - 2);
                    lines.remove(lines.size() - 2);
                }
                else if (b == l1.getStartY() && l1.getEndX() == l2.getStartX()) {
                    lines.add(new Line(l1.getStartX(), l1.getStartY(), l2.getEndX(), l2.getEndY()));
                    lines.remove(lines.size() - 2);
                    lines.remove(lines.size() - 2);
                }
            }
            lines.add(new Line(a, b, x, y));
        }
        else {
            jetWall = false;
        }

    }
}
