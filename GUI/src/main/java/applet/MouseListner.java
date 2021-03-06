package applet;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;


/*
<applet code="MouseListner" width=300 height=80>
</applet>
 */

public class MouseListner extends Applet implements MouseListener, MouseMotionListener, MouseWheelListener {

    String msg = " ";
    int mouseX = 0, mouseY = 0;

    public void init(){

        addMouseListener(this);
        addMouseMotionListener(this);
        addMouseWheelListener(this);
    }

    public void mouseClicked(MouseEvent e){
        mouseX =55;
        mouseY = 60;
        msg = "Mouse Clicked";
        repaint();
    }

    public void mousePressed(MouseEvent e){
        mouseX =e.getX();
        mouseY = e.getY();
        msg = "Down";
        repaint();
    }

    public void mouseReleased(MouseEvent e){
        mouseX =e.getX();
        mouseY = e.getY();
        msg = "Up";
        repaint();
    }

    public void mouseEntered(MouseEvent e){
        mouseX =55;
        mouseY = 50;
        msg = "Mouse Entered";
        repaint();
    }


    public void mouseExited(MouseEvent e){
        mouseX =75;
        mouseY = 70;
        msg = "Mouse Exited";
        repaint();
    }

    public void mouseDragged(MouseEvent e){
        mouseX =e.getX();
        mouseY = e.getY();
        msg = "*";
        showStatus("Dragging mouse at "+e.getX()+", "+ e.getY());
        repaint();
    }

    public void mouseMoved(MouseEvent e){
        showStatus("Moving mouse at "+e.getX()+", "+ e.getY());
    }

    public void mouseWheelMoved(MouseWheelEvent e){
        mouseX = e.getX();
        mouseY = e.getY();
        msg= "Move wheel Movement";
        showStatus("Move wheel Movement");
        repaint();
    }

    public void paint(Graphics g){

        g.drawString(msg, mouseX, mouseY);
    }
}



