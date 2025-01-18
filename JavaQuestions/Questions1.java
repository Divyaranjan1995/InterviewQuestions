package JavaQuestions;

import java.util.ArrayList;
import java.util.List;

//Interview Questions

public class Questions1{

    public static void main(String args[]){

        System.out.println("Hello World");

        System.out.println("-----------------------------");

        removeDuplicateWords("My name is is Divya Divya ranjan padhiary.");

        System.out.println(revString("Divyaranjan"));

        System.out.println("-----------------------------");

        revPartOfString("My name is Sradha", "Sradha");
    }

    //Java program to remove duplicate words from given sentence
    public static void removeDuplicateWords(String str){

        String strArr[] = str.split("\\s+");
        List<String> uniqueStr = new ArrayList<String>();

        String removedDup = "";

        for(int i=0; i<strArr.length; i++){

            if(!uniqueStr.contains(strArr[i])){
                uniqueStr.add(strArr[i]);
            }

        }

        for(int i=0; i<uniqueStr.size(); i++)
        {
            removedDup = removedDup+uniqueStr.get(i).toString() + " ";
        }

        System.out.println(removedDup);

    }

    //Java program to reverse a string;
    public static String revString(String str){

        String reverseStr = "";
        for(int i=str.length()-1; i>=0; i--)
        {
            reverseStr = reverseStr+ str.charAt(i);
        }
        return reverseStr;
    }

    //Java program to reverse a part of String.
    public static void revPartOfString(String str, String partStr){

        String strArr[] = str.split("\\s+");
        String revPartOfStringIs = "";

        for(int i =0; i<strArr.length; i++){

            if(partStr.equals(strArr[i])){
                revPartOfStringIs = revPartOfStringIs + revString(partStr);
            }else
            {
                revPartOfStringIs = revPartOfStringIs + strArr[i] + " ";
            }

        }

        System.out.println(revPartOfStringIs);
    }
}