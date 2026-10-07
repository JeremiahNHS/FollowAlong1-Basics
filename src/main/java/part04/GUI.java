package part04;
import javax.swing.JOptionPane;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=3191s
//        starts at about 53:11 — stop at about 58:10, at "in conclusion ladies and gentlemen"
// Guide: GUIDE.md in this folder, steps 7–11
//
// Part 04, topic 2 — pop-up windows with JOptionPane
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this file.
//    His class is called Main. Yours is called GUI.
//    Leave the "package part04;" line and the "public class GUI" line alone.
//    He types an import line ABOVE the class. Type yours on the empty line
//    under "package part04;".
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. That includes the import line.
// This line defines the name of the class.
public class GUI {
    // The main method notifies the Java that this is the start of the program and makes it executable.
    public static void main(String[] args){
        // makes a pop-up box prompting the user to enter their name and stores it the variable name of type string
        String name = JOptionPane.showInputDialog("Enter your name");
        // creates another pop-up returning the text along with the inputted value
        JOptionPane.showMessageDialog(null, "Hello " + name);
        // creates a pop-up that asks for the users age. since showInputDialog always returns a strings, Integer.parseInt casts it back to an int
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        // creates another pop-up returning the text along with the inputted value
        JOptionPane.showMessageDialog(null, "You are " + age + " years old");
        // creates a pop-up that asks for the users height. since showInputDialog always returns a strings, Double.parseDouble casts it back into a double
        double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        // creates another pop-up returning the text along with the inputted value
        JOptionPane.showMessageDialog(null, "You are " + height + " cm tall");


    }
}
