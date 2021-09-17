package md.usm.lab1.dog;

import javax.swing.*;
import java.awt.Graphics;

public class Doggy extends JFrame {
    private static final JLabel welcomeText = new JLabel("Gaw, I'm A Dog");
    private Graphics pencil;
    private JFrame mainFrame = new JFrame("Made By Miko");

    public Doggy() {
        init();
    }

    public void init(){

        mainFrame.setSize(1280,720);
//        mainFrame.setBackground(Color.DARK_GRAY);
        mainFrame.add(welcomeText);
        mainFrame.add(new DogApplet());
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
