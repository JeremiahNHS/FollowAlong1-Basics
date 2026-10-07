package part04;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=2888s
//        starts at about 48:08 — stop at about 52:25, at "get started with expressions"
// Guide: GUIDE.md in this folder, steps 1–6
//
// Part 04, topic 1 — expressions: + - * / % ++ -- and casting
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called Expressions.
//    Leave the "package part04;" line and the "public class Expressions" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.
// This line defines the name of the class.
public class Expressions {
    // The main method notifies the Java that this is the start of the program and makes it executable.
    public static void main(String[] args){
        // initializes the variable friends of type double with value 10
        double friends = 10;
        // divides 10 by 3, friends is already a double so the casting is not need, it's redundant.
        friends = (double) friends / 3;
        // prints out the updated value of friends 3.3333 repeating
        System.out.println(friends);
    }
}
