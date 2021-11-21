// Arrange Buildings

// Dp Tabulation Approach

import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {

    Scanner scn = new Scanner(System.in);
    long n = scn.nextInt();

    int prevbuilding = 1;
    int prevspace = 1;

    for (int i = 2; i <= n; i++) {
      int newbuilding = prevspace;
      int newspace = prevspace + prevbuilding;

      prevspace = newspace;
      prevbuilding = newbuilding;
    }
    long total = prevspace + prevbuilding;
    System.out.println(total * total);
  }

}
// Time Complexity : O(n)
// Space Complexity : O(1)
