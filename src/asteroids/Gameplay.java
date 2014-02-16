/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package asteroids;

/**
 *
 * @author Eduardo
 */

import processing.core.*;

public class Gameplay extends PApplet {
    
    //Game Variables
    Spaceship ship;
    int windowWidth = 900;
    int windowHeight = 700;
    
    //SETUP SECTION
    public void setup(){
        size(windowWidth, windowHeight);
        fill(255, 204);
        noStroke();
        ship = new Spaceship();
       
    }
    
    //DRAW SECTION
    public void draw(){
        background(0);
        ship.display(this);
        
    }
    
}

 
