import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import bluej.utility.Utility; // for URL

/**
 * A subclass of student that represents me, Ria Jain, and my presence in Mr. Kaehms' AP CSA Period 3 Class
 * 
 * Ria Jain
 * @version 1.0 Aug 1, 2020
 */
public class RiaJain extends Student
{
    /**
     * Constructor for objects of this class.
     */
    public RiaJain(String f, String l, int r, int s) 
    {
        // variable definitions for this instance
        firstName = f;
        lastName = l;
        myRow = r;
        mySeat = s;
        portraitFile = f.toLowerCase()+l.toLowerCase()+".jpg";  // image file name is riajain.jpg
        standingFile = firstName.toLowerCase()+lastName.toLowerCase()+"-standing.png";  // image file name is riajain-standing.jpg
        soundFile = f.toLowerCase()+l.toLowerCase()+".wav"; // sound file name is riajain.wav
        
        // resize sitting image
        portraitImage = new GreenfootImage(portraitFile);
        portraitImage.scale(100,125);
        
        // resize standing image
        standingImage = new GreenfootImage(standingFile);
        standingImage.scale(800,600);
        
        
        // set instance to default sitting
        setImage(portraitImage);
        sitting = true;
    }
    
    /**
     * Act - do whatever the RiaJain wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        sitting = false;
        sittingRia = true;
        if(Greenfoot.mouseClicked(this)){
            sitting = false;
            standUp();
            sittingRia = false;
            sayName(soundFile);
        }
    } 
    
    /**
     * Function to change to the standing up position.
     */
    public void standUp()
    {
        setLocation(0,2);
        setImage(standingImage);
    }
    
    /**
     * Code to prompt user to begin the lesson.
     */
    public void  provideLesson()
    {
        while(!sitting)
        {
            BoxRia chalkboard = Classroom.box;
            BoxRia chalk = Classroom.chalk;
            getWorld().removeObject(chalkboard);
            getWorld().removeObject(chalk);
            String ans = Greenfoot.ask("Would you like to view a lesson on 2D arrays?");
            if(ans.contains("y")||ans.contains("Y")) {
                ourLesson();
                break;
            }
            else if (ans.contains("n")||ans.contains("N")) {
                String ans2 = Greenfoot.ask("Okay, may I sit down?");
                if(ans2.contains("y")||ans2.contains("Y")){
                    sitDown();
                }
                break;
            }
            else {
                System.out.println("Please answer with 'yes' or 'no.'");
            }
            }
        }
    
    /** 
     * Code for the actual lesson.
     */
    public void ourLesson() {
        sitDown();
        Greenfoot.delay(100);
        for(int i=0;i<2;i++){
            System.out.println("\n");
        }
        Greenfoot.playSound("lesson1.wav");
        System.out.println("Starting lesson...");
        Greenfoot.delay(100);
        System.out.println("AP CSA: TWO DIMENSIONAL ARRAYS, BY: RIA JAIN, GRACE LIU, JENNY WANG");
        System.out.println("\n");
        Greenfoot.delay(750);
        System.out.println("We will cover:");
        System.out.println("\ti. Introduction to 2D Arrays");
        Greenfoot.delay(150);
        System.out.println("\tii. Array Storage");
        Greenfoot.delay(150);
        System.out.println("\tiii. How to Declare 2D Arrays");
        Greenfoot.delay(150);
        System.out.println("\tiv. Set value(s) in a 2D Array");
        Greenfoot.delay(150);
        System.out.println("\tv. How to get a Value from a 2D Array");
        Greenfoot.delay(150);
        System.out.println("\tvi. How to Find the Number of Rows and Columns in a 2D Array");
        Greenfoot.delay(250);
        System.out.println("\tvii. How to loop through a 2D Array");
        Greenfoot.delay(150);
        System.out.println("\tviii. Using For-Each to Loop");
        Greenfoot.delay(150);
        System.out.println("\tix. Looping through Part of a 2D Array");
        Greenfoot.delay(150);
        System.out.println("\tx. Common Mistakes");
        Greenfoot.playSound("lesson2.wav");
        Greenfoot.delay(500);
        String answer = Greenfoot.ask("Are you ready to begin watching the lesson?");
        Boolean a = true;
        while(a) {
            if(answer.contains("y")||answer.contains("Y")) {
                startLesson();
                break;
            }
            else if (answer.contains("n")||answer.contains("N")) {
                String ans2 = Greenfoot.ask("Okay, may I sit down?");
                if(ans2.contains("y")||ans2.contains("Y")){
                    sitDown();
                }
                break;
            }
            else {
                System.out.println("Please answer with 'yes' or 'no.'");
            }
        }
    }
    
    public void startLesson() 
    {
        bluej.utility.Utility.openWebBrowser("https://www.youtube.com/watch?v=prXUe8rXlp8&feature=youtu.be");
        Greenfoot.delay(150);
        String ans = Greenfoot.ask("Would you like to  view the notes for this lesson?");
        Boolean a = true;
        while(a) {
            if(ans.contains("y")||ans.contains("Y")) {
                bluej.utility.Utility.openWebBrowser("https://docs.google.com/document/d/17U_2yqYnbC4gpIYQSBEEClDZSNC4D5t38SGbU9HEB4M/edit");
                break;
            }
            else if (ans.contains("n")||ans.contains("N")) {
                String ans2 = Greenfoot.ask("Okay, may I sit down?");
                if(ans2.contains("y")||ans2.contains("Y")){
                    sitDown();
                }
                break;
            }
            else {
                System.out.println("Please answer with 'yes' or 'no.'");
            }
        }
    }
        
    /**
     * Code to sit back down.
     */
    public void sitDown(){
            returnToSeat();
            setImage(portraitImage);
            sitting=true;
    }
    
    // Last two functions are defined so that the class does not have to be abstract and can be instantiated. They are not called.
    public void getName() {}
    public void  answerQuestion(){}
}
