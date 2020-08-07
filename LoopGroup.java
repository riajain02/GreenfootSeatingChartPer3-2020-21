import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * We are the loop group.
 * 
 * @author Oleg Bychenkov, Kabir Shah, Shaan Mathur
 * @version 1.0
 */
public abstract class LoopGroup extends Student {
    private static final int slides = 6;
    private static Student[] presentors = new Student[3];
    
    public void showSlide(int slide) {
        Student student = presentors[slide % presentors.length];
        String slideStr = Integer.toString(slide);
        
        setImage("greenfoot-slide" + slideStr + ".png");
        Greenfoot.playSound("greenfoot-slide" + slideStr + ".m4a");
    }

    /**
     * Answer any questions.
     */
    public void answerQuestion() {
        
    }
       
    /**
     * Start giving the loop group lesson.
     */
    public void provideLesson() {
        World world = getWorld();
        presentors[0] = world.getObjects(KabirShah.class).get(0);
        for (int i = 0; i < slides; i++) {
            showSlide(i);
        }
    } 
}
