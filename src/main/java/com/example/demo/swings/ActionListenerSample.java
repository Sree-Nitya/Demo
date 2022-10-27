package com.example.demo.swings;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListenerSample extends JFrame implements ActionListener {

    JTextField textField;

    public static void main(String[] args) {
        new ActionListenerSample().display();
    }

    private void display(){
        setSize(new Dimension(400, 300));

        Container container = getContentPane();
        JButton showButton = new JButton("Show");
        showButton.setBounds(44, 40, 90, 21);
        showButton.addActionListener(this);

        JButton clearButton = new JButton("Clear");
        clearButton.setBounds(44, 61, 90, 21);
        clearButton.addActionListener(this);

        textField = new JTextField();
        textField.setBounds(150, 40, 200, 21);

        container.add(showButton);
        container.add(clearButton);
        container.add(textField);

        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        // e.getActionCommand() returns the text of the object
        if(e.getActionCommand().equals("Clear"))
            textField.setText("");
        else
            textField.setText("Have a nice day");
    }
}
