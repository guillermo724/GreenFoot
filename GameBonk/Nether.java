import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nether extends World
{
    public void createSouldyers(){
            for (int i = 0; i < 3; i++)
{
    int x = 400 + i * 250;
    int y = 300;

    if (i % 3 == 0)
    {
        addObject(new Garchomp(), x, y);
    }
    else if (i % 3 == 1)
    {
        addObject(new Gabite(), x, y);
    }
    else
    {
        addObject(new Ginble(), x, y);
    }
}
    }

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Nether()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1500, 1000, 1); 
        
        Player babyAdventurer = new Player();
        addObject(babyAdventurer, 0, 0);
        createSouldyers();
    }
}
