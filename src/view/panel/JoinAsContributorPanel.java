package view.panel;

import view.frame.MainFrame;

import javax.swing.*;
import java.awt.*;

public class JoinAsContributorPanel extends RoundedPanel {

    private ImageIcon joinAsAContributorIcon;
    private JLabel joinAsAContributorLabel;
    private JLabel contributorDescription1;
    private JLabel contributorDescription2;
    private JLabel contributorDescriptionA;
    private JLabel contributorDescriptionB;
    private JButton joinAsAContributorButton;

    public JoinAsContributorPanel(MainFrame mainFrame, HomepagePanelCenter homepagePanelCenter){
        joinAsAContributorIcon = new ImageIcon("image/contributor.png");
        joinAsAContributorLabel = new JLabel();
        joinAsAContributorLabel.setIcon(joinAsAContributorIcon);
        joinAsAContributorLabel.setBounds(120,10,64,64);

        contributorDescription1 = new JLabel();
        contributorDescription1.setText("As a contributor you are able to");
        contributorDescription1.setFont(new Font("Arial", Font.BOLD, 15));
        contributorDescription1.setBackground(new Color(215,134,52));
        contributorDescription1.setOpaque(true);
        contributorDescription1.setVerticalAlignment(JLabel.CENTER);
        contributorDescription1.setHorizontalAlignment(JLabel.CENTER);
        contributorDescription1.setBounds(2,115, 300,20);

        contributorDescription2 = new JLabel();
        contributorDescription2.setText("create exemplars.");
        contributorDescription2.setFont(new Font("Arial", Font.BOLD, 15));
        contributorDescription2.setBackground(new Color(215,134,52));
        contributorDescription2.setOpaque(true);
        contributorDescription2.setVerticalAlignment(JLabel.CENTER);
        contributorDescription2.setHorizontalAlignment(JLabel.CENTER);
        contributorDescription2.setBounds(2,135, 300,20);

        contributorDescriptionA = new JLabel();
        contributorDescriptionA.setText("Sign up as a contribuotor and enjoy");
        contributorDescriptionA.setFont(new Font("Arial", Font.LAYOUT_LEFT_TO_RIGHT, 15));
        contributorDescriptionA.setBackground(new Color(215,134,52));
        contributorDescriptionA.setOpaque(true);
        contributorDescriptionA.setVerticalAlignment(JLabel.CENTER);
        contributorDescriptionA.setHorizontalAlignment(JLabel.CENTER);
        contributorDescriptionA.setBounds(2,195, 300,20);

        contributorDescriptionB = new JLabel();
        contributorDescriptionB.setText("full access. ");
        contributorDescriptionB.setFont(new Font("Arial", Font.LAYOUT_LEFT_TO_RIGHT, 15));
        contributorDescriptionB.setBackground(new Color(215,134,52));
        contributorDescriptionB.setOpaque(true);
        contributorDescriptionB.setVerticalAlignment(JLabel.CENTER);
        contributorDescriptionB.setHorizontalAlignment(JLabel.CENTER);
        contributorDescriptionB.setBounds(2,215, 300,20);

        joinAsAContributorButton = new JButton("Join as a Contributor");
        joinAsAContributorButton.setBackground(new Color(215,134,52));
        joinAsAContributorButton.setVerticalAlignment(JButton.CENTER);
        joinAsAContributorButton.setHorizontalAlignment(JButton.CENTER);
        joinAsAContributorButton.setBounds(80, 285, 150, 50);
        joinAsAContributorButton.setBorder(BorderFactory.createLineBorder(Color.black, 2));

        //joinAsAContributorPanel = new RoundedPanel();
        this.setLayout(null);
        this.setPreferredSize(new Dimension(320, 450));
        this.setBackground(new Color(215,134,52));
        this.setVisible(true);

        this.add(joinAsAContributorLabel);
        this.add(contributorDescription1);
        this.add(contributorDescription2);
        this.add(contributorDescriptionA);
        this.add(contributorDescriptionB);
        this.add(joinAsAContributorButton);
    }
}
