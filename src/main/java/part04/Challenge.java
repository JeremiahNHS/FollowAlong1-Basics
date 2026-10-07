package part04;
import javax.swing.JOptionPane;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=3191s
//        rewatch 53:11–58:10 for JOptionPane, and 48:08–52:25 for the math
// Guide: GUIDE.md in this folder
//
// SECTION D — Challenge. A tip calculator with pop-up windows. The README lists the rules.
//
// There is no main method here yet. Typing it is part of the challenge.
/* JEREMIAH FAUSTIN:
Tip Calculator with pop-up boxes
 */
public class Challenge {
    public static void main(String[] args){
        double cost = Double.parseDouble(JOptionPane.showInputDialog(null, "Cost of meal?"));
        int tipPercent = Integer.parseInt(JOptionPane.showInputDialog(null, "Tip percent?"));
        int people = Integer.parseInt(JOptionPane.showInputDialog(null, "How many people?"));

        double tip = cost * (double)(tipPercent) / 100;
        double total = cost + tip;
        double splitBill = total / people;
        int split = (int) total / people;
        int remaining = (int) total % split;

        System.out.println("Tip: $" + tip);
        System.out.println("Total: $" + total);
        System.out.println("Each person pays $" + splitBill);
        System.out.println("If everyone pays $" + split + ", you are still $" + remaining + " short");




    }

}
