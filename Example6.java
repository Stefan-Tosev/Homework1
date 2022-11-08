package org.example;

import java.util.Scanner;

public class Example6{
    public static void main(String[] args) {

        // initialize the scanner
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");

        // This method reads the number provided using keyboard
        int day = scan.nextInt();


        switch (day)
        {
            case 1: System.out.println("The weekday is Monday");break;
            case 2: System.out.println("TThe weekday is Tuesday");break;
            case 3: System.out.println("The weekday is Wednesday");break;
            case 4: System.out.println("The weekday is Thursday");break;
            case 5: System.out.println("The weekday is Friday");break;
            case 6: System.out.println("The weekday is Saturday");break;
            case 7: System.out.println("The weekday is Sunday");break;
            default: System.out.println ("Invalid weekday"); break;

        }
}
}

