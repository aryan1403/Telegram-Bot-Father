// By Aaryan(https://t.me/)
package com.aryan.GUI.Screens;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;

public class LoginScreen extends JPanel {
    /*
     * Login Screen
     * Input :- (Bot Token)
    */

    JFrame frame;

    private final int FRAME_WIDTH = 800;
    private final int FRAME_HEIGHT = 600;

    // Initialize all the components
    public void __init__(){
        frame = new JFrame();
        
    }

    public void setLoginScreen(){
        this.setBounds(0, 0, FRAME_WIDTH, FRAME_HEIGHT);
        this.setBackground(Color.black);
        this.setLayout(null);
    }
    
    public LoginScreen(){
        __init__();
        setLoginScreen();

        frame.setDefaultCloseOperation(3);
        frame.setLocationRelativeTo(null);
        frame.add(this);
        frame.pack();
        frame.setVisible(true);
    }
    
}
