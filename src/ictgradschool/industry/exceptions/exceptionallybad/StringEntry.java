package ictgradschool.industry.exceptions.exceptionallybad;

import java.util.Scanner;

public class StringEntry {


    public StringEntry() {
    }

    private void start() {

        String userString = "";
        while (userString.length()==0 || userString.length()>100) {
            try {
                userString = getUserInput();
                checkLength(userString);
            } catch (ExceedMaxStringLengthException e) {
                System.out.println(e.getMessage());
            }
        }

        String[] words=getWords(userString);

        try{
            areValidWords(words);
            getInitials(words);
        }catch (InvalidWordException e){
            System.out.print("Error: "+e);
        }


    }



    private String getUserInput() {
        String uInput;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter something: ");
        uInput = sc.nextLine();

        return uInput;
    }

    private void checkLength(String userstring) throws ExceedMaxStringLengthException{
        if (userstring.length()>100){
            throw new ExceedMaxStringLengthException("Entry must not exceed 100 characters");
        }
    }

    private String[] getWords(String userInput) {
        String workingString=userInput.trim();
        int count =0;
        int nextSpacePos=1;
        while (nextSpacePos!=-1){
            nextSpacePos=workingString.indexOf(" ");
            count++;

            workingString=workingString.substring(nextSpacePos+1);
        }

        String[] words = new String[count];
        workingString=userInput.trim()+" ";
        nextSpacePos=0;
        for (int i = 0; i < words.length; i++) {
            nextSpacePos=workingString.indexOf(" ");

            words[i]=workingString.substring(0,nextSpacePos+1).trim();
            workingString=workingString.substring(nextSpacePos+1);
        }
//        testing out printing the array just to confirm the contents.
//        System.out.println(Arrays.toString(words));
        return words;
    }

    private void areValidWords(String[] words) throws InvalidWordException {
        for (int i = 0; i <words.length ; i++) {
            for (int j = 0; j <words[i].length() ; j++) {
                if (Character.digit(words[i].charAt(j),10)>0){
                    throw new InvalidWordException("cannot have integers in words");
                }
            }
        }
        return;
    }

    private void getInitials(String[] words){
        String output="";
        for (int i = 0; i <words.length ; i++) {
            output+=words[i].charAt(0) + " ";
        }
        System.out.print("You Entered: "+output);
    }

    public static void main(String[] args) {
        StringEntry se = new StringEntry();
        se.start();
    }
}
