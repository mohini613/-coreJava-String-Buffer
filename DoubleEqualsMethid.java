package com.StringBuffer1;

public class DoubleEqualsMethid {

    public static void main(String[] args) {
        // Create StringBuffer objects
        StringBuffer s1 = new StringBuffer("hello");
        StringBuffer s2 = new StringBuffer("hello");
        StringBuffer s3 = s1;
        
        // Using equals() method to compare contents
        System.out.println("Using equals() method:");
        System.out.println (s1.equals(s2)); // Should print true
        System.out.println(s1.equals(s3)); // Should print true
        System.out.println(s2.equals(s3)); // Should print true
        
        // Using == operator to compare references
        System.out.println("\nUsing == operator:");
        System.out.println(s1 == s2); // Should print false because s1 and s2 are different objects
        System.out.println(s1 == s3); // Should print true because s1 and s3 refer to the same object
        System.out.println(s2 == s3); // Should print false because s2 and s3 are different objects
    }
}
