import greenfoot.*;

/**
 * This class defines a Polar bear. Polar bears live on the ice.
 * @author Luc Rohmer
 * @version 8/26/21
 */
public class PolarBear extends Actor
{
    // This method repeats the following actions
    public void act()
    {
        
        turnAtEdge();
        checkKeyPress();
        onCollision();

    }
    
    // Turns the PolarBear at the edge
    private void turnAtEdge()
    {
        if(isAtEdge())
        {
            turn(50);
        }
    }
    
    // Checks for user key presses so user can turn the PolarBear
    private void checkKeyPress()
    {
        if(Greenfoot.isKeyDown("d"))
        {
            setLocation(getX() + 3, getY());
        }
        
        if(Greenfoot.isKeyDown("a"))
        {
            setLocation(getX() - 3, getY());
        }
        
         if(Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(), getY() - 3 );
        } 
        
        if(Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(), getY() + 3 );
        }
        
    }
    
    // Checks for collisions with other objects
    private void onCollision()
    {
        if(isTouching(Fish.class))
        {
            removeTouching(Fish.class);
            Greenfoot.playSound("slurp.wav");
            
            // Winning the game
            if(getWorld().getObjects(Fish.class).size()==0)
            {
                Greenfoot.setWorld(new WinSplash());
                Greenfoot.playSound("fanfare.wav");
                Greenfoot.stop();
            }
        }
        
        if(isTouching(Seal.class))
        {
            Greenfoot.playSound("au.wav");
            Greenfoot.stop();
        }
        
        if(isTouching(Igloo.class))
        {
            Greenfoot.playSound("au.wav");
            Greenfoot.stop();
        }
    }
}
    
    


