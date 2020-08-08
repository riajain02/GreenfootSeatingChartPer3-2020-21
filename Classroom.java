import greenfoot.*;
import java.util.ArrayList;
 // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
 
/**
 * Write a description of class Classroom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Classroom extends World
{
    private ArrayList<Object> listo = new ArrayList<Object>();
    private BoxRia chalkboard;
    public static RiaJain riajain;
    public static BoxRia box;
    public static BoxRia chalk;
    /**
     * Constructor for objects of class Classroom.
     * 
     */
    public Classroom()
    {    
        // Create a new world with 10x6 cells with a cell size of 130x130 pixels.
        super(10, 6, 130); 
        prepare();
    }
    
    /**
     * Act function, called when the act or run buttons are pressed.
     */
    public void act()
    {
        addBox();
    }

    /**
     * Creates the chalkboard for the animation, but only when I am not sitting.
     */
    public void addBox()
    {
        if(Student.sittingRia==false) {
            box = new BoxRia("chalkboard.png",4,2);
            addObject(box,box.myRow,box.mySeat);
            chalk = new BoxRia("chalk.png",0,0);
            addObject(chalk,2,3);
        }
    }
    
    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
     private void prepare()
    {
        // Add three lines to this doc with your class constructor and your row and seat number
        // Make sure to match your first and last name to the class file you created.

        /* Example */
        KilgoreTrout kilgoretrout = new KilgoreTrout("Kilgore", "Trout", 1, 1);
        addObject(kilgoretrout, 1, 1);
        kilgoretrout.sitDown();
        
        riajain = new RiaJain("Ria", "Jain", 2, 1);
        addObject(riajain, riajain.myRow, riajain.mySeat);
        riajain.sitDown();
    }      
}
