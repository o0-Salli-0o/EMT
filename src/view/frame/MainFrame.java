package view.frame;

import main.Main;
import view.panel.*;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private StartPanelNorth panelNorth;

    private JPanel panelCenter = new JPanel();
    private HomepagePanelCenter homepagePanelCenter;
    private LoginPanel loginPanel = new LoginPanel();
    private SignUpPanel signUpPanel = new SignUpPanel();

    private JPanel panelWest;
    private JPanel panelEast;
    private JPanel panelSouth;

    private CardLayout cardLayout = new CardLayout();

    public MainFrame(String title) {

        panelNorth = new StartPanelNorth(this);

        panelEast = new StartPanelEast(this);

        panelWest = new StartPanelWest(this);

        homepagePanelCenter = new HomepagePanelCenter(this);
        panelCenter.setLayout(cardLayout);
        panelCenter.add(homepagePanelCenter, "homepagePanel");
        panelCenter.add(loginPanel, "loginPanel");
        panelCenter.add(signUpPanel, "signUpPanel");

        panelSouth = new StartPanelSouth(this);

        this.setTitle(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1500, 700);
        this.setLocation(20, 80);
        this.setLayout(new BorderLayout(50, 50));
        this.setVisible(true);

        this.add(panelNorth, BorderLayout.NORTH);
        this.add(panelEast, BorderLayout.EAST);
        this.add(panelCenter, BorderLayout.CENTER);
        this.add(panelWest, BorderLayout.WEST);
        this.add(panelSouth, BorderLayout.SOUTH);

        //jFrame.validate();
    }

    public CardLayout getCardLayout(){
        return cardLayout;
    }

    public LoginPanel getLoginPanel(){
        return loginPanel;
    }

    public SignUpPanel getSignUpPanel(){
        return signUpPanel;
    }

    public JPanel getPanelNorth(){
        return panelNorth;
    }

    public JPanel getPanelCenter(){
        return panelCenter;
    }

    public JPanel getPanelWest(){
        return panelWest;
    }

    public JPanel getPanelEast(){
        return panelEast;
    }

    public JPanel getPanelSouth(){
        return panelSouth;
    }
}
