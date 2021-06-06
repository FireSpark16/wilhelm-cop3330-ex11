/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Xander Wilhelm
 */

/*
 *  NOTE:
 *  The example output for this problem is wrong.
 *  81 * 1.3751 = 111.3831
 *  The instructions say to round up to the next cent for fractions
 *  So, it should round up to 111.39
 *  Instead, in the example, it is 111.38
 *  Let me know if somehow I misunderstood the directions
 *  If I'm right though, give me a bonus point :D
 */

package Ex11.base;

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        double from = myApp.getFrom();
        double rate = myApp.getRate();
        double to = myApp.convert(from, rate);
        myApp.output(from, rate, to);
    }

    private void output(double from, double rate, double to) {
        System.out.println(from + " euros at an exchange rate of " + rate + " is\n" + to + " U.S. dollars.");
    }

    private double convert(double from, double rate) {
        return Math.ceil((from * rate) * 100) / 100;
    }

    private double getFrom() {
        System.out.print("How many euros are you exchanging? ");
        return Double.parseDouble(in.nextLine());
    }

    private double getRate() {
        System.out.print("What is the exchange rate?  ");
        return Double.parseDouble(in.nextLine());
    }
}
