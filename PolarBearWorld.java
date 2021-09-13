import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class PolarBearWorld extends World
{
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    public PolarBearWorld() 
    {
        super(800, 700, 1);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        PolarBear crab = new PolarBear();
        addObject(crab,204,243);
        Fish worm = new Fish();
        addObject(worm,391,204);
        Fish worm2 = new Fish();
        addObject(worm2,272,108);
        Fish worm3 = new Fish();
        addObject(worm3,445,144);
        Fish worm4 = new Fish();
        addObject(worm4,327,378);
        Fish worm5 = new Fish();
        addObject(worm5,193,337);
        Fish worm6 = new Fish();
        addObject(worm6,484,404);
        Fish worm7 = new Fish();
        addObject(worm7,129,138);
        Fish worm8 = new Fish();
        addObject(worm8,129,414);
        Seal lobster = new Seal();
        addObject(lobster,404,283);
        Igloo igloo = new Igloo();
        addObject(igloo,678,523);
        Igloo igloo2 = new Igloo();
        addObject(igloo2,765,169);
        Igloo igloo3 = new Igloo();
        addObject(igloo3,351,530);
        Igloo igloo4 = new Igloo();
        addObject(igloo4,253,180);
        Igloo igloo5 = new Igloo();
        addObject(igloo5,610,383);
        Igloo igloo6 = new Igloo();
        addObject(igloo6,872,566);
        Igloo igloo7 = new Igloo();
        addObject(igloo7,563,103);
        Igloo igloo8 = new Igloo();
        addObject(igloo8,158,528);
        removeObject(igloo2);
        removeObject(igloo6);
        removeObject(igloo);
        igloo5.setLocation(616,536);
        igloo7.setLocation(670,159);
        igloo3.setLocation(426,336);
        igloo4.setLocation(218,108);
        igloo8.setLocation(131,608);
        igloo5.setLocation(612,546);
        igloo8.setLocation(184,552);

        
        igloo4.setLocation(121,105);
        igloo7.setLocation(658,101);
        igloo8.setLocation(149,581);
        igloo5.setLocation(644,551);
        igloo8.setLocation(172,538);
        igloo4.setLocation(160,148);
        igloo7.setLocation(612,137);
        igloo3.setLocation(404,317);
        igloo3.setLocation(393,321);
    }
}