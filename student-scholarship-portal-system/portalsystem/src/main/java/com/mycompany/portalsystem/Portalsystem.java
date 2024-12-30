package com.mycompany.portalsystem;

import java.awt.event.MouseListener;

public class Portalsystem {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }
}
