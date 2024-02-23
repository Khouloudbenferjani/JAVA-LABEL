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
  		
		// THE IMAGE ALWAYS BEFORE THE TEXT
			ImageIcon image = new ImageIcon("sky.jpg");// CREATE the image 
			this.setIcon(image);// show the image
			
			
			Border border = BorderFactory.createLineBorder(Color.green,3);//LE CONTOUR
			this.setBorder(border); //sets border of this (not image+text)= show the border
			
			@SuppressWarnings("unused")
			JLabel label = new JLabel(); //create a label // THE WARNING WAS ON LABEL
			this.setText("HELLO WORLD"); //set text of this
			
		
			this.setHorizontalTextPosition(JLabel.LEFT); //set text LEFT,CENTER, RIGHT of imageicon FOR THE CENTER UBER DIE BILD
			this.setVerticalTextPosition(JLabel.TOP); //set text TOP,CENTER, BOTTOM of image icon
			this.setForeground(new Color(0x4b0082)); //set font color of text 
			this.setFont(new Font("MV Boli",Font.PLAIN,100)); //set font=STYLE of text 
			this.setIconTextGap(+100); //set gap of text to image = the distance 
			
			//in the function below is like we gonna change the color of the frame if not set =setOpaque=false
			this.setBackground(Color.black); //set background color 
			this.setOpaque(false); //display background color
			
			//THE POSITION OF BOTH IMAGE AND TEXT
			this.setVerticalAlignment(JLabel.BOTTOM); //set vertical position of icon+text within this (TOP,CENTER, BOTTOM)
			this.setHorizontalAlignment(JLabel.RIGHT); //set horizontal position of icon+text within this
			
			//?????????????????????????????????????
			this.setBounds(100, 100, 250, 250); //set x,y position within frame as well as dimensions	
	
}
	@Override
	public String getText() { //dans ce cas nous avons pris l'ancien text et le remplacer avec le nouveau return
		return "hello";
		
	}
}
