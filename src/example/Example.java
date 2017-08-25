package example;

import autonomousmanager.AutonomousManager;
import autonomousmanager.AutonomousSection;

public class Example {
    public static void main(String[] args){
        AutonomousManager manager = new AutonomousManager();
        AutonomousSection section = new ExampleSection();
        manager.addSection(section);
        manager.start();
        try {
            while(manager.isRunning()){
                manager.update();
                Thread.sleep(20);
            }
        } catch (Exception e) {
        }
    }
}
