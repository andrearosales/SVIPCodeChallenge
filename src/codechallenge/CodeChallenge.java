/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codechallenge;

/**
 *
 * @author Andrea Rosales Main class that is in charge of running the complete
 * program.
 */
public class CodeChallenge {

    private static final int THREE = 3;
    private static final int FIVE = 5;
    private static final int END = 1000;

    /**
     * @param args the command line arguments The main method runs a loop that
     * sums up the integer numbers. It considers if the number to sum is a
     * multiple of three or five. If it is, it doubles it and adds it to the
     * final sum.
     */
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= END; i++) {
            if (isMultiple(i, THREE) || isMultiple(i, FIVE)) {
                int doubled = i * 2;
                sum += doubled;
            } else {
                sum += i;
            }
        }
        System.out.println("The result is " + sum);
    }

    /**
     * 
     * @param number Numerator of the division
     * @param multipleOf Denominator of the division
     * @return Whether number is a multiple of multipleOf
     */
    public static boolean isMultiple(int number, int multipleOf) {
        return number % multipleOf == 0;
    }

}
