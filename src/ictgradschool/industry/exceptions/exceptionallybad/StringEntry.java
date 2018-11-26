package ictgradschool.industry.exceptions.exceptionallybad;

import java.util.Scanner;

public class StringEntry {


    public StringEntry() {
    }

    private void start(){
        String userString = getUserInput();
        System.out.println(userString);
        checkLength(userString);

    }

    private String getUserInput() {
        String uInput;
        Scanner sc = new Scanner(System.in);
        uInput = sc.next();
        return uInput;
    }

    private void checkLength(String userstring) throws ExceedMaxStringLengthException{
        if (userstring.length()>100){
            throw new ExceedMaxStringLengthException("Entery must not exceed 100 characters");
        }
    }

    public static void main(String[] args) {
        StringEntry se = new StringEntry();
        se.start();
    }
}
