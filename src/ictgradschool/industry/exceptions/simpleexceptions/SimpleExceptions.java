package ictgradschool.industry.exceptions.simpleexceptions;

import java.util.Scanner;


public class SimpleExceptions {
    public static void main(String[] args) {
        SimpleExceptions exceptions = new SimpleExceptions();

        //Question 1 & 2
        exceptions.handlingException();

        //Question3
        //exceptions.Question3();

        //Question4
        //exceptions.Question4();
    }

    /**
     * The following tries to divide using two user input numbers, but is
     * prone to error.
     */
    public void handlingException() {
        Scanner sc = new Scanner(System.in);
        int num1 = 0;
        while (true) {
            System.out.print("Enter the first number: ");
            String str1 = sc.next();

            try {
                num1 = Integer.parseInt(str1);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Please enter an integer");
            }
        }

    // Output the result
    while (true) {
        System.out.print("Enter the second number: ");
        String str2 = sc.next();
        int num2 =0;
        try {
            num2 = Integer.parseInt(str2);
            if(num2!=0){
                System.out.println("The division of " + num1 + " over " + num2 + " is " + (num1 / num2) + "\n");
                break;
            } else {
                System.out.println("div by 0");
            }
        }catch (NumberFormatException e) {
            System.out.println("Please enter an integer");
        }



}
    }

    public void Question3() {
        //Write some Java code which throws a StringIndexOutOfBoundsException
    }

    public void Question4() {
        //Write some Java code which throws a ArrayIndexOutOfBoundsException
    }
}