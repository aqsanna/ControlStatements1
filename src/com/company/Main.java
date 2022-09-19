package com.company;

public class Main {

    public static void main(String[] args) {

	// find max number
	 int x = 10;
	 int y = -15;
	 int z = 40;
	 int k = 27;

	 if(x >= y && x >= z){
	      System.out.println("Max number is x: " + x);
	 }
	 else if (y >= x && y >= z) {
         System.out.println("Max number is y: " + y);
	 }
	 else {
         System.out.println("Max number is z: " + z);
     }

        // find min number
       if(x <= y && x <= z){

           System.out.println("Min number is x: " + x);
       }
       else if(z <= x && z <= y){
            System.out.println("Min number is z: " + z);
       }
       else {
            System.out.println("Min number is y : " + y);
       }

       // find max for 4 number with ternary operator

        int maximum = x >= y ? x : y;
        maximum = maximum >= z ? maximum : z;
        maximum = maximum >= k ? maximum : k;
        System.out.println("Maximum number is : " +  maximum);

        // find min for 4 number with ternary operator

        int minimum = x <= y ? x : y;
        minimum = minimum <= z ? minimum : z;
        minimum = minimum <= k? minimum : k;
        System.out.println("Minimum number is :" + minimum);

        //int res = x > y ? x  : y;
        //System.out.println("res is :" + res);

        // erankyuni hashvark
        x = 10;
        y = 10;
        z = 14;
        int b = (x + y + z) / 2;
        int S = (int)Math.sqrt(b*(b-x)*(b-y)*(b-z)); // kam senc
        int M = (b - x) * (b - y);   // kam senc
        System.out.println("S = " + S);
        System.out.println("M = " + M);

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

    }
}
