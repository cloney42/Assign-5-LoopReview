/*___________________________________________________________
 Name: Ryan Porter
 Assignment: Assignment 5
 Period 7
 Date: 10/16/15
 Course: AP Computer Science
 _____________________________________________________________
 */

import java.applet.AudioClip;
import java.util.Scanner;

public class DoubleVerifier {

    private Scanner keyboard;
    private double low, high;
    private boolean highInc, lowInc;
    private AudioClip errorSnd;

    public DoubleVerifier(Scanner sc, double lo, boolean loInc, double hi, boolean hiInc, AudioClip eSnd) {
        keyboard = sc;
        low = lo;
        lowInc = loInc;
        high = hi;
        highInc = hiInc;
        errorSnd = eSnd;
    }

    public double readAndVerify() {
        double num = 0;
        while (true) {
            while (true) {
                try {
                    num = keyboard.nextDouble();
                    break;
                } catch (Exception e) {
                    System.out.println("--------------------------");
                    System.out.println("ERROR: Bad Character");
                    System.out.println("--------------------------");
                    errorSnd.play();
                    System.out.println("Try again: ");
                } finally {
                    keyboard.nextLine();
                }
            }

            if (lowInc == true && highInc == true) {
                if (num >= low && num <= high) {
                    return num;
                }
            }
            if (lowInc == false && highInc == true) {
                if (num > low && num <= high) {
                    return num;
                }
            }
            if (lowInc == true && highInc == false) {
                if (num >= low && num < high) {
                    return num;
                }
            }
            if (lowInc == false && highInc == false) {
                if (num > low && num < high) {
                    return num;
                }
            }
            System.out.println("--------------------------");
            System.out.println("ERROR: Out of bounds.");
            System.out.println("--------------------------");
            errorSnd.play();
            System.out.println("Try again: ");

        }
    }

}
