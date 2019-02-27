package GraphicsUnitOne;

//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class SmileyFace extends Canvas
{
   public SmileyFace()    //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
      
    getContentPane().add(new SmileyFace());  
   }

   public void paint( Graphics window ) //draws what im working on inside the canvas
   {
      smileyFace(window);
   }

   public void smileyFace( Graphics window )
   {
      window.setColor(Color.WHITE);
      window.drawString("SMILEY FACE LAB ", 35, 35);
      
     // window.setColor(Color.YELLOW); if i don't set the color then it the rest of the other colors are white
      window.fillOval( 210, 100, 400, 400 );

		//add more code here


   }

}