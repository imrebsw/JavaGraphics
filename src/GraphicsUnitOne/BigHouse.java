package GraphicsUnitOne;
//remember to refactor

//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class BigHouse extends Canvas
{
   public BigHouse()  //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      //call bigHouse
   }

   public void bigHouse( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString( "BIG HOUSE ", 50, 50 );
/*
      window.setColor(Color.BLUE);

      window.fillRect( 200, 200, 400, 400 );
       protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g.create();
            int width = getWidth();
            int height = getHeight();
*/
            g2d.setColor(new Color(139, 69, 19));
            g2d.fillRect((width / 2) - 20, height / 2, 40, height / 2);

            g2d.setColor(Color.GREEN);
            int radius = 60;
            g2d.fillOval((width / 2) - radius, (height / 2) - (radius), radius * 2, radius * 2);
            g2d.dispose();
        }

   }
}
