package part03;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=2140s
//        starts at about 35:40 — stop at about 38:50, at "your assignment for today"
// Guide: GUIDE.md in this folder, steps 1–4
//
// Part 03, topic 1 — swapping two variables
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called Swap.
//    Leave the "package part03;" line and the "public class Swap" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.
// This line defines the name of the class as Variables.
public class Swap {
    // The main method notifies the Java that this is the start of the program and makes it executable.
    public static void main(String[] args){
        // initializes variable x of type string which holds the string "water"
        String x = "water";
        // initializes variable y of type string which holds the string "Kool-Aid"
        String y = "Kool-Aid";
        // this is the declaration of temp
        String temp;
        // temp holds the value of x before we swap
        temp = x;
        // the value x is then changed to the value of y, "Kool-Aid"
        x = y;
        // sets y to the orginal value of x that was stored in temp
        y = temp;
        // prints out the text along with the value of x after the swap, so "Kool-Aid"
        System.out.println("x: " + x);
        // prints out teh text along with water
        System.out.println("y: " + y);

    }
}
