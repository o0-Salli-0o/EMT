package view.panel;

import main.Main;
import view.frame.MainFrame;

import javax.swing.*;
import java.awt.*;

public class LoginPanel extends RoundedPanel {

    private JPanel backgroundPanel = new RoundedPanel();
    //private JPanel flowPanel = new JPanel();

    private JButton loginButton = new JButton("Login");
    private JButton resetButton = new JButton("Reset");
    private JTextField userIDField = new JTextField();
    private JPasswordField userPasswordField = new JPasswordField();
    private JLabel userIDLabel = new JLabel("UserID:");
    private JLabel userPasswordLabel = new JLabel("Password:");

    public LoginPanel(){

        this.setLayout(new FlowLayout(FlowLayout.CENTER, 0,150));
        this.setBackground(Color.DARK_GRAY);
        this.setVisible(true);

        userIDLabel.setBounds(100, 80, 75,25);
        userPasswordLabel.setBounds(100,130,75,25);

        userIDField.setBounds(175,80,210,25);
        userPasswordField.setBounds(175,130,210,25);

        loginButton.setBounds(175, 180, 100,25);
        resetButton.setBounds(285, 180, 100,25);

        backgroundPanel.setLayout(null);
        backgroundPanel.setBackground(Color.LIGHT_GRAY);
        backgroundPanel.setPreferredSize(new Dimension(500,300));
        backgroundPanel.setVisible(true);

        backgroundPanel.add(userIDLabel);
        backgroundPanel.add(userPasswordLabel);
        backgroundPanel.add(userIDField);
        backgroundPanel.add(userPasswordField);
        backgroundPanel.add(loginButton);
        backgroundPanel.add(resetButton);

        this.add(backgroundPanel);
    }
}
