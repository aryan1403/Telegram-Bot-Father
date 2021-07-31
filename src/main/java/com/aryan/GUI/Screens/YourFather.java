package com.aryan.GUI.Screens;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

/*
 * By (https://t.me/)
 * Sorry, for the files name xD
*/
public class YourFather extends JPanel {
    JFrame frame;

    private final int FRAME_WIDTH = 800;
    private final int FRAME_HEIGHT = 600;

    //private final Image loginImage = new ImageIcon("src/main/java/com/aryan/GUI/res/loginpage.jpg").getImage().getScaledInstance(530, 550, Image.SCALE_SMOOTH);


    // Initialize all the components
    public void __init__(){
        frame = new JFrame();
        
    }

    public void setFatherScreen(){   
        // Frame Attributes
        this.setBounds(0, 15, FRAME_WIDTH, FRAME_HEIGHT);
        this.setBackground(Color.white);
        this.setLayout(null);
    }

    // Paint/Draw Image & String to the panel
    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }
    
    // Constructor
    public YourFather(){
        __init__();
        setFatherScreen();

        frame.setDefaultCloseOperation(3);
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setLocationRelativeTo(null);
        
        frame.add(this);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setBackground(Color.white);
    }
}
