package formen;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    private JPanel mainPanel;
    private JPanel formenPanel;

    public MainWindow() throws HeadlessException {
        setTitle("Formen");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(mainPanel);
        setSize(800, 200);
    }

    public static void main(String[] args) {
        MainWindow m = new MainWindow();
        m.setVisible(true);
    }

    private void createUIComponents() {
        formenPanel = new FormenPanel();
    }
}
