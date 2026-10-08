package part05;
import java.util.Random;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=3518s
//        rewatch 58:38–68:28 for the Math class and Random
//
// In-class exercise — we do this together in class. Not graded, but commit it.
// The README (In-class exercise) has the steps and the output to match.

public class InClass {
    public static void main(String[] args) {

        // STEP 1 — we type the rover trip report together, here.
        Random random = new Random();
        double east = 3;
        double north = 4;
        double usage = 12.6;


        double distance = Math.sqrt(east * east + north * north);
        double lLeg = Math.max(east, north);
        int batRounded = (int) Math.round(usage);
        double batRoundUp = Math.ceil(usage);
        int r = random.nextInt(5) + 1;

        System.out.println("Distance: " + distance + " meters");
        System.out.println("Farther leg: " + lLeg);
        System.out.println("Battery used, rounded: " + batRounded + "%");
        System.out.println("Battery used, rounded up: " + batRoundUp + "%");
        System.out.println("Rocks found: " + r);







        // STEP 2 — fix the bugs. Each line below has ONE mistake.
        // Move ONE line at a time above the /* line, so Java sees it.
        // Read the red error. Fix it. Run it. Then do the next line.

        double root = Math.sqrt(16);
        double big = Math.max(3, 7);
        double whole = Math.sqrt(25);

    }
}
