package example;

import autonomousmanager.AutonomousSection;

/**
 * Example section to print "Updating" when update is called, "Starting" when start is called, and "Finishing" when finish is called.
 * Ends if a random number between 0 and 1 is 0.98 or the time limit of 1 second is exceeded
 * @author Jack
 */
public class ExampleSection extends AutonomousSection {
    public ExampleSection(){
        duration = 1000;
    }
    @Override public void start(){
        super.start();
        System.out.println("Starting");
    }
    @Override public void update(){
        System.out.println("Updating");
    }
    @Override public void finish(){
        System.out.println("Finishing");
    }
    @Override public boolean isFinished(){
        return isTimedOut() || Math.random() > 0.98;
    }
}
