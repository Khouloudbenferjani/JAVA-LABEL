package LABELMETHOD2;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;


@SuppressWarnings("serial")
public class MyFrame extends JFrame { // supress warn was related to class myframe


	MyLabel l = new MyLabel();
    // JFrame = a GUI window to add components to 

    MyFrame(){
    this.setVisible(true); //make this visible 
    this.setTitle("THIS IS MY FRAME"); //sets title of this = true means show the frame the opposit is created but we can see it 
    
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit from application 
    this.setResizable(true); //prevent this from being resized = the run the button in the middle
    this.setSize(420,420); //sets the x-dimension, and y-dimension of the frame in running  
    
    ImageIcon image = new ImageIcon("sky.jpg"); //create an ImageIcon 
    this.setIconImage(image.getImage()); //SHOW THE ICON
    
    this.getContentPane().setBackground(new Color(0x90EE90)); //change color WITH ITS CSS of background 
    //frame.getContentPane().setBackground(Color.blue); //change STANDARD color of background
    this.add(l);
   
 }}