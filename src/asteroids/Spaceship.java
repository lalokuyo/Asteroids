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

public class Spaceship{
    
  Spaceship(){
    
  }
 
  public void move() {
 
  }
  
  //Displays the spaceship in the middle of the screen
  void display(PApplet pApplet) {
     pApplet.rect(pApplet.width/2, pApplet.height/2, 10, 20);
  }
}
