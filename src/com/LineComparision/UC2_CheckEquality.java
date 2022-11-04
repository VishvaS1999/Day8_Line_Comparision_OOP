package com.LineComparision;

import java.util.Scanner;

public class UC2_CheckEquality
{
    public static int x1, x2,x3,x4, y1, y2,y3,y4;
    public static void length()
    {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Co-ordinates of x1 and y1 : ");
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        System.out.println("Enter the Co-ordinates of x2 and y2 : ");
        x2 = sc.nextInt();
        y2 = sc.nextInt();
        Double len = Math.sqrt((x2 - x1) * (x2 - x1)  +  (y2 - y1) * (y2 - y1));
        System.out.println("Enter the Co-ordinates of x3 and y3 : ");
        x3 = sc.nextInt();
        y3 = sc.nextInt();
        System.out.println("Enter the Co-ordinates of x4 and y4 : ");
        x4 = sc.nextInt();
        y4 = sc.nextInt();
        Double len1 = Math.sqrt((x4 - x3) * (x4 - x3)  +  (y4 - y3) * (y4 - y3));
        System.out.println("Length of the given Line is : " + len + " units" );
        System.out.println("Length of the given Line is : " + len1 + " units" );

        //System.out.println(len.equals(len1));
        if(len.equals(len1))
            System.out.println("both lines are equal");
        else
            System.out.println("not equal");
    }
    public static void main(String[] args)
    {
        length();

    }
}
