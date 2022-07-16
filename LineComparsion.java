package com.bridgelabz;

import java.util.Scanner;

import static java.lang.Double.compare;

public class LineComparsion {
    public static void main(String[] args) {

        lineComparison();

    }
    public static void lineComparison(){
        Scanner scanner = new Scanner(System.in);
        float x1,y1,x2,y2;

        System.out.println("Enter x1 y1 x2 y2 of line one: ");
        x1 = scanner.nextFloat();
        y1 = scanner.nextFloat();
        x2 = scanner.nextFloat();
        y2 = scanner.nextFloat();
        double l1 = Math.sqrt( Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2) );

        System.out.println("Enter x1 y1 x2 y2 of line two: ");
        x1 = scanner.nextFloat();
        y1 = scanner.nextFloat();
        x2 = scanner.nextFloat();
        y2 = scanner.nextFloat();
        double l2 = Math.sqrt( Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2) );

        int x = compare(l1, l2);
        System.out.println(x);

        if (x==0){
            System.out.println("Both the lines are equal in length. ");
        }else if (x<0)
            System.out.println("line one is smaller than line two. ");
        else
            System.out.println("line one is larger than line two. ");
    }
}
