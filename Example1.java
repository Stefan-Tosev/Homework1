package org.example;

public class Example1 {
    public static void main(String[] args) {
        int myInt = 9;
        double myDouble = 20.7;

        Scanner scan = new Scanner(System.in); // creating a scanner object
        System.out.print("Enter number  " );

        int num = scan.nextInt(); // reading the number
        //System.out.print("The number is " + num);

        if ((num<myInt)||(num>myDouble)) {
            System.out.println("the number isnt between the two numbers"); // block of code to be executed if the condition is true
        } else { System.out.println("the number is between the two numbers"); // else
        
        
    }

}
}
