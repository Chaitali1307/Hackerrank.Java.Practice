package com.strings.stringsintroduction;

import java.io.*;
import java.util.*;

public class StringsTest {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length());

        int i = A.compareTo(B);
        if(i>0)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
        System.out.println(A.substring(0,1).toUpperCase()+A.substring(1)+" "+B.substring(0,1).toUpperCase()+B.substring(1));
        
    }
}

