import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{

    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public GameOver()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 400, 1); 
    }
    
    public GameOver(int skor)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
         super(700, 400, 1); 
        showText("Score Anda: "+ skor, 100, 30);
    }
    
        public void act(){
        if(Greenfoot.isKeyDown("enter"))
        Greenfoot.setWorld(new MyWorld());
    }
}
