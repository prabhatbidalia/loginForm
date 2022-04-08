package com.javaprograms;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame("");
        JPanel panel = new JPanel();
        JLabel user = new JLabel("Username");
        JLabel password = new JLabel("Password");
        JTextField username_input = new JTextField();
        JPasswordField password_input = new JPasswordField();
        JButton login = new JButton("Login");
        frame.add(panel);
        panel.setLayout(null);
        frame.setSize(320,220);
        user.setBounds(20,30,80,20);
        password.setBounds(20,90,60,20);
        username_input.setBounds(100,30,170,20);
        password_input.setBounds(100,90,170,20);
        login.setBounds(105,140,80,30);
        panel.add(user);
        panel.add(password);
        panel.add(username_input);
        panel.add(password_input);
        panel.add(login);
        login.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userval = username_input.getText();
                String passval = password_input.getText();
                if(userval.equals("Prabhat") && passval.equals("prabhat2605")){
                    frame.setVisible(false);
                    frame.dispose();
                }else{
                    frame.setVisible(true);
                }
            }
        });
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
