package view;

import javax.swing.*;
import java.awt.*;

public class CommunityDashboard  {
    private JFrame jFrame = new JFrame();

    private JPanel panelNorth;

    private ImageIcon userIcon;
    private JLabel username;
    private JSeparator topSeparator;
    private JLabel exemplarsLabelNorth;

    public CommunityDashboard(String title){

        init(title);

    }

    private void init(String title){

        topSeparator = new JSeparator();
        topSeparator.setForeground(Color.black);

        userIcon = new ImageIcon("C:\\Users\\sallm\\Pictures\\EMT\\User-blue-icon (1).png");
        username = new JLabel();
        username.setText("Salli");
        username.setIcon(userIcon);

        exemplarsLabelNorth = new JLabel("Exemplars");

        // Panel North
        panelNorth = new JPanel();
        panelNorth.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 13)); // FlowLayout orders components (from left to right)
        panelNorth.setBackground(Color.LIGHT_GRAY);
        panelNorth.setVisible(true);

        panelNorth.setPreferredSize(new Dimension(50, 50));

        panelNorth.add(Box.createHorizontalStrut(50));
        panelNorth.add(username);
        panelNorth.add(Box.createHorizontalStrut(50));
        panelNorth.add(exemplarsLabelNorth);

        //JFrame
        jFrame.setTitle(title);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(800, 500);
        jFrame.setLocation(500, 150);
        jFrame.setVisible(true);
        jFrame.setLayout(new BorderLayout());

        jFrame.add(topSeparator);
        jFrame.add(panelNorth, BorderLayout.NORTH);
    }
}
