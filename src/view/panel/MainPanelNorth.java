package view.panel;

import view.frame.MainFrame;

import javax.swing.*;
import java.awt.*;

public class MainPanelNorth extends JPanel {

    private ImageIcon userIcon;
    private JLabel username;
    private JLabel exemplarsLabelNorth;

    public MainPanelNorth(MainFrame mainFrame){

        userIcon = new ImageIcon("image/User-blue-icon (1).png");
        username = new JLabel();
        username.setText("Salli");
        username.setIcon(userIcon);

        exemplarsLabelNorth = new JLabel("Exemplars");

        this.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 13)); // FlowLayout orders components (from left to right)
        this.setBackground(Color.LIGHT_GRAY);
        this.setVisible(true);

        this.setPreferredSize(new Dimension(50, 50));

        this.add(Box.createHorizontalStrut(50));
        this.add(username);
        this.add(Box.createHorizontalStrut(50));
        this.add(exemplarsLabelNorth);

        mainFrame.add(this, BorderLayout.NORTH);
    }
}
