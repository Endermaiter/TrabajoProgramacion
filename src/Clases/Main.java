package Clases;

import gui.Menu;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new Menu();
                frame.setSize(600,800);
                frame.setVisible(true);
                frame.setLocationRelativeTo(null);
            }
        });
    }

}
