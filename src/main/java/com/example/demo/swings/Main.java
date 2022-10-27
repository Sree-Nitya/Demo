package com.example.demo.swings;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    public static void main(String[] args) {
        new Main().display();
    }

    private void display(){
        setSize(new Dimension(400, 300));
        setVisible(true);
    }
}
