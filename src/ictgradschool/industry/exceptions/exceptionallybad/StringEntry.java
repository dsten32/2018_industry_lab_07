package ictgradschool.industry.exceptions.exceptionallybad;

import java.util.Scanner;

public class StringEntry {


    public StringEntry() {
    }

    private void start(){
        getUserInput();

    }

    private String getUserInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a strint no greater than 100 char:");
        String uInput = sc.next();
        return uInput;
    }


    public static void main(String[] args) {
        StringEntry se = new StringEntry();
        se.start();
    }
}
