// By Aaryan(https://t.me/)
package com.aryan.GUI.Screens;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

public class LoginScreen extends JPanel {
    /*
     * Login Screen
     * Input :- (Bot Token)
    */

    JFrame frame;

    private final int FRAME_WIDTH = 800;
    private final int FRAME_HEIGHT = 600;

    private final Image loginImage = new ImageIcon("src/main/java/com/aryan/GUI/res/loginpage.jpg").getImage().getScaledInstance(530, 550, Image.SCALE_SMOOTH);

    JTextField herokuApiKeyField = new JTextField();

    JButton loginButton = new JButton();

    // Initialize all the components
    public void __init__(){
        frame = new JFrame();
        
    }

    public void setLoginScreen(){   
        herokuApiKeyField.setBounds(FRAME_WIDTH/3, FRAME_HEIGHT/2 - FRAME_HEIGHT/5, FRAME_WIDTH - (FRAME_WIDTH/2 - FRAME_WIDTH/8) - 80, 30);
        herokuApiKeyField.setBackground(Color.white);
        herokuApiKeyField.setFont(new Font("Aerial", Font.PLAIN, 18));
        herokuApiKeyField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.black));

        loginButton.setBounds(FRAME_WIDTH/2 + FRAME_WIDTH/5, FRAME_HEIGHT - FRAME_HEIGHT/4, 100, 50);
        loginButton.setText("Login");
        loginButton.setOpaque(false);
        loginButton.setContentAreaFilled(false);
        loginButton.setBorderPainted(false);

        this.setBounds(0, 15, FRAME_WIDTH, FRAME_HEIGHT);
        this.setBackground(Color.white);
        this.setLayout(null);
        this.add(herokuApiKeyField);
        this.add(loginButton);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(loginImage, 0, 0, this);


        g.setFont(new Font("MV Boli", Font.BOLD+ Font.ITALIC, 35));
        g.drawString("Login Page", FRAME_WIDTH/2 - FRAME_WIDTH/12 - g.getFont().getSize(), FRAME_HEIGHT/2 - FRAME_HEIGHT/3 - g.getFont().getSize());
        
        g.setFont(new Font("Aerial", Font.ITALIC, 22));
        g.drawString("Heroku API Key :- ", 50, FRAME_HEIGHT/2 - FRAME_HEIGHT/5 + 20);
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
        frame.setBackground(Color.white);
    }
    
}
