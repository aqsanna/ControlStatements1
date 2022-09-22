package com.company;

public class Main {

    public static void main(String[] args) {

        // find max number
        int x = 10;
        int y = -15;
        int z = 40;
        int k = 27;

        if (x >= y && x >= z) {
            System.out.println("Max number is x: " + x);
        } else if (y >= x && y >= z) {
            System.out.println("Max number is y: " + y);
        } else {
            System.out.println("Max number is z: " + z);
        }

        // find min number
        if (x <= y && x <= z) {

            System.out.println("Min number is x: " + x);
        } else if (z <= x && z <= y) {
            System.out.println("Min number is z: " + z);
        } else {
            System.out.println("Min number is y : " + y);
        }

        // find max for 4 number with ternary operator

        int maximum = x >= y ? x : y;
        maximum = maximum >= z ? maximum : z;
        maximum = maximum >= k ? maximum : k;
        System.out.println("Maximum number is : " + maximum);

        // find min for 4 number with ternary operator

        int minimum = x <= y ? x : y;
        minimum = minimum <= z ? minimum : z;
        minimum = minimum <= k ? minimum : k;
        System.out.println("Minimum number is :" + minimum);


        // triangle
        x = 10;
        y = 12;
        z = 11;
        if (x + y > z && x + z > y && y + z > x) {
            System.out.println("You can get a triangle");
        } else {
            System.out.println("You can't get a triangle");
        }

        //  weekday
        int day = 5;
        switch (day) {
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 1:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("There is no such day, write from 1 to 7");

        }

       /* int n = -10;
        while(n != 0){
            System.out.println("while n =" + n);
            n++;
        }
        System.out.println("main n =" + n);

        for (int i = 1; i < 11; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.println("i is: " + i + " J is :" + j);

            }*/


        int ii = 1;

        while (ii < 11) {
            System.out.println("ii = " + ii);
            System.out.println("+++++++++++++++++++");
                    int jj = 1;
                    while (jj < 11) {
                    System.out.println("jj = " + jj);
                    jj++;
                }
            System.out.println("+++++++++++++++++++");
                  ii++;
            }
        }
    }







