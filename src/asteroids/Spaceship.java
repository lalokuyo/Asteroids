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

public class Spaceship extends PApplet{
    
    //Attributes for the spaceship
   PImage img;
   PApplet pApplet;
   float posx;
   float posy;
   float speed;
   float changer;
   int acceleration;
   float angle;
   
    
  public Spaceship(PApplet pApplet){
      
      //loading and positioning the the Ship image
    this.img=loadImage("ship.png");
    this.posx=pApplet.width/2;
    this.posy=pApplet.height/2;
    this.pApplet=pApplet;
    this.speed=0;
    this.changer=(float)0.1;
    this.angle=radians(0);
    this.acceleration=0;
    
  }
 //Handling the cursor button actions
  public void move() {
      if(pApplet.keyPressed)
      {
      if(pApplet.keyCode==RIGHT)
      {
          angle+=radians(60);
          
      }
      if(pApplet.keyCode==LEFT)
      {
          angle-=radians(60);
      }
      if(pApplet.keyCode==UP)
      {
          speed+=changer;
      }
      if(pApplet.keyCode==DOWN)
      {
          speed-=changer;        
      }
      }
  }
  //Speed- and angle-dependent moving of the Ship
  public void isMoving()
  {
          posx=posx+(speed*cos(radians(angle-90)));
          posy=posy+(speed*sin(radians(angle-90)));
  }
  
  //Displays the spaceship in the middle of the screen
  public void display() {
     pApplet.translate(posx,posy);
     pApplet.rotate(radians(angle));
     pApplet.image(img, -img.width/2,-img.height/2);
  }
}
