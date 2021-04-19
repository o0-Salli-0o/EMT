package view.panel;

import view.frame.MainFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartPanelNorth extends JPanel {

    private LoginPanel loginPanel;
    private SignUpPanel signUpPanel;
    private JButton registerButton;
    private JButton loginButton;

    public StartPanelNorth(MainFrame mainFrame){

        loginButton = new JButton("Log in");
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainFrame.getCardLayout().show(mainFrame.getPanelCenter(), "loginPanel");
            }
        });

        registerButton = new JButton(("Sign up"));
        registerButton.setForeground(Color.WHITE);
        registerButton.setBackground(Color.BLUE);
        registerButton.setBounds(10,10,100,25);
        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainFrame.getCardLayout().show(mainFrame.getPanelCenter(), "signUpPanel");
            }
        });

        //panelNorth = new JPanel();
        this.setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 13)); // FlowLayout orders components (from right to left)
        this.setBackground(Color.LIGHT_GRAY);
        this.setVisible(true);

        this.setPreferredSize(new Dimension(50, 50));

        this.add(loginButton);
        this.add(registerButton);
        this.add(Box.createHorizontalStrut(50));
    }

}
