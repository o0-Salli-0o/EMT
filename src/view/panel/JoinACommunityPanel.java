package view.panel;

import view.frame.MainFrame;

import javax.swing.*;
import java.awt.*;

public class JoinACommunityPanel extends RoundedPanel {

    private ImageIcon joinACommunityIcon;
    private JLabel joinACommunityLabel;
    private JLabel communityDescription1;
    private JLabel communityDescription2;
    private JLabel communityDescription3;
    private JLabel communityDescriptionA;
    private JLabel communityDescriptionB;
    private JLabel communityDescriptionC;
    private JButton joinCommunityButton;

    public JoinACommunityPanel(MainFrame mainFrame, HomepagePanelCenter homepagePanelCenter){

        joinACommunityIcon = new ImageIcon("image/joinCommunity.png");
        joinACommunityLabel = new JLabel();
        joinACommunityLabel.setIcon(joinACommunityIcon);
        joinACommunityLabel.setBounds(120,10,64,64);

        communityDescription1 = new JLabel();
        communityDescription1.setText("A public platform building the");
        communityDescription1.setFont(new Font("Arial", Font.BOLD, 15));
        communityDescription1.setBackground(new Color(51,204,255));
        communityDescription1.setOpaque(true);
        communityDescription1.setVerticalAlignment(JLabel.CENTER);
        communityDescription1.setHorizontalAlignment(JLabel.CENTER);
        communityDescription1.setBounds(2,115, 300,20);

        communityDescription2 = new JLabel();
        communityDescription2.setText("definitve collection of exemplar");
        communityDescription2.setFont(new Font("Arial", Font.BOLD, 15));
        communityDescription2.setBackground(new Color(51,204,255));
        communityDescription2.setOpaque(true);
        communityDescription2.setVerticalAlignment(JLabel.CENTER);
        communityDescription2.setHorizontalAlignment(JLabel.CENTER);
        communityDescription2.setBounds(2,135, 300,20);

        communityDescription3 = new JLabel();
        communityDescription3.setText("solutions.");
        communityDescription3.setFont(new Font("Arial", Font.BOLD, 15));
        communityDescription3.setBackground(new Color(51,204,255));
        communityDescription3.setOpaque(true);
        communityDescription3.setVerticalAlignment(JLabel.CENTER);
        communityDescription3.setHorizontalAlignment(JLabel.CENTER);
        communityDescription3.setBounds(2,155, 300,20);

        communityDescriptionA = new JLabel();
        communityDescriptionA.setText("A community-based space to find");
        communityDescriptionA.setFont(new Font("Arial", Font.LAYOUT_LEFT_TO_RIGHT, 15));
        communityDescriptionA.setBackground(new Color(51,204,255));
        communityDescriptionA.setOpaque(true);
        communityDescriptionA.setVerticalAlignment(JLabel.CENTER);
        communityDescriptionA.setHorizontalAlignment(JLabel.CENTER);
        communityDescriptionA.setBounds(2,195, 300,20);

        communityDescriptionB = new JLabel();
        communityDescriptionB.setText("and contribute solutions to");
        communityDescriptionB.setFont(new Font("Arial", Font.LAYOUT_LEFT_TO_RIGHT, 15));
        communityDescriptionB.setBackground(new Color(51,204,255));
        communityDescriptionB.setOpaque(true);
        communityDescriptionB.setVerticalAlignment(JLabel.CENTER);
        communityDescriptionB.setHorizontalAlignment(JLabel.CENTER);
        communityDescriptionB.setBounds(2,215, 300,20);

        communityDescriptionC = new JLabel();
        communityDescriptionC.setText("exemplars");
        communityDescriptionC.setFont(new Font("Arial", Font.LAYOUT_LEFT_TO_RIGHT, 15));
        communityDescriptionC.setBackground(new Color(51,204,255));
        communityDescriptionC.setOpaque(true);
        communityDescriptionC.setVerticalAlignment(JLabel.CENTER);
        communityDescriptionC.setHorizontalAlignment(JLabel.CENTER);
        communityDescriptionC.setBounds(2,235, 300,20);

        joinCommunityButton = new JButton("Join a Community");
        joinCommunityButton.setBackground(new Color(51,204,255));
        joinCommunityButton.setVerticalAlignment(JButton.CENTER);
        joinCommunityButton.setHorizontalAlignment(JButton.CENTER);
        joinCommunityButton.setBounds(80, 285, 150, 50);
        joinCommunityButton.setBorder(BorderFactory.createLineBorder(Color.black, 2));

        //joinACommunityPanel = new RoundedPanel();
        this.setLayout(null);
        this.setPreferredSize(new Dimension(320, 450));
        this.setBackground(new Color(51,204,255));
        this.setVisible(true);

        this.add(joinACommunityLabel);
        this.add(communityDescription1);
        this.add(communityDescription2);
        this.add(communityDescription3);
        this.add(communityDescriptionA);
        this.add(communityDescriptionB);
        this.add(communityDescriptionC);
        this.add(joinCommunityButton);
    }
}
