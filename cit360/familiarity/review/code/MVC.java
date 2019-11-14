package familiarity.review.code;
import familiarity.review.code.Control.ComputerControl;
import familiarity.review.code.Model.Computer;
import familiarity.review.code.View.ComputerView;
import java.util.ArrayList;

/*
This class pulls the Model, View, and Controller classes together and 
runs them to create Computer objects
The model and controller talk, and the view and controller talk
The controllers can talk to each other, but nothing else can talk
*/
public class MVC {
    public static void main(String[] args) {
        Computer computer1 = new Computer("Dell", 4, "Intel", 500);
        Computer computer2 = new Computer("ASUS", 4, "AMD", 256);
        Computer computer3 = new Computer("Custom Built", 16, "Intel", 2000);
        
        ComputerView view1 = new ComputerView();
        ComputerView view2 = new ComputerView();
        ComputerView view3 = new ComputerView();
        
        ComputerControl controller1 = new ComputerControl(computer1,view1);
        ComputerControl controller2 = new ComputerControl(computer2,view2);
        ComputerControl controller3 = new ComputerControl(computer3,view3);
        
        System.out.println("Here are all of the computers that were created:");
        System.out.println("");
        controller1.updateView();
        controller2.updateView();
        controller3.updateView();
        
        System.out.println("We are updating the first computer to have more RAM");
        controller1.setComputerRam(8);
        System.out.println("We are updating the second computer to have more HDD space");
        controller2.setComputerHdd(1000);
        System.out.println("We are changing the processor in the third computer.");
        System.out.println("");
        controller3.setComputerProcessor("AMD");
        
        controller1.updateView();
        controller2.updateView();
        controller3.updateView();
    }
    
}
