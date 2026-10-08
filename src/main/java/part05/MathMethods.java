package part05;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=3518s
//        Math class starts at about 58:38 — stop at about 61:29, "here's a project"
// Guide: GUIDE.md in this folder, steps 1–6
//
// Part 05 — the Math class: max, min, abs, sqrt, round, ceil, floor
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called MathMethods.
//    Leave the "package part05;" line and the "public class MathMethods" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.
// This line defines the name of the class.
public class MathMethods {
    // The main method notifies the Java that this is the start of the program and makes it executable.
    public static void main(String[] args){
        // initializes the variable x of type double with value 3.14
        double x = 3.14;
        // initializes the variable y of type double with value -10
        double y = -10;
        // initializes the variable z of type double with value set as the maximum between x and y
        double z = Math.max(x, y);
        // prints out the value of z
        System.out.println(z);
        // changes z to be the min between x and y
        z = Math.min(x, y);
        // prints out the updated value of z
        System.out.println(z);
        // changes z to be the absolute value of y; Math.abs
        z = Math.abs(y);
        // prints out the updated value of z
        System.out.println(z);
        // changes z to be the square root of y; Math.sqrt
        z = Math.sqrt(y);
        // prints out the updated value of z
        System.out.println(z);
        // updates y to be equal to 3.16;
        y = 3.16;
        // changes z to be the square root of y; Math.sqrt
        z = Math.sqrt(y);
        // prints out the updated value of z
        System.out.println(z);
        // rounds the value of x to the nearest whole number
        z = Math.round(x);
        // prints out the updated value of z
        System.out.println(z);
        // rounds the value of x up to the nearest whole number
        z = Math.ceil(x);
        // prints out the updated value of z
        System.out.println(z);
        // rounds the value of x down to the nearest whole number
        z = Math.floor(x);
        // prints out the updated value of z
        System.out.println(z);




    }
}
