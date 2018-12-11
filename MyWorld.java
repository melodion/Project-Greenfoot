import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    int minKacang = 100;
    int minBoom   = 50;
    int rangUmur  = 500;
    int rangBoom  = 150;
    
    private int skorBurung;
    private int nyawaBurung = 3;
    
    public int getSkorBurung(){
        return skorBurung;
    }
    
     public int getNyawaBurung(){
        return nyawaBurung;
    }
    public void updateSkor(int x){
        skorBurung+=x;
    }
    
     public void updateNyawa(){
        nyawaBurung--;
    }
    
    public void act(){
        if(cekKacang())
        populate();
       
        if(cekBoom())
        tampilBoom();
    }
    
    private boolean cekKacang(){
        return getObjects(Kacang.class).size() == 0;
    }
    
    private boolean cekBoom(){
        return getObjects(Boom.class).size() == 0;
    }
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 400, 1); 
        prepare();
    }
    private void populate(){
        
        for (int i=0; i<4; i++){
            int umur = minKacang + Greenfoot.getRandomNumber(rangUmur);
            addObject(new Kacang(umur), myRandomKacang(getWidth()),myRandomKacang(getHeight()));
            
        }
        
    }
    
    private void tampilBoom(){
         for (int i=0; i<2; i++){
        int umurB = minBoom + Greenfoot.getRandomNumber(rangBoom);
            addObject(new Boom(umurB), myRandomBoom(getWidth()),myRandomBoom(getHeight()));
        }
    }
    private int myRandomKacang(int x){
        return Greenfoot.getRandomNumber(x);
    }
    
    private int myRandomBoom(int x){
        return Greenfoot.getRandomNumber(x);
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Burung burung = new Burung();
        addObject(burung,341,211);
        
        populate();
        
    }
}
