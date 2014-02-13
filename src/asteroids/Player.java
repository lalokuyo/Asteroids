/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package asteroids;

/**
 *
 * @author Eduardo
 */
public class Player {
    
    //Player variables
    String name;
    //int id; 
    int score;
    
    public Player(String name){
        this.name = name;
        this.score = 0;
    }
    
    public void setScore(int score){
        this.score = score;
    }
    
    
}
