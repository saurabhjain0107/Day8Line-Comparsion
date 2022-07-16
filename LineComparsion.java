package com.bridgelabz;

import java.util.Scanner;

public class LineComparsion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float x1,y1,x2,y2;

        System.out.println("Enter x1 y1 x2 y2 of line one: ");
        x1 = scanner.nextFloat();
        y1 = scanner.nextFloat();
        x2 = scanner.nextFloat();
        y2 = scanner.nextFloat();

        double length1 = Math.sqrt( Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2) );

        System.out.println("Enter x1 y1 x2 y2 of line two: ");
        x1 = scanner.nextFloat();
        y1 = scanner.nextFloat();
        x2 = scanner.nextFloat();
        y2 = scanner.nextFloat();

        double length2 = Math.sqrt( Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2) );

        if (length1==length2){
            System.out.println("Both the lines are equal in length. ");
        }else
            System.out.println("Both the lines are not equal in length. ");
    }
}
