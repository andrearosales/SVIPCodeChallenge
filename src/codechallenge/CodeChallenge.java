/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codechallenge;

/**
 *
 * @author Andrea Rosales
 */
public class CodeChallenge {

    private static final int THREE = 3;
    private static final int FIVE = 5;
    private static final int END = 1000;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= END; i++) {
            if(isMultiple(i,THREE) || isMultiple(i,FIVE)){
                int doubled = i*2;
                sum += doubled;
            }
            else
                sum += i;
        }
        System.out.println("The result is " + sum);
    }

    public static boolean isMultiple(int number, int multipleOf) {
        return number % multipleOf == 0;
    }

}
