package view.panel;

import view.frame.MainFrame;

import javax.swing.*;
import java.awt.*;

public class StartPanelEast extends JPanel {

    public StartPanelEast(MainFrame mainFrame){
        super();

        //panelEast = new JPanel();
        this.setLayout(new FlowLayout(FlowLayout.CENTER));
        this.setBackground(Color.WHITE);
        this.setPreferredSize(new Dimension(0, 0));
        this.setVisible(true);
    }
}
