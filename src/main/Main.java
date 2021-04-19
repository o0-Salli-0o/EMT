package main;

import controller.IDandPasswords;
import view.frame.MainFrame;

import javax.swing.*;
import java.awt.*;

public class Main {

    private static IDandPasswords idAndPasswords;

    public static void main(String[] args){

        idAndPasswords = new IDandPasswords();

        SwingUtilities.invokeLater(() -> new MainFrame("Exemplar Management Tool"));

        //MainFrame mainFrame = new MainFrame("Exemplar Management Tool");
    }
}
