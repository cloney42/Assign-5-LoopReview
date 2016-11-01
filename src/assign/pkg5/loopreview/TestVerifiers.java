/*___________________________________________________________
Name: Ryan Porter
Assignment: Assignment 5
Period 7
Date: 10/16/15
Course: AP Computer Science
_____________________________________________________________
*/
package assign.pkg5.loopreview;

import java.applet.Applet;
import java.applet.AudioClip;
import java.util.Scanner;

public class TestVerifiers {

    static AudioClip clip1 = Applet.newAudioClip(ClassLoader.getSystemResource("sounds/move.wav"));
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        promtUser();
    }

    public static void promtUser() {

        System.out.println("Int Verifier or Double Verifier?");
        System.out.println("[1} Int, {2} Double");
        int IorD = input.nextInt();
        if (IorD != 1 && IorD != 2) {
            System.out.println("ERROR: Enter a 1 or 2");
            System.out.println("");
            promtUser();
        }
        if (IorD == 1) {
            IntVerifier dv1 = new IntVerifier(input, 1, true, 9, true, clip1);
            int y = IntVerifier.readAndVerify();
            System.out.println("y = "+y);
            if (y >= 1 && y<= 9){
                System.out.println("Works!");
            }else{
                System.out.println("Doesnt Work! :(");
            }
        }
        if (IorD == 2) {
            DoubleVerifier dv1 = new DoubleVerifier(input, 1, true, 9, false, clip1);
            double x = DoubleVerifier.readAndVerify();
            System.out.println("x = "+x);
            if (x >= 1 && x < 9){
            System.out.println("Works!");
        }else{
                System.out.println("Doesnt Work! :(");
            }
            
        }
    }
}
