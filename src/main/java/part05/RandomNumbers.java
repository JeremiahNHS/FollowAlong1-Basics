package part05;
import java.util.Random;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=3850s
//        random numbers start at about 64:10 — stop at about 68:28
// Guide: GUIDE.md in this folder, steps 11–16
//
// Part 05 — random numbers: nextInt, nextDouble, nextBoolean
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called RandomNumbers.
//    (Do NOT name it Random. Java already has a class called Random.)
//    Leave the "package part05;" line and the "public class RandomNumbers" line alone.
//    The import line goes BETWEEN them (the guide shows where).
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does.
// This line defines the name of the class.
public class RandomNumbers {
    // The main method notifies the Java that this is the start of the program and makes it executable.
    public static void main(String[] args){
        // creates a new random number generator in the heap called random
        Random random = new Random();
        // stores the result of a random int between 1-6 in x
        int x = random.nextInt(6) + 1;
        // prints out the value of x
        System.out.println(x);
        // picks a random double between 1 and 0 and stores it in y
        double y = random.nextDouble();
        // prints out the value of y
        System.out.println(y);
        // picks a true or false and stores it in z
        boolean z = random.nextBoolean();
        // prints true or false
        System.out.println(z);



    }
}
