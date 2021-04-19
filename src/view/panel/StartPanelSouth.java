package view.panel;

import view.frame.MainFrame;

import javax.swing.*;
import java.awt.*;

public class StartPanelSouth extends JPanel {

    public StartPanelSouth(MainFrame mainFrame){
        this.setLayout(new FlowLayout(FlowLayout.CENTER));
        this.setBackground(Color.WHITE);
        this.setPreferredSize(new Dimension(0, 0));
        this.setVisible(true);
    }
}
