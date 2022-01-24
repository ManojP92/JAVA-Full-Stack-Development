package com.firstprgm;

import java.util.Scanner;

public class TypeCasting {
public static void main(String[] args) {
			System.out.println("Implicit type casting");
	char a='Z';
	System.out.println("a is "+a);
	int b=a;
	System.out.println("value od b is "+b);
float c=a;
System.out.println("c is "+c);
double e=a;
System.out.println("e is "+e);
double g=456.7654;
System.out.println("Explicit type casting");
int f= (int)g;
System.out.println("f is an integer which is representing a double as f= "+f);
double x=90.2;
char y= (char) x;
System.out.println("y= "+y);
}
}
