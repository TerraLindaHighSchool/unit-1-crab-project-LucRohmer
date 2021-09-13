import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Seal is the enemy of the Polar Bear
 * 
 * @author Luc Rohmer 
 * @version 8/30/21
 */
public class Seal extends Actor
{
    // This method repeats the following actions
    public void act()
    {
        move(Greenfoot.getRandomNumber(17));
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
