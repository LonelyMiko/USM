package md.usm.lab1.dog;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

public class DogApplet extends JPanel {
    @Override
    public void paintComponent(Graphics pen){
        paintCircle(pen,100,200,400,400,Color.GRAY); // draw head

        paintCircle(pen,120,300,50,50,Color.WHITE); // draw left eye
        paintCircle(pen, 130, 310, 35, 35, Color.BLACK);

        paintCircle(pen,380,300,50,50,Color.WHITE); // draw right eye
        paintCircle(pen, 390, 310, 35, 35, Color.BLACK);

        paintCircle(pen, 150, 400,200,100, Color.BLACK); // draw nose
        paintCircle(pen, 175, 420, 75,25, Color.WHITE);

        paintArc(pen,150, 420, 100,100, Color.RED,0,-115);

        paintArc(pen,175,420,100,100,Color.RED,0,270);



    }

    private void paintCircle(Graphics pen, int x, int y, int width, int height, Color penColor){
        pen.setColor(penColor);
        pen.drawOval(x,y,width,height);
        pen.fillOval(x,y,width,height);
    }

    private void paintArc(Graphics pen, int x, int y, int width, int height, Color penColor,int start, int end){
        pen.setColor(penColor);
        pen.drawArc(x,y,width,height,start,end);
    }

}
