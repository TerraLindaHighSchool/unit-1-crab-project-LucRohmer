import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class defines a Fish. Fish are the prey of the Polar Bear.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fish extends Actor
{
    // This method repeats the following actions
    public void act()
    {
        move(Greenfoot.getRandomNumber(15));
        turnAtEdge();
    }
    
    // Turns the Crab at the edge
    private void turnAtEdge()
    {
        if(isAtEdge())
        {
            turn(Greenfoot.getRandomNumber(360));
        }
    }
}

