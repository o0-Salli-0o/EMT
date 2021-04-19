package view.panel;

import view.frame.MainFrame;

import javax.swing.*;
import java.awt.*;

public class HomepagePanelCenter extends RoundedPanel {
    //private JPanel panelCenter;

    private JPanel joinAsAUserPanel;
    private JPanel joinACommunityPanel;
    private JPanel joinAsAContributorPanel;

    public HomepagePanelCenter(MainFrame mainFrame){
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 80, 100));
        this.setBackground(Color.DARK_GRAY);
        this.setVisible(true);

        joinAsAUserPanel = new JoinAsUserPanel(mainFrame, this);
        joinACommunityPanel = new JoinACommunityPanel(mainFrame, this);
        joinAsAContributorPanel = new JoinAsContributorPanel(mainFrame, this);

        this.add(joinAsAUserPanel);
        this.add(joinACommunityPanel);
        this.add(joinAsAContributorPanel);
    }
}
