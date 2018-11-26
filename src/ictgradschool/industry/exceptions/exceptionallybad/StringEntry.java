package ictgradschool.industry.exceptions.exceptionallybad;

import java.util.Scanner;

public class StringEntry {


    public StringEntry() {
    }

    private void start(){
        String userString = getUserInput();
        System.out.println(userString);

    }

    private String getUserInput() {
        String uInput;
        Scanner sc = new Scanner(System.in);
        uInput = sc.next();
        return uInput;
    }

    public static void main(String[] args) {
        StringEntry se = new StringEntry();
        se.start();
    }
}
