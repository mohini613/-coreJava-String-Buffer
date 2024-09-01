package com.StringBuffer1;

public class StringBufferExample {
//using equals method
	public static void main(String[] args) {
StringBuffer s=new StringBuffer("hello");
StringBuffer s1=new StringBuffer("hello");
StringBuffer s2=s1;
System.out.println(s2.equals(s1));
	}

}
