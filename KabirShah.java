import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * I'm Kabir Shah
 * 
 * @author Kabir Shah
 * @version 1.0
 */
public class KabirShah extends Student implements CSALearnedSoFar, NumberOfSiblings, SpecialInterestOrHobby, StudentAthlete
{

    /**
     * Constructor for the KilgoreTrout class.
     * Constructors are special methods with the same exact name as the class name.  
     * Constructors to not have return types.
     * Constructors can be overloaded. This means we can call a constructor with different sets of parameter
     *  lists to initalize for different conditions (depending on what constructors have been written.
     * @param String f (firstname)
     * @param String l (lastname)
     * @param int r (row of seating arrangement)
     * @param int s (seat number within row seating arrangement)
     * 
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
     * Default constructor, if you don't pass in a name and seating location
     * Pay attention to how the row and seat variables set the location of the image.  1,1 is the first cell in the upper left
     * of the classroom.
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
     * Prints the name to the console.
     */
    public void getName(){
        System.out.println("Hey, I'm " + firstName + " " + lastName);
    }
    
    public void LearnedSoFar() {
        System.out.println("");
    }
    
    public int numberOfSiblings() {
        return numberOfBrothers() + numberOfSisters();
    }
    
    public int numberOfBrothers() {
        return 1;
    }
    
    public int numberOfSisters() {
        return 1;
    }
    
    public void mySport(String s) {
        System.out.println(s);
    }
    
    public void myHobby(String s) {
        System.out.println(s);
    }
    
        /**
     * This is a local method specific to the KilgoreTrout class used to animate the character once the image is clicked on.
     * You should write your own methods to perform your own animation for your character/avatar.
     */
    public void circleClass(){
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
     * This method needs to allow the user to interact with the student through a question and answer interface, and provide
     * some mechanism that allows the student to sit down once the Q&A session ends.  You can use this basic model, or come up
     * with some additional class and object that represents a blackboard, or a talking cartoon bubble etc. If you provide extra
     * classes, make sure to fully document so other students can use the same interface.
     */
    public void provideLesson(){
        while (! sitting) {
        String q=Greenfoot.ask("Are you ready to start (yes/no)");
        if (q.contains("yes")){
         // put in your lesson here - you can open up a browser for a screencast
         // Create a blackboard image and write to it, etc
         // Use an animated gif and dub over with audio - see "controls/show sound recoder"
         // from main greenfoot menu for a simple to use soud editor
        
         
        // You can end the lesson and "sitDown" once the lesson is complete, or once
        // someone answers "yes" to the sitdown question
        }
        else {
          q=Greenfoot.ask("I don't understand the question... May I sit down?"); 
        }
         if (q.equals("yes")){
            Greenfoot.delay(10);
            sitDown();
        }
    }
        
    }
    
    public void answerQuestion(){
        // may not need
    }
        
    /**
     * Act - do whatever the KilgoreTrout actor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
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
            
            circleClass();
            provideLesson();
            sitDown();
        }
    }
}