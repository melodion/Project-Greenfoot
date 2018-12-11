import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kacang here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kacang extends Actor
{
    /**
     * Act - do whatever the Kacang wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int umurKacang;
    public Kacang(){
        umurKacang = 500; //2 detik
    }
    
    
    public Kacang (int umurkacang){
        this.umurKacang =umurkacang;
    }

    public void act() 
    {
        // Add your action code here.
        
        umurKacang--;
        if (isTouching(Burung.class))
         getWorld().removeObject(this);
        
        
        if (umurKacang == 0)
        getWorld().removeObject(this);
        
      
    }    
}
