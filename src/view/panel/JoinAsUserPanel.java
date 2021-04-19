package view.panel;

import view.frame.MainFrame;

import javax.swing.*;
import java.awt.*;

public class JoinAsUserPanel extends RoundedPanel {

    //private JPanel joinAsAUserPanel;
    private ImageIcon joinAsAUserIcon;
    private JLabel joinAsAUserLabel;
    private JLabel userDescription1;
    private JLabel userDescription2;
    private JLabel userDescriptionA;
    private JLabel userDescriptionB;
    private JLabel userDescriptionC;
    private JButton joinAsAUserButton;

    public JoinAsUserPanel(MainFrame mainFrame, HomepagePanelCenter homepagePanelCenter){

        joinAsAUserIcon = new ImageIcon("image/addUser.png");
        joinAsAUserLabel = new JLabel();
        joinAsAUserLabel.setIcon(joinAsAUserIcon);
        joinAsAUserLabel.setBounds(120,10,64,64);

        userDescription1 = new JLabel();
        userDescription1.setText("As a user you are able to");
        userDescription1.setFont(new Font("Arial", Font.BOLD, 15));
        userDescription1.setBackground(new Color(153,102,0));
        userDescription1.setOpaque(true);
        userDescription1.setVerticalAlignment(JLabel.CENTER);
        userDescription1.setHorizontalAlignment(JLabel.CENTER);
        userDescription1.setBounds(2,115, 300,20);

        userDescription2 = new JLabel();
        userDescription2.setText("search for solutions to exemplars");
        userDescription2.setFont(new Font("Arial", Font.BOLD, 15));
        userDescription2.setBackground(new Color(153,102,0));
        userDescription2.setOpaque(true);
        userDescription2.setVerticalAlignment(JLabel.CENTER);
        userDescription2.setHorizontalAlignment(JLabel.CENTER);
        userDescription2.setBounds(2,135, 300,20);

        userDescriptionA = new JLabel();
        userDescriptionA.setText("To create exemplars you need a");
        userDescriptionA.setFont(new Font("Arial", Font.LAYOUT_LEFT_TO_RIGHT, 15));
        userDescriptionA.setBackground(new Color(153,102,0));
        userDescriptionA.setOpaque(true);
        userDescriptionA.setVerticalAlignment(JLabel.CENTER);
        userDescriptionA.setHorizontalAlignment(JLabel.CENTER);
        userDescriptionA.setBounds(2,195, 300,20);

        userDescriptionB = new JLabel();
        userDescriptionB.setText("contributor profile. Upgrade possible");
        userDescriptionB.setFont(new Font("Arial", Font.LAYOUT_LEFT_TO_RIGHT, 15));
        userDescriptionB.setBackground(new Color(153,102,0));
        userDescriptionB.setOpaque(true);
        userDescriptionB.setVerticalAlignment(JLabel.CENTER);
        userDescriptionB.setHorizontalAlignment(JLabel.CENTER);
        userDescriptionB.setBounds(2,215, 300,20);

        userDescriptionC = new JLabel();
        userDescriptionC.setText("at any time");
        userDescriptionC.setFont(new Font("Arial", Font.LAYOUT_LEFT_TO_RIGHT, 15));
        userDescriptionC.setBackground(new Color(153,102,0));
        userDescriptionC.setOpaque(true);
        userDescriptionC.setVerticalAlignment(JLabel.CENTER);
        userDescriptionC.setHorizontalAlignment(JLabel.CENTER);
        userDescriptionC.setBounds(2,235, 300,20);

        joinAsAUserButton = new JButton("Join as a user");
        joinAsAUserButton.setBackground(new Color(153,102,0));
        joinAsAUserButton.setVerticalAlignment(JButton.CENTER);
        joinAsAUserButton.setHorizontalAlignment(JButton.CENTER);
        joinAsAUserButton.setBounds(80, 285, 150, 50);
        joinAsAUserButton.setBorder(BorderFactory.createLineBorder(Color.black, 2));

        //joinAsAUserPanel = new RoundedPanel();
        this.setLayout(null);
        this.setPreferredSize(new Dimension(320, 450));
        this.setBackground(new Color(153,102,0));
        this.setVisible(true);

        this.add(joinAsAUserLabel);
        this.add(userDescription1);
        this.add(userDescription2);
        this.add(userDescriptionA);
        this.add(userDescriptionB);
        this.add(userDescriptionC);
        this.add(joinAsAUserButton);
    }
}
