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
    this.setTitle("Jthis title goes here"); //sets title of this 
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit from application 
    this.setResizable(true); //prevent this from being resized 
    this.setSize(420,420); //sets the x-dimension, and y-dimension of this 
    ImageIcon image = new ImageIcon("logo.png"); //create an ImageIcon 
    this.setIconImage(image.getImage()); //change icon of this
    this.getContentPane().setBackground(new Color(0x123456)); //change color WITH ITS CSS of background 
    //frame.getContentPane().setBackground(Color.blue); //change STANDARD color of background
    this.add(l);
   
 }}