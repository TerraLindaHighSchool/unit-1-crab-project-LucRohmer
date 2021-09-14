import greenfoot.*;

/**
 * This class defines a Polar bear. Polar bears live on the ice/sea.
 * @author Luc Rohmer
 * @version 9/14/21
 */
public class PolarBear extends Actor
{
    // This method repeats the following actions
    public void act()
    {
        checkKeyPress();
        onCollision();

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
            Greenfoot.playSound("Eat.wav");
            
            // Winning the game
            if(getWorld().getObjects(Fish.class).size()==0)
            {
                Greenfoot.setWorld(new WinSplash());
                Greenfoot.playSound("WinMusic.wav");
                Greenfoot.stop();
            }
        }
        
        if(isTouching(Seal.class))
        {
            Greenfoot.playSound("Hit.wav");
            Greenfoot.stop();
        }
        
        if(isTouching(Rock.class))
        {
            Greenfoot.playSound("Lose.wav");
            Greenfoot.setWorld(new GameOver());
            Greenfoot.stop();
        }
    }
}
    
    


