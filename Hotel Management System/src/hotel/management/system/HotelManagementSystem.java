package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HotelManagementSystem extends JFrame implements ActionListener {
    
    HotelManagementSystem(){
        //setSize(1366,565);
        // setLocation(100,100);  
        
        setBounds(0,0,1550,1000);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Saved Pictures/First.png"));
        Image i2 = i1.getImage().getScaledInstance(1550,1000,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel (i3);
        image.setBounds(0,0,1366,750);//locationx,locationy,length,breadth
        add(image);
        
        JLabel text = new JLabel ("HOTEL MANAGEMENT SYSTEM");
        text.setBounds(20,570,1000,90);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("serif",Font.PLAIN,50));
        image.add(text);
        
        JButton next = new JButton("Next");
        next.setBounds(1150,600,150,50);
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.addActionListener(this);
        next.setFont(new Font("serif",Font.PLAIN,24));
        image.add(next);
        
        
        
        setVisible(true);
        
        while(true){
            text.setVisible(false);
            try{
                Thread.sleep(500);
            }catch (Exception e){
               e.printStackTrace();
            }
            text.setVisible(true);
            try{
                Thread.sleep(500);
            }catch (Exception e){
               e.printStackTrace();
            }
        }
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        setVisible(false);
        new Login();
    }

    public static void main(String[] args) {
       new HotelManagementSystem();
    }
    
}
