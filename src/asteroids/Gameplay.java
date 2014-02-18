/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package asteroids;

/**
 *
 * @author Eduardo
 * @author Alejandro
 */
import processing.core.*;
import javax.swing.*;

public class Gameplay extends PApplet {

    //Game Variables
    Spaceship ship;
    int windowWidth = 900;
    int windowHeight = 700;
    String op1;

    //SETUP SECTION
    public void setup() {
        size(windowWidth, windowHeight);
        fill(255, 204);
        noStroke();
        ship = new Spaceship();
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        String op1s = JOptionPane.showInputDialog(frame, "Introduce your name", "");
        if (op1s != null) {
            op1 = op1s;
            JOptionPane.showMessageDialog(frame, "Thank you so much. Enjoy the game");
        }
    }

    //DRAW SECTION
    public void draw() {
        background(0);
        ship.display(this);
    }
}
