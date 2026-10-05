package part02;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=1340s
//        starts at about 22:20 — stop at about 35:00, after he prints "Hello Bro"
// Guide: GUIDE.md in this folder — the same lesson, written out step by step
//
// Part 02 — variables
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called Variables.
//    Leave the "package part02;" line and the "public class Variables" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.
// This line defines the name of the class as Variables.
public class Variables {
    // The main method notifies the Java that this is the start of the program and makes it executable.
    public static void main(String[] args){
        // initializes the int variable x assigning it to 123
        int x = 123;
        // prints the text along with the int that variable x is holding then moves to a new line.
        System.out.println("My number is " + x);
        // initializes the long variable debt because debt holds a very big number, the 'L' is needed at the end, it tells java it's a long.
        long debt = 3000000000L;
        // prints the long that the variable debt is holding and moves to a new line.
        System.out.println(debt);
        // initializes a byte variable b, b = 100 which is within the -128-127 range
        byte b = 100;
        // prints out the byte that variable b is holding then moves to a new line
        System.out.println(b);
        // initializes a float variable y and can only hold ~6-7 digits, the f is needed at the end it tells java it's a float.
        float y = 3.14f;
        // prints out the float the variable y is hold then moves to a new line
        System.out.println(y);
        // initializes a double, which is significantly larger than a float ~15, variable y2. no letter is needed at the end.
        double y2 = 3.14;
        // prints out the double held by y2 then moves to a new line.
        System.out.println(y2);
        // initializes variable 'z' which is a boolean and the value is set to true.
        boolean z = true;
        // prints out the boolean value of z then moves to a new line.
        System.out.println(z);
        // initializes the variable symbol which is a char and holds the @ symbol
        char symbol = '@';
        // prints out the symbol held in the variable symbol then moves to a new line.
        System.out.println(symbol);
        // initializes a variable called name of type String and holds the string "Jeremiah."
        String name = "Jeremiah";
        // prints out the text along with my name then moves to a new line.
        System.out.println("Hello " + name);






    }
}
