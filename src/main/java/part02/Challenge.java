package part02;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=1743s
//        rewatch 29:00–35:00 for every data type
// Guide: GUIDE.md in this folder, steps 4–10
//
// SECTION D — Challenge. A video game character card. The README lists the rules.
//
// There is no main method here yet. Typing it is part of the challenge.
/*
Jeremiah Faustin

===== CHARACTER CARD =====
Name:  Nine Tail Fox
Level: 99
Gold: 999999999999999
Health: 95.25
Speed: 4.95
Flies: false
Rank: S
 */
public class Challenge {
    public static void main(String[] args){
        String name;
        name = "Nine Tail Fox";
        int level = 99;
        long gold = 999999999999999L;
        float health = 95.25f;
        double speed = 4.95;
        boolean flies = false;
        char rank = 'S';

        System.out.println("===== CHARACTER CARD =====");
        System.out.println("Name:\t" + name);
        System.out.println("Level:\t" + level);
        System.out.println("Gold:\t" + gold);
        System.out.println("Health: " + health);
        System.out.println("Speed:\t" + speed);
        System.out.println("Flies:\t" + flies);
        System.out.println("Rank:\t" + rank);







    }
}
