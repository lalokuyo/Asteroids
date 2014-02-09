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

public class Game extends PApplet {
    
    public void setup(){
        
        size(500, 500);
        
    }
    
    public void draw(){
        
        rect(mouseX, mouseY, 20, 20);
        
    }
    
}
