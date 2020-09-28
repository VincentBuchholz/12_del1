package com.company;
import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        // Henter spillernes navne
        Scanner input = new Scanner(System.in);
        String playerOne, playerTwo;
        System.out.print("Player 1 enter name: ");
        playerOne = input.next();
        System.out.print("Player 2 enter name: ");
        playerTwo = input.next();

        //System.out.print(playerOne + " " + playerTwo);

        //Laver to "terninger"
        Random rand = new Random();

        int die1, die2, sum, x, y;
        die1 = 0;
        die2 = 0;
        sum = die1 + die2;
        x=0;
        y=0;

        //System.out.print(terning1 + " " + terning2 + " " + sum);
        int oldScorePlayer1, oldScorePlayer2, newScoreplayer1, newScorePlayer2;
        oldScorePlayer1 = 0;
        oldScorePlayer2 = 0;


        //Her er selve spillet
        while (true) {

            do {
                System.out.print(playerOne + " It's your turn, type roll to roll the dice: ");
                String roll1 = input.next();

                if (roll1.contentEquals("roll")) {
                    die1 = rand.nextInt(6) + 1;
                    die2 = rand.nextInt(6) + 1;


                    if (die1 == 1 && die2 == 1) {
                        oldScorePlayer1 = 0;
                        newScoreplayer1 = 0;
                        System.out.println("Die 1: " + die1);
                        System.out.println("Die 2: " + die2);
                        System.out.println("You rolled two one's, your score is now: 0");

                    } else {
                        newScoreplayer1 = oldScorePlayer1 + die1 + die2;
                        oldScorePlayer1 = newScoreplayer1;
                        System.out.println("Die 1: " + die1);
                        System.out.println("Die 2: " + die2);
                        System.out.println("Score: " + newScoreplayer1);
                    }
                    if (die1 == 6 && die2 == 6) {
                        x ++;


                    } else {
                        x = 0;
                    }
                    if (x == 2) {
                        System.out.println("You rolled a double 6 twice in a row!");
                        break;
                    }



                    if (die1 == die2) {
                        System.out.println("You rolled the same number and get another turn");
                    }


                }
            } while (die1 == die2) ;

            if (oldScorePlayer1 >= 40) {
                System.out.print("Congratulations " + playerOne + " you win");
                break;
            }
            if (x == 2) {
                System.out.print("Congratulations " + playerOne + " you win");
                break;
            }


            do {
                System.out.print(playerTwo + " It's your turn, type roll to roll the dice: ");
                String roll2 = input.next();

                if (roll2.contentEquals("roll")) {
                    die1 = rand.nextInt(6) + 1;
                    die2 = rand.nextInt(6) + 1;


                    if (die1 == 1 && die2 == 1) {
                        oldScorePlayer2 = 0;
                        newScorePlayer2 = 0;
                        System.out.println("Die 1: " + die1);
                        System.out.println("Die 2: " + die2);
                        System.out.println("You rolled two one's, your score is now: 0");

                    } else {
                        newScorePlayer2 = oldScorePlayer2 + die1 + die2;
                        oldScorePlayer2 = newScorePlayer2;
                        System.out.println("Die 1: " + die1);
                        System.out.println("Die 2: " + die2);
                        System.out.println("Score: " + newScorePlayer2);
                    }
                    if (die1 == 6 && die2 == 6) {
                        y++;


                    } else {
                        y = 0;
                    }
                    if (y == 2) {
                        System.out.println("You rolled a double 6 twice in a row!");
                        break;
                    }

                    if (die1 == die2) {
                        System.out.println("You rolled the same number and get another turn");
                    }

                }
            } while (die1 == die2);


            if (oldScorePlayer2 >= 40) {
                System.out.print("Congratulations " + playerTwo + " you win");
                break;
            }
        if (y == 2) {
            System.out.print("Congratulations " + playerTwo + " you win");
            break;
        }

        }

    }
}



                                                                                                                     