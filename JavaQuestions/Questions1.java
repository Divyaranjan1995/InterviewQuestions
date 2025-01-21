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

        System.out.println("-----------------------------");
        
        System.out.println(areOccurrencesEqual("mmmccmcccccmcccccmmmcmccmmccccmmmcmmcmcmcmcmmmmmmmmmcccmmcmmmcmmcmcmcmmmcmmmcmmccccmcmccmmcmccmmmcmmccccmcmmccmcmmcccmmcmmcmmcmccmmccmcmmcmmccmmccmcccmmcccmmcccccmcmmmmcmccmmmmmmcmmccmccmmcccccccccmcccmmmccmmccccmmcmcmcmcmmcmmcmcmcmccccmmcccmmmccmmcmmmcmmmcmccccmcmcccmmccmm"));

        System.out.println("-----------------------------");

        int arr1[]={1,2,5,5,4,4,4,8,9,9};
        removeDuplicateFromIntArray(arr1);

        System.out.println("-----------------------------");

        convertStringToInteger("iiii");

        System.out.println("-----------------------------");

        System.out.println(getLucky("zz", 2));
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

    //Check if All Characters Have Equal Number of Occurrences
    public static boolean areOccurrencesEqual(String s) {

        int strArr[] = new int[256];

        if(s.length()==1){
            return true;
        }

        for(int i=0;i<s.length(); i++){

            char c = s.charAt(i);
            strArr[c]++;
        }

        List<Integer> occur = new ArrayList<Integer>();

        for(int i=0; i<strArr.length;i++){
            if(strArr[i] >=1){
                occur.add(strArr[i]);
            }
        }

        boolean flag=false;

        if(occur.size()==1){
            return true;
        }

        for(int i=0; i<occur.size()-1; i++){

            System.out.println(occur);

            System.out.println(occur.get(i) + " : " + occur.get(i+1));
            if(occur.get(i).equals(occur.get(i+1))){
                flag=true;
            }
            else{
                return false;
            }
        }

        return flag;


        
    }

    //Remove duplicates from an integer array
    public static void removeDuplicateFromIntArray(int arr[]){
        List<Integer> occur = new ArrayList<Integer>();

        for(int i=0; i<arr.length-1;i++){
            if(!occur.contains(arr[i])){
                occur.add(arr[i]);
            }
        }

        System.out.println(occur);
    }

    //Convert String s into an integer by replacing each letter with its position in the alphabet (i.e. replace 'a' with 1, 'b' with 2, ..., 'z' with 26).
    public static void convertStringToInteger(String str){
        String intStr="";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            int code = Character.toLowerCase(ch) - 'a' +1;
            intStr= intStr+code;
        }
        System.out.println(intStr);

        int k=1;

        int i=0;

        String s1=intStr;

        while(i<k){

            int value=0;

            for(int j=0; j<s1.length();j++){
                char c = s1.charAt(j);
                String cc = Character.toString(c);
                value =value+Integer.parseInt(cc);
            }

            s1 = String.valueOf(value);

            i++;

        }

        System.out.println(s1);
    }

    //leetcode String program = 1945. Sum of Digits of String After Convert

    public static int getLucky(String s, int k){
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            sb.append(c-'a'+1);
        }

        while(k>0){
            int temp=0;
            for(char c : sb.toString().toCharArray()){
                temp = temp + c-'0';
            }
            sb = new StringBuilder(String.valueOf(temp));
            k--;
        }

        return Integer.parseInt(sb.toString());
    }
}