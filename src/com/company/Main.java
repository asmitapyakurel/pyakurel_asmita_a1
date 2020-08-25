package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String name;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name:");
        name = input.next();
        if(display_name(name))
            System.out.println("Okay");
        else
        {
            System.out.println("Name is already taken");
            System.out.println("Enter name:");
            name = input.next();
        }

    }


	public static boolean display_name(String name)
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


    }

