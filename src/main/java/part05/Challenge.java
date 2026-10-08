package part05;
import java.util.Scanner;
import java.util.Random;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=3689s
//        rewatch 61:29–63:52 for Scanner + Math, 66:47–67:40 for dice rolls
// Guide: GUIDE.md in this folder, steps 7–10 and 13–14
//
// SECTION D — Challenge. The dice report. The README lists the rules.
//
// There is no main method here yet. Typing it is part of the challenge.

public class Challenge {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random1 = new Random();
        Random random2 = new Random();

        int roll1 = random1.nextInt(6) + 1;
        int roll2 = random2.nextInt(6) + 1;
        int max = Math.max(roll1, roll2);
        int min = Math.min(roll1, roll2);
        double avg = (roll1 + roll2) / 2;

        System.out.print("What is your name? ");
        String name = scanner.nextLine();

        System.out.println(name + " rolled a " + roll1 + " and " + roll2 );
        System.out.println("Total: " + (roll1 + roll2));
        System.out.println("Higher die: " + max);
        System.out.println("Lower die: " + min);
        System.out.println("Difference: " + (max - min));
        System.out.println("Average: " + avg);
        System.out.println("Average, rounded: " + Math.round(avg));

        scanner.close();
    }
}
