package cz.uhk.fim.rssreader.gui;

import javax.swing.*;

public class MainFrame extends JFrame {
        public MainFrame(){
            init();
        }
        public void init(){
            setVisible(true);
            setTitle("RSSreader");
            setSize(800, 600);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setLocationRelativeTo(null);
        }
}
