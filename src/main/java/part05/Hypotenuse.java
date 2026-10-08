package part05;
import java.util.Scanner;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=3689s
//        the hypotenuse project starts at about 61:29 — stop at about 63:52
// Guide: GUIDE.md in this folder, steps 7–10
//
// Part 05 — a project that uses the Math class: find the long side of a triangle
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called Hypotenuse.
//    Leave the "package part05;" line and the "public class Hypotenuse" line alone.
//    The import line goes BETWEEN them (the guide shows where).
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does.
// This line defines the name of the class.
public class Hypotenuse {
    // The main method notifies the Java that this is the start of the program and makes it executable.
    public static void main(String[] args){
        // the declaration of x
        double x;
        // the declaration of y
        double y;
        // the declaration of x
        double z;
        // creates a new Scanner in the heap called scanner
        Scanner scanner = new Scanner(System.in);
        // prints out the text prompting for a side
        System.out.println("Enter side x: ");
        // stores the user input in the variable x and waits for the user to press enter, only excepts doubles
        x = scanner.nextDouble();
        // prints out the text prompting for a side
        System.out.println("Enter side y: ");
        // stores the user input in the variable y and waits for the user to press enter, only excepts doubles
        y = scanner.nextDouble();
        // solves for the hypotenuse and stores it in z
        z = Math.sqrt((x * x) + (y * y));
        // prints out the text along with the value of z
        System.out.println("The hypotenuse is: " + z);
        // lets java know that the scanner is done taking inputs
        scanner.close();


    }
}
