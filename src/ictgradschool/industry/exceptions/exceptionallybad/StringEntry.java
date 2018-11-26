package ictgradschool.industry.exceptions.exceptionallybad;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringEntry {


    public StringEntry() {
    }

    private void start(){
        String characterstuff=getUserInput();
        List wordList = getWords(characterstuff);
        System.out.println(wordList);

    }

    private List getWords(String uInput) {
        int nextSpaceNum;
        String word;
        int count=0;
        List wordList = new ArrayList();
        while(uInput.length()>0){
            nextSpaceNum = uInput.indexOf(" ");
            word = uInput.substring(0,nextSpaceNum);
            wordList.add(count,word);
            uInput=uInput.substring(nextSpaceNum);
            count++;
        }
        return wordList;
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
