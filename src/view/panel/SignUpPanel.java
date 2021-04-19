package view.panel;

import view.frame.MainFrame;

import javax.swing.*;
import java.awt.*;

public class SignUpPanel extends RoundedPanel {

    private JPanel backgroundPanel = new RoundedPanel();

    private JButton loginButton = new JButton("User");
    private JButton resetButton = new JButton("Contributor");
    private JTextField userIDField = new JTextField();
    private JPasswordField userPasswordField = new JPasswordField();
    private JLabel userIDLabel = new JLabel("UserID:");
    private JLabel userPasswordLabel = new JLabel("Password:");
    private JLabel signUpLabel = new JLabel("Sign up as:");

    public SignUpPanel(){

        this.setLayout(new FlowLayout(FlowLayout.CENTER, 0,150));
        this.setBackground(Color.DARK_GRAY);
        this.setVisible(true);

        userIDLabel.setBounds(80, 80, 75,25);
        userPasswordLabel.setBounds(80,130,75,25);
        signUpLabel.setBounds(80, 180, 75,25);

        userIDField.setBounds(155,80,250,25);
        userPasswordField.setBounds(155,130,250,25);

        loginButton.setBounds(155, 180, 120,25);
        resetButton.setBounds(285, 180, 120,25);

        backgroundPanel.setLayout(null);
        backgroundPanel.setBackground(Color.LIGHT_GRAY);
        backgroundPanel.setPreferredSize(new Dimension(500,300));
        backgroundPanel.setVisible(true);

        backgroundPanel.add(userIDLabel);
        backgroundPanel.add(userPasswordLabel);
        backgroundPanel.add(signUpLabel);
        backgroundPanel.add(userIDField);
        backgroundPanel.add(userPasswordField);
        backgroundPanel.add(loginButton);
        backgroundPanel.add(resetButton);

        this.add(backgroundPanel);
    }
}