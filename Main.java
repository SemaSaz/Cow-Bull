package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sam = new Scanner(System.in);
        System.out.println("Selected language");
        String en = "English - 1";
        String rus = "Русский - 2";
        String der = "Deutsch - 3";
        System.out.println(en + " " + rus + " " + der);
        System.out.println("Enter the language number");

        int lang = sam.nextInt();
        int a = 100;
        int b = 999;

        int cow = 0;
        int bulls = 0;


        if (lang == 2){
            int rusrandom;
            System.out.println(" Здравствуйте, вас приветствует игра " + "Быки & Коровы");

            System.out.println(" Выберите количество попыток");
            int calr = sam.nextInt();
            int chetr = 0;

            while(true){
                rusrandom = a + (int) (Math.random() * b);
                if (rusrandom <= 999 && rusrandom >= 100){

                    break;
                }



            }
            System.out.println("Игра начилась, напоминаю нужно ввести трёхзначное число, так же вы играете с компухтером");
            while(chetr < calr) {
                int firdr = rusrandom / 100;
                int secdr = (rusrandom / 10) - (firdr * 10);
                int thidr = rusrandom % 100- secdr * 10;


                int digitr = sam.nextInt();
                int fdr = digitr / 100;
                int sdr = (digitr / 10) - (fdr * 10);
                int tdr = digitr % 100- sdr * 10;
                int co = 0;
                int bu = 0;
                if (rusrandom == digitr){
                    System.out.println("Вы выиграли, я просто похлопаю!!!");
                    System.out.println("Для этого вам понадобилось всего " + calr + " попыток");
                    break;
                }
                if (fdr == firdr){
                    bu++;
                }
                if (sdr == secdr){
                    bu++;
                }
                if (tdr == thidr){
                    bu++;
                }
                if (fdr == secdr){
                    co++;
                }
                if (fdr == thidr){
                    co++;
                }
                if (sdr == firdr){
                    co++;
                }
                if (sdr == thidr){
                    co++;
                }
                if(tdr == firdr){
                    co++;
                }
                if (tdr == secdr){
                    co++;
                }
                cow += co;
                bulls += bu;
                System.out.println("За этот круг у вас прибавилось " + co + " коров " + bu + " быков");
                //System.out.println("Итого у вас " + cow + " коров " + bulls + " быков");


                chetr += 1;
            }
            if (chetr == calr){
                System.out.println("Увы, я вас выигал)");
            }

        }





        //cfjeiy6yjut5mgggggggggggggggggggggggggggggggggggggggglggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggg

        if (lang == 1){
            System.out.println(" Hello, welcome to the game Bulls & Cows");
            int rusrandom;
            System.out.println(" Select the number of attempts");
            int calr = sam.nextInt();
            int chetr = 0;

            while(true){
                rusrandom = a + (int) (Math.random() * b);
                if (rusrandom <= 999 && rusrandom >= 100){

                    break;
                }



            }
            System.out.println("The game has started, I remind you to enter a three-digit number, you also play with the computer");
            while(chetr < calr) {
                int firdr = rusrandom / 100;
                int secdr = (rusrandom / 10) - (firdr * 10);
                int thidr = rusrandom % 100- secdr * 10;


                int digitr = sam.nextInt();
                int fdr = digitr / 100;
                int sdr = (digitr / 10) - (fdr * 10);
                int tdr = digitr % 100- sdr * 10;
                int co = 0;
                int bu = 0;
                if (rusrandom == digitr){
                    System.out.println("You won, I'll just clap!!!");
                    System.out.println("To do this, you need only " + calr + " attempts");
                    break;
                }
                if (fdr == firdr){
                    bu++;
                }
                if (sdr == secdr){
                    bu++;
                }
                if (tdr == thidr){
                    bu++;
                }
                if (fdr == secdr){
                    co++;
                }
                if (fdr == thidr){
                    co++;
                }
                if (sdr == firdr){
                    co++;
                }
                if (sdr == thidr){
                    co++;
                }
                if(tdr == firdr){
                    co++;
                }
                if (tdr == secdr){
                    co++;
                }
                cow += co;
                bulls += bu;
                System.out.println("During this round you have added" + co + " Cows " + bu + " Bulls");
                // System.out.println("Total you have " + cow + " Cows " + bulls + " Bulls");


                chetr += 1;
            }
            if (chetr == calr - 1){
                System.out.println("Alas, I won you)");

            }
        }









        if (lang == 3){
            System.out.println(" Hallo, willkommen Spiel Stiere & Kühe");
            int rusrandom;
            System.out.println(" Ach, ich habe dich gewonnen)");
            int calr = sam.nextInt();
            int chetr = 0;

            while(true){
                rusrandom = a + (int) (Math.random() * b);
                if (rusrandom <= 999 && rusrandom >= 100){

                    break;
                }



            }
            System.out.println("Das Spiel hat begonnen, ich erinnere Sie daran, eine dreistellige Zahl eingeben, so spielen Sie mit dem Computer");
            while(chetr < calr) {
                int firdr = rusrandom / 100;
                int secdr = (rusrandom / 10) - (firdr * 10);
                int thidr = rusrandom % 100- secdr * 10;


                int digitr = sam.nextInt();
                int fdr = digitr / 100;
                int sdr = (digitr / 10) - (fdr * 10);
                int tdr = digitr % 100- sdr * 10;
                int co = 0;
                int bu = 0;
                if (rusrandom == digitr){
                    System.out.println("Du hast gewonnen, ich Klatsche einfach!!!");
                    System.out.println("Um dies zu tun, müssen Sie nur " + calr + " Versuch");
                    break;
                }
                if (fdr == firdr){
                    bu++;
                }
                if (sdr == secdr){
                    bu++;
                }
                if (tdr == thidr){
                    bu++;
                }
                if (fdr == secdr){
                    co++;
                }
                if (fdr == thidr){
                    co++;
                }
                if (sdr == firdr){
                    co++;
                }
                if (sdr == thidr){
                    co++;
                }
                if(tdr == firdr){
                    co++;
                }
                if (tdr == secdr){
                    co++;
                }
                cow += co;
                bulls += bu;
                System.out.println("Während dieser Runde haben Sie Hinzugefügt" + co + " Stiere " + bu + " Kühe");
                // System.out.println("Insgesamt haben Sie " + cow + " Stiere " + bulls + " Kühe");


                chetr += 1;
            }

        }
    }
}