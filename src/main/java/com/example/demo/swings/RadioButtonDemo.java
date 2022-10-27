package com.example.demo.swings;

import javax.swing.*;
import java.awt.*;

public class RadioButtonDemo extends JFrame {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                RadioButtonDemo inst = new RadioButtonDemo();
                inst.setLocationRelativeTo(null);
                inst.setVisible(true);
                inst.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            }
        });
    }

    public RadioButtonDemo() {
        super("Radio Button Demo");
        JRadioButton option1 = new JRadioButton("Linux");
        JRadioButton option2 = new JRadioButton("Windows");
        JRadioButton option3 = new JRadioButton("Macintosh");

        ButtonGroup group = new ButtonGroup();
        group.add(option1);
        group.add(option2);
        group.add(option3);

        setLayout(new FlowLayout());

        add(option1);
        add(option2);
        add(option3);

        pack();
    }

}

