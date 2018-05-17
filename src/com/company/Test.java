package com.company;

import java.util.*;

/**
 * Created by agangwar on 18/1/18.
 */
class Test {
    public static void main(String args[]) {

        int[] solutionArray = {0, 0, 0, 1, 1, 1, 6, 7};
        int n = 1;

        while (n <= 100) {
            shuffleArray(solutionArray);

            for (int i = 0; i < solutionArray.length; i++) {
                System.out.print(solutionArray[i] + " ");
            }
            System.out.println();
            n++;
        }

    }


    // Implementing Fisher–Yates shuffle
    static void shuffleArray(int[] ar) {
        // If running on Java 6 or older, use `new Random()` on RHS here
        Random rnd = new Random();
        for (int i = ar.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            int a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }

    }

}