package com.example.demo.swings;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExamQuestion1 extends JFrame implements ActionListener {
    public static void main(String[] args) {
        new ExamQuestion1().display();
    }
    JTextArea textArea;
    JLabel wordsLabel, charactersLabel;
    private void display(){
        setSize(new Dimension(400, 300));
        setLayout(new FlowLayout());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Container container = getContentPane();

        wordsLabel = new JLabel();
        charactersLabel = new JLabel();

        textArea = new JTextArea();
        textArea.setBackground(Color.red);
        textArea.setText("Hello Nitya");

        JButton button = new JButton("Click me");
        button.addActionListener(this::actionPerformed);

        container.add(textArea);
        container.add(button);
        container.add(wordsLabel);
        container.add(charactersLabel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String text = textArea.getText();
        String[] wordsArray = text.split("\\s");
        int words = wordsArray.length;
        int characters = text.length();

        wordsLabel.setText("Words: " + words);
        charactersLabel.setText("Characters: " + characters);
    }
}
