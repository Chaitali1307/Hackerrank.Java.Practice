package com.strings.reverse;

import java.io.*;
import java.util.*;

public class StringReverseTest {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String B = "";
        int N = A.length()-1;
        for(int i = N; i >=0; i--)
        {
            B = B + A.charAt(i);
        }
        if(A.equals(B))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
        
    }
}
