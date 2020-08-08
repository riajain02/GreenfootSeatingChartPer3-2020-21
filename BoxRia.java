import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RiaBox here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public  class BoxRia extends Student
{
    private GreenfootImage chalkboardImage; // variable for the chalkboard image
    
    /**
     * Constructor for the objects of this class.
     */
    public BoxRia(String imageName, int r, int s)
    {
        myRow = r;
        mySeat = s;        
        chalkboardImage = new GreenfootImage(imageName);
        if(imageName=="chalkboard.png") {
            chalkboardImage.scale(700,600);
        }
        setImage(chalkboardImage);
    }
    
    /**
     * Act - do whatever the RiaBox wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        drawRia();
    }   
    
    
    /**
     * Animation code, draws "RIA" on the chalkboard. Then, call the provideLesson() function directly after (defined in class RiaJain).
     */
    public void drawRia()
    {
        int delay = 2;
        //DRAW THE "R"
        chalkboardImage.setColor(Color.WHITE);
        for(int i=1;i<=8;i++) {
           chalkboardImage.drawLine(175,200+25*(i-1),175,200+25*i);
           Greenfoot.delay(delay);
        }
         for(int j=1;j<=2;j++) {
           chalkboardImage.drawLine(175+25*(j-1),200,175+25*j,200);
           Greenfoot.delay(delay);
        }
        chalkboardImage.drawLine(225,200,225+25,200+25);
        Greenfoot.delay(delay);
        for(int k=1;k<=2;k++) {
           chalkboardImage.drawLine(250,225+25*(k-1),250,225+25*k);
           Greenfoot.delay(delay);
        }
        chalkboardImage.drawLine(250,275,250-25,275+25);
        Greenfoot.delay(delay);
        for(int m=1;m<=2;m++) {
           chalkboardImage.drawLine(225-25*(m-1),300,225-25*m,300);
           Greenfoot.delay(delay);
        }
        for(int o=1;o<=4;o++) {
            chalkboardImage.drawLine(225+(25/4)*(o-1),300+25*(o-1),225+(25/4)*o,300+25*o);
            Greenfoot.delay(delay);
        }
        // DRAW THE "I"
        for(int p=1;p<=8;p++) {
            chalkboardImage.drawLine(300,200+25*(p-1),300,200+25*p);
            Greenfoot.delay(delay);
        }
        //DRAW THE "A"
        for(int q=1;q<=8;q++) {
            chalkboardImage.drawLine(350+(50/8)*(q-1),400-25*(q-1),350+(50/8)*q,400-25*q);
            Greenfoot.delay(delay);
        }
        for(int r=1;r<=8;r++) {
            chalkboardImage.drawLine(400+(50/8)*(r-1),200+25*(r-1),400+(25/4)*r,200+25*r);
            Greenfoot.delay(delay);
        }
        for(int s=1;s<=2;s++) {
            chalkboardImage.drawLine(375+25*(s-1),300,375+25*s,300);
            Greenfoot.delay(delay);
        }
        Greenfoot.delay(50);
        RiaJain ria = Classroom.riajain;
        ria.provideLesson();
    }
    
    // Last three functions are defined so that the class does not have to be abstract and can be instantiated. They are not called.
    public void getName() {}
    public void  provideLesson(){}
    public void  answerQuestion(){}
}
