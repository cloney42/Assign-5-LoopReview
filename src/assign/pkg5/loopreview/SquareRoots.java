/*___________________________________________________________
Name: Ryan Porter
Assignment: Assignment 5
Period 7
Date: 10/16/15
Course: AP Computer Science
_____________________________________________________________
*/
package assign.pkg5.loopreview;
public class SquareRoots {
    public static void main(String[] args) {
        int counter = 1;
        double num = 1;
        while(counter <= 1000){
            System.out.print(counter);
            num = Math.sqrt(counter);
            System.out.print("\t"+num+"\n");
            counter++;
        }
    }
}
