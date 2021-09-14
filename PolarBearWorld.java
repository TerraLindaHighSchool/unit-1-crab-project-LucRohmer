import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class PolarBearWorld extends World
{
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    public PolarBearWorld() 
    {
        super(800, 600, 1);
        prepare();
        playloop();
    }
    public void playloop()
    {
        Greenfoot.playSound("Water.wav");
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
        Rock igloo = new Rock();
        addObject(igloo,678,523);
        Rock igloo3 = new Rock();
        addObject(igloo3,351,530);
        Rock igloo4 = new Rock();
        addObject(igloo4,253,180);
        Rock igloo5 = new Rock();
        addObject(igloo5,610,383);
        Rock igloo6 = new Rock();
        addObject(igloo6,872,566);
        Rock igloo7 = new Rock();
        addObject(igloo7,563,103);
        Rock igloo8 = new Rock();
        addObject(igloo8,158,528);
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
        igloo3.setLocation(406,441);
        Fish fish9 = new Fish();
        addObject(fish9,628,317);
        Fish fish10 = new Fish();
        addObject(fish10,517,585);
        Fish fish11 = new Fish();
        addObject(fish11,265,598);
        Fish fish12 = new Fish();
        addObject(fish12,492,66);
        Fish fish13 = new Fish();
        addObject(fish13,702,235);
        removeObject(igloo4);
        removeObject(igloo7);
        removeObject(igloo3);
        removeObject(igloo5);
        removeObject(igloo8);
        removeObject(fish11);
        removeObject(fish10);
        fish9.setLocation(663,461);
        Rock igloo9 = new Rock();
        addObject(igloo9,320,171);
        Rock igloo10 = new Rock();
        addObject(igloo10,579,352);
        Rock igloo11 = new Rock();
        addObject(igloo11,230,393);
        Rock igloo12 = new Rock();
        addObject(igloo12,572,508);
        igloo10.setLocation(650,308);
        igloo9.setLocation(284,152);
        Fish fish14 = new Fish();
        addObject(fish14,547,267);
        Rock rock10 = new Rock();
        addObject(rock10,487,329);
        rock10.setLocation(742,329);
        rock10.setLocation(385,537);
        rock10.setLocation(666,79);
        Rock rock15 = new Rock();
        addObject(rock15,106,527);

    }
}