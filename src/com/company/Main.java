package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String name;
        String colour;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name:");
        name = input.next();
        if(add_name(name))
            System.out.println("Okay");
        else
        {
            System.out.println("Name is already taken");
            System.out.println("Enter name:");
        }
        System.out.println("Enter cycle colour:");
        colour = input.next();
        if(add_colour(colour))
            System.out.println("Okay");
        else
        {
            System.out.println("cycle colour is already taken");
            System.out.println("Enter cycle colour:");
            colour = input.next();
        }
    }


	public static boolean add_name(String name)
        {
            boolean result;
            String user_name = new String();
            if (name.equals(user_name))
                result = true;
            else
            {
                result = false;
            }
            return result;





        }
    public static boolean add_colour(String colour) {
        boolean result;
        String cycle_colour = new String();

        if (colour.equals(cycle_colour))
            result = true;
        else {
            result = false;
        }
        return result;
    }

    }

