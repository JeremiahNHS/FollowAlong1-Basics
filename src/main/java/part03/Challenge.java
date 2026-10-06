package part03;
import java.util.Scanner;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=2365s
//        rewatch 39:25–47:00 for Scanner, and 43:34 for the nextInt trap
// Guide: GUIDE.md in this folder, steps 5–11
//
// SECTION D — Challenge. Mad Libs. The README lists the rules.
//
// There is no main method here yet. Typing it is part of the challenge.
/* Jeremiah Faustin
Story title: The Royal Heist
 */
public class Challenge {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name a detective:");
        String detective = scanner.nextLine();

        System.out.println("Name a suspect:");
        String sus = scanner.nextLine();

        System.out.println("Pick a whole number:");
        int num = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Pick a pastry:");
        String food = scanner.nextLine();

        System.out.println(detective + " arrived at the royal bakery after " + num + " golden pastries vanished into thin air.");
        System.out.println("The only clue left behind at the crime scene was a single crumb of " + food + " resting next to a calling card signed by " + sus + ".");

        String temp = detective;
        detective = sus;
        sus = temp;
        System.out.println("Plot twist: The royal guards arrested " + sus + " on the spot, while " + detective + " solved the case and claimed the reward!");



    }

}
