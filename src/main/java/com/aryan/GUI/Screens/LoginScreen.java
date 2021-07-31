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
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginScreen extends JPanel implements ActionListener {
    /*
     * Login Screen
     * Input :- (Bot Token)
    */

    JFrame frame;

    private final int FRAME_WIDTH = 800;
    private final int FRAME_HEIGHT = 600;

    private final Image loginImage = new ImageIcon("src/main/java/com/aryan/GUI/res/loginpage.jpg").getImage().getScaledInstance(530, 550, Image.SCALE_SMOOTH);

    JTextField botTokenField = new JTextField();

    JButton loginButton = new JButton();

    // Initialize all the components
    public void __init__(){
        frame = new JFrame();
        
    }

    public void setLoginScreen(){   
        // Bot token TextField Attributes
        botTokenField.setBounds(FRAME_WIDTH/3, FRAME_HEIGHT/2 - FRAME_HEIGHT/5, FRAME_WIDTH - (FRAME_WIDTH/2 - FRAME_WIDTH/8) - 80, 30);
        botTokenField.setBackground(Color.white);
        botTokenField.setFont(new Font("Aerial", Font.PLAIN, 18));
        botTokenField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.black));

        // LoginButton Attributes
        loginButton.setBounds(FRAME_WIDTH/2 + FRAME_WIDTH/4 + 10, FRAME_HEIGHT - FRAME_HEIGHT/4, 100, 50);
        loginButton.setText("Login");
        loginButton.setForeground(Color.red);
        loginButton.setFont(new Font("Comic Sans", Font.BOLD, 22));
        loginButton.setBorder(BorderFactory.createMatteBorder(3, 0, 0, 2, Color.black));
        loginButton.setOpaque(false);
        loginButton.setContentAreaFilled(false);

        // Frame Attributes
        this.setBounds(0, 15, FRAME_WIDTH, FRAME_HEIGHT);
        this.setBackground(Color.white);
        this.setLayout(null);
        this.add(botTokenField);
        this.add(loginButton);
    }

    // Paint/Draw Image & String to the panel
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(loginImage, 0, 0, this);


        g.setFont(new Font("MV Boli", Font.BOLD+ Font.ITALIC, 35));
        g.drawString("Login Page", FRAME_WIDTH/2 - FRAME_WIDTH/12 - g.getFont().getSize(), FRAME_HEIGHT/2 - FRAME_HEIGHT/3 - g.getFont().getSize());
        
        g.setFont(new Font("Aerial", Font.ITALIC + Font.BOLD, 25));
        g.drawString("Bot Token ", 100, FRAME_HEIGHT/2 - FRAME_HEIGHT/5 + 20);
    }
    
    // Constructor
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

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == loginButton){
            
        }
        
    }
    
}
