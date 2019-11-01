package net.ankit.count.vally;

import java.io.IOException;
import java.util.Scanner;

public class SkipCloud {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int count = 0;
        /*for (int i =2; i<c.length; count++, i+=2)
            if (c[i]==1) i--;*/

        for (int i = 0; i < c.length - 1; i++, count++) {
            if ((i < c.length - 2) && c[i] == c[i + 1] && c[i] == c[i + 2]) {
                i++;
            } else if (c[i] != c[i + 1]) {
                i++;
            }
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        System.out.println("write number of cloud");
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];
        System.out.println("write cloud content separated by space");
        String[] cItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int cItem = Integer.parseInt(cItems[i]);
            c[i] = cItem;
        }

        System.out.println("steps Required"+ jumpingOnClouds(c));



        scanner.close();
    }
}
