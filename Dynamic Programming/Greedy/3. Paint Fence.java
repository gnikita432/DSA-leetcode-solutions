//Paint Fence
/*
1. You are given a number n and a number k in separate lines, representing the number of fences and number of colors.
2. You are required to calculate and print the number of ways in which the fences could be painted so that not more than two consecutive  fences have same colors.

Sample Input
8
3
*/

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        
        int consi = k;
        int nonconsi = k * (k-1);
        
        for(int i=3; i<=n; i++){
            int newconsi = nonconsi;
            int newnonconsi = (nonconsi*(k-1)) + (consi*(k-1));
            consi = newconsi;
            nonconsi = newnonconsi;
        }
        System.out.println(consi+nonconsi);
    }
}
// Time Complexity : O(n)
// Space Complexity : O(1)
