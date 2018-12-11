import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Burung here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Burung extends Actor
{
    /**
     * Act - do whatever the Burung wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      
      MyWorld my = (MyWorld)getWorld();    
      getWorld().showText("Score : "+ my.getSkorBurung(), 150, 30);
      getWorld().showText("Live  : "+ my.getNyawaBurung(), 50, 30);
      move(3);
      gerakBurung();
      makanKacang();
      makanBoom();
        
    }    
    
    private void gerakBurung(){
        //if(Greenfoot.isKeyDown("up"))
        //turn(-3);
        
        //if(Greenfoot.isKeyDown("down"))
        //turn(3);
        
        if(Greenfoot.isKeyDown("left"))
        turn(-3);
        
        if(Greenfoot.isKeyDown("right"))
        turn(3);
    }
    
    private void makanKacang(){
        MyWorld my = (MyWorld)getWorld();    
        if (isTouching(Kacang.class))
        my.updateSkor(10);
    }
    
    private void makanBoom(){
        MyWorld my = (MyWorld)getWorld();    
        if (isTouching(Boom.class)){
        my.updateNyawa();
        if(my.getNyawaBurung() < 1){
            Greenfoot.setWorld(new GameOver(my.getSkorBurung()));
        }
        setLocation(50, 100);
    }
        
    }
}
