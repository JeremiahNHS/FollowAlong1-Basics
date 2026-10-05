package part02;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=1743s
//        rewatch 29:00–35:00 if you forget how to make a variable of each type
// Guide: GUIDE.md in this folder, steps 4–10
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.

public class Stretch {
    public static void main(String[] args){
        /* MY GUESS:
        7
        7.0
        a + b
        a: 7
        77
        14!
        A
        true
         */
        int a = 7;
        double b = 7;
        System.out.println(a);
        System.out.println(b);
        System.out.println("a + b");
        System.out.println("a: " + a);
        System.out.println("" + a + a);
        System.out.println(a + a + "!");
        char c = 'A';
        System.out.println(c);
        boolean on = true;
        System.out.println(on);

        //B1
        String name = "Jeremiah Faustin";
        int age = 20;
        double gpa = 3.8;
        boolean commuter = false;
        System.out.println("Name " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
        System.out.println("Commuter: " + commuter);

        //B2
        char initial = 'J';
        int classes = 5;
        double credits = 16;
        boolean hasJob = false;
        System.out.println(initial + " takes " + classes + " classes in Computer Science, for " + credits + " credit hours. Has a job: " + hasJob);

        //B3
        String city = "Dover";
        long people = 4000000000L;
        char grade = 'B';
        float temp = 72.5f;
        System.out.println(city + " " + people + " " + grade + " " + temp);







    }
}
