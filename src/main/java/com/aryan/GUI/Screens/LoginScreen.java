// By Aaryan(https://t.me/)
package com.aryan.GUI.Screens;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

public class LoginScreen extends JPanel {
    /*
     * Login Screen
     * Input :- (Bot Token)
    */

    JFrame frame;

    private final int FRAME_WIDTH = 800;
    private final int FRAME_HEIGHT = 600;

    private final Image loginImage = new ImageIcon("src/main/java/com/aryan/GUI/res/loginpage.jpg").getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);

    // Initialize all the components
    public void __init__(){
        frame = new JFrame();
        
    }

    public void setLoginScreen(){   
        this.setBounds(0, 30, FRAME_WIDTH, FRAME_HEIGHT);
        this.setBackground(Color.white);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(loginImage, 0, 0, this);
        
    }
    
    public LoginScreen(){
        __init__();
        setLoginScreen();

        frame.setDefaultCloseOperation(3);
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setLocationRelativeTo(null);
        
        frame.add(this);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    
}
