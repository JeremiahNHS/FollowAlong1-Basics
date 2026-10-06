package part03;
import java.util.Scanner;
// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=2365s
//        starts at about 39:25 — stop at about 47:00, after "that is how scanners work"
// Guide: GUIDE.md in this folder, steps 5–11
//
// Part 03, topic 2 — reading what the user types (Scanner)
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this file.
//    His class is called Main. Yours is called UserInput.
//    Leave the "package part03;" line and the "public class UserInput" line alone.
//    He types an import line ABOVE the class. Type yours on the empty line
//    under "package part03;".
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. That includes the import line.
// This line defines the name of the class as Variables.
public class UserInput {
    // The main method notifies the Java that this is the start of the program and makes it executable.
    public static void main(String[] args){
        // this creates a new scanner in the heap called scanner. ".in" indicates that it will read input from the keyboard
        Scanner scanner = new Scanner(System.in);
        // prints out the text "Whats your name?", prompting the user to input their name
        System.out.println("Whats your name?");
        // reads the input, waits for the user to press enter and stores it in the String type variable name
        String name = scanner.nextLine();
        // prints out the text "How old are you", prompting the user to input their age
        System.out.println("How old are you?");
        // reads the input and stores it in the int type variable age, but doesn't wait for the user to press enter and moves on tp the next line
        int age = scanner.nextInt();
        // stops the code from speeding off to the next line until enter is pressed
        scanner.nextLine();
        // prints out the text "What is your favorite food?", prompting the user to input their favorite food
        System.out.println("What is your favorite food?");
        // reads the input, waits for the user to press enter and stores it in the String type variable food
        String food = scanner.nextLine();
        // prints out the text along with the value of the variable name that was inputted
        System.out.println("Hello " + name);
        // prints out the value of age that was inputted sandwiched between the text
        System.out.println("You are " + age + " years old");
        // prints out the text along with the value of the variable food that was inputted
        System.out.println("You like " + food);




    }
}
