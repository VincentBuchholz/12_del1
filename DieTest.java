package com.company;
import java.util.Random;
public class DieTest {

    public static void main(String[] args) {
	int die1, die2, one, two, three, four, five, six, x, sum;
	one = 0;
	two = 0;
	three = 0;
	four = 0;
	five = 0;
	six = 0;
	x = 0;


	do {
        Random rand = new Random();
        die1 = rand.nextInt(6) + 1;
        die2 = rand.nextInt(6) + 1;
        if (die1 == 1) {
            one++;
        }
        if (die1 == 2) {
            two++;
        }
        if (die1 == 3) {
            three++;
        }
        if (die1 == 4) {
            four++;
        }
        if (die1 == 5) {
            five++;
        }
        if (die1 == 6) {
            six++;
        }
        if (die2 == 1) {
            one++;
        }
        if (die2 == 2) {
            two++;
        }
        if (die2 == 3) {
            three++;
        }
        if (die2 == 4) {
            four++;
        }
        if (die2 == 5) {
            five++;
        }
        if (die2 == 6) {
            six++;
        }
        x++;
    } while (x < 10000);
        System.out.println("One: " + one);
        System.out.println("Two: " + two);
        System.out.println("Three: " + three);
        System.out.println("Four: " + four);
        System.out.println("Five: " + five);
        System.out.println("Six: " + six);
        sum = one + two + three + four + five + six;
        //System.out.println(sum);
    }
}
