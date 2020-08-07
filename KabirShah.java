import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * I'm Kabir Shah
 * 
 * @author Kabir Shah
 * @version 1.0
 */
public class KabirShah extends LoopGroup implements CSALearnedSoFar, NumberOfSiblings, SpecialInterestOrHobby, StudentAthlete
{

    /**
     * Construct a KabirShah with a specific name and seat.
     */
    public KabirShah(String f, String l, int r, int s) {
        firstName = f;
        lastName = l;
        
        myRow = r;
        mySeat = s;
        
        portraitFile = f.toLowerCase() + l.toLowerCase() + ".jpg";
        standingFile = firstName.toLowerCase() + lastName.toLowerCase() + "-standing.jpg";
        soundFile = f.toLowerCase() + l.toLowerCase() + ".wav";
        
        sitting = true;
        
        setImage(portraitFile);
    }
    
    /**
     * Construct a default KabirShah with his actual name and seat.
     */
    public KabirShah() {
       firstName = "Kabir";
       lastName = "Shah";
       
       myRow = 1;
       mySeat = 1;
       
       portraitFile = firstName.toLowerCase() + lastName.toLowerCase() + ".jpg";
       standingFile = firstName.toLowerCase() + lastName.toLowerCase() + "-standing.jpg";
       soundFile = firstName.toLowerCase() + lastName.toLowerCase() + ".wav";
       
       sitting = true;
       
       setImage(portraitFile);
    }

    /**
     * Prints name to the console.
     */
    public void getName(){
        System.out.println("Hey, I'm " + firstName + " " + lastName);
    }
    
    /**
     * Prints AP CSA skills learned so far to the console.
     */
    public void LearnedSoFar() {
        System.out.println("I've learned Java syntax, statements, classes, objects, inheritance, and interfaces.");
    }
    
    /**
     * Returns total number of siblings.
     */
    public int numberOfSiblings() {
        return numberOfBrothers() + numberOfSisters();
    }
    
    /**
     * Returns number of brothers.
     */
    public int numberOfBrothers() {
        return 1;
    }
    
    /**
     * Returns number of sisters.
     */
    public int numberOfSisters() {
        return 0;
    }

    /**
     * Prints a given sports sentence.
     */
    public void mySport(String s) {
        System.out.println(s);
    }
    
    /**
     * Prints a given hobby sentence.
     */
    public void myHobby(String s) {
        System.out.println(s);
    }
    
    /**
     * Starts the pacman/spongebob animation.
     */
    public void startAnimation() {
        setLocation(0,0);
         Greenfoot.delay(10);
        // move right
        for (int i=1;i<=9;i++){
            setLocation(i,0);
            Greenfoot.delay(10);
        }
        // move back
        for (int i=1;i<=5;i++){
            setLocation(9,i);
            Greenfoot.delay(10);
        }      
         // move left
        for (int i=9;i>=0;i--){
            setLocation(i,5);
            Greenfoot.delay(10);
        }      
              // move Forward
        for (int i=5;i>=0;i--){
            setLocation(0,i);
            Greenfoot.delay(10);
        }   
           Greenfoot.delay(20);
           returnToSeat();
    }
        
    /**
     * Give an introduction and begin an animation when clicked.
     */
    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            sitting=false;
            setImage(standingFile);
            
            System.out.println("");
            getName();
            sayName(soundFile);
            LearnedSoFar();
            System.out.println("I have " + Integer.toString(numberOfSiblings()) + " siblings.");
            myHobby("I like to play guitar.");
            mySport("I play soccer and lacrosse.");
            
            startAnimation();
            provideLesson();
            sitDown();
        }
    }
}