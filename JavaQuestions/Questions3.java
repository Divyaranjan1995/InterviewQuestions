package JavaQuestions;

import java.util.Arrays;

public class Questions3 {

    public static void main(String[] args) {
        int arr[] = {8,2,4,5,1,3};

        int temp;
        for(int i=0;i<arr.length; i++){
            for(int j=0;j<arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    temp=arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));

        //java program to reverse a integer
        int num = 852469752;
        int rev=0;
        while(num>0){
            rev = rev * 10 + num % 10;
            num = num /10; 
        }

        System.out.println(rev);

        //Java program to Print the fibonacci series.
        int count=20;
        int n1=0,n2=1,n3;

        System.out.print(n1 + " " + n2);

        for(int i=0; i<count; i++){

            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;

        }
        System.out.println();
        System.out.println("--------------------------");

        //Java program to find factorial of an number

        int num2 =5;
        int fact=1;
        for(int i=1; i<=num2; i++){
            fact = fact *i;
        }
        System.out.println(fact);

        //Java program to print pyramid pattern

        int steps=5;
        for(int i=1;i<=steps;i++){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Java program to print sum of digits in an integer
        int num4=123456;
        int sum1=0;
        while(num4>0){
            sum1=sum1+num4%10;
            num4=num4/10;
        }

        System.out.println("-----------------------");
        System.out.println(sum1);

        System.out.println("----------------------");

        




        
    }
    
}
