package com.company;

import javax.swing.*;

public class grid<jet, jetString> {
    String jetString;
    boolean jet;

    int SIZE = 1000;

    jetString = JOptionPane.showInputDialog("Do you want to on or off your cycle?",
    JOptionPane.INFORMATION_MESSAGE)
    jet  = Double.parseBoolean(jetString);


}
