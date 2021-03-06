/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg2;

import java.util.Scanner;

/**
 *
 * @author JianLang LIN, ZiYing Guo
 * @Version 3/2/15
 */
public class Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);//import the new Scanner
        int cents, quarters, dimes, nickels, pennies, totalcoin, quarterscent, dimescent, nickelscents;
        System.out.print("Enter amount of change in cents:");//Ask for user to enter how many cents
        cents = Keyboard.nextInt();//Store the input
        if (cents >= 0) {//Currency must be positive
            quarters = (cents / 25);//Calculate numbers of Quarter
            quarterscent = quarters * 25;
            System.out.println("quarters: " + quarters + " (=" + quarterscent + ")");
            dimes = (cents % 25) / 10;//Calculate numbers of Dime
            dimescent = dimes * 10;
            System.out.println("dimes: " + dimes + "    (=" + dimescent + ")");
            nickels = ((cents % 25) % 10) / 5;//Calculate numbers of nickels
            nickelscents = nickels * 5;
            System.out.println("nickels: " + nickels + "  (=" + nickelscents + ")");
            pennies = cents - quarters * 25 - dimes * 10 - nickels * 5;//Calculate numbers of penny
            System.out.println("pennies: " + pennies + "  (=" + pennies + ")");
            totalcoin = quarters + dimes + nickels + pennies;//count numbers of coin
            System.out.println("Total Number of Coins: " + totalcoin);//Display total coins
        } else {
            System.out.println("Coin can't be negative");
        }

    }
}
