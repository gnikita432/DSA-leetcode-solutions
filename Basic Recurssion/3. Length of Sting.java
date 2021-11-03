// https://www.geeksforgeeks.org/program-for-length-of-a-string-using-recursion/

 private static int recLen(String str)
    {
 
        // if we reach at the end of the string
        if (str.equals(""))
            return 0;
        else
            return recLen(str.substring(1)) + 1;
    }

// Time Complexity : O(n) 
// Auxiliary Space : O(n) for recursion call stack.
 