package JavaQuestions;

public class Questions4 {

    public static void main(String[] args) {
        
        //java program to print palindrom number from 1 to 999
        for(int i=1; i<=999; i++){
            boolean flag=checkForPalindrome(i);
            if(flag==true) System.out.println(i);
        }
        
    }

    public static boolean checkForPalindrome(int n){

        //Java program to check if the given number is Palindrome or not
        int num5=n;
        int temp5=num5;
        int temp6=temp5;
        double pow=0;
        int count1=0;

        while(temp6>0){
            temp6=temp6/10;
            count1++;
        }

        while(num5>0){
            int n5=num5%10;
            pow = pow + Math.pow(n5,count1);
            num5=num5/10;

        }

        if(pow==temp5){
            return true;
        }
        else{
            return false;
        }
    }
    
}
