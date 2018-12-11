import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boom extends Actor
{
    /**
     * Act - do whatever the Boom wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     int umurBoom;
    public Boom(){
        umurBoom = 200; //2 detik
    }
    
    
    public Boom (int umur){
        this.umurBoom =umur;
    }
    public void act() 
    {
        umurBoom--;
         
         
        if (umurBoom == 0)
        getWorld().removeObject(this);
        // Add your action code here.
    }    
}
