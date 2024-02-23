package LABELMETHOD2;

import java.awt.Color;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.border.Border;

@SuppressWarnings("serial") //TO GET AWAY FROM WANMING WE DID CLIK ON THE ADD SUPRESSION 
public class MyLabel extends JLabel{

	// JLabel = a GUI display area for a string of text, an image, or both
	
	
	MyLabel(){
			ImageIcon image = new ImageIcon("dude.png");
			
			@SuppressWarnings("unused")
			Border border = BorderFactory.createLineBorder(Color.green,3);// THE WARNING WAS ON BORDER WE CREATED IT WITHOUT USING
			
			@SuppressWarnings("unused")
			JLabel label = new JLabel(); //create a label // THE WARNING WAS ON LABEL
			
			this.setText("HELLO WORLD"); //set text of this
			this.setIcon(image);
			this.setHorizontalTextPosition(JLabel.CENTER); //set text LEFT,CENTER, RIGHT of imageicon
			this.setVerticalTextPosition(JLabel.TOP); //set text TOP,CENTER, BOTTOM of imageicon
			this.setForeground(new Color(0x00FF00)); //set font color of text
			this.setFont(new Font("MV Boli",Font.PLAIN,100)); //set font of text
			this.setIconTextGap(-25); //set gap of text to image
			this.setBackground(Color.black); //set background color
			this.setOpaque(true); //display background color
			//this.setBorder(border); //sets border of this (not image+text)
			this.setVerticalAlignment(JLabel.CENTER); //set vertical position of icon+text within this
			this.setHorizontalAlignment(JLabel.CENTER); //set horizontal position of icon+text within this
			//this.setBounds(100, 100, 250, 250); //set x,y position within frame as well as dimensions	
	
}
	@Override
	public String getText() { //dans ce cas nous avons pris l'ancien text et le remplacer avec le nouveau return
		return "hello";
		
	}
}
