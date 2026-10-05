package part01;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=750s
//        rewatch 12:30–17:30 if you forget how print, \n, \t, \" or \\ work
// Guide: GUIDE.md in this folder, steps 3–10
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.

public class Stretch {
    public static void main(String[] args){
        /* MY GUESS:
        AB
        C
            D\
        "E"
        G

        */
        System.out.print("A");
        System.out.println("B");
        System.out.print("C\n");
        System.out.println("\tD\\");
        System.out.println("\"E\"");
        // System.out.println("F");
        System.out.print("G");
        System.out.println();

        //B1
        System.out.println("Jeremiah Faustin");
        System.out.println("Computer Science");
        System.out.println("Class of 2028");

        //B2
        System.out.print("Jeremiah Faustin\nComputer Science\nClass of 2028\n");

        //B3
        System.out.println("Day\t\tClass\t\t\tTime");
        System.out.println("Mon\t\tCSCI-121\t\t2:00 PM");
        System.out.println("Tue\t\tCSCI-121\t\t3:00 PM");
        System.out.print("My teacher said \"type it yourself.\"\n");
        System.out.println("My code lives in C:\\Users\\Jeremiah\\csci121");

    }
}
