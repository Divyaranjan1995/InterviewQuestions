package JavaQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Questions2 {

    public static void main(String[] args) {

        //How to find duplicates in Array using SORTING?
        
        int arr[] = {2,5,1,5,4,9,10,2,5};

        Arrays.sort(arr);

        List<Integer> li = new ArrayList<Integer>();

        for(int i=0; i<arr.length-1;i++){
            if(arr[i]==arr[i+1] && !li.contains(arr[i])){
                li.add(arr[i]);
            }
        }

        System.out.println(li);

        System.out.println("--------------------------");

        //without using ArrayList

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                System.out.println(arr[i]);

                while(i<arr.length-1 && arr[i]==arr[i+1]){
                    i++;
                }
            }
        }

        System.out.println("--------------------------");

        //using hashSet

        HashSet<Integer> unique = new HashSet<Integer>();
        HashSet<Integer> duplicates = new HashSet<Integer>();

        for(int a : arr){
            if(!unique.add(a)){
                duplicates.add(a);
            }
        }

        System.out.println(duplicates);

        for(int a : arr){
            boolean flag = unique.add(a);
            System.out.println(flag + " : " + a);
        }

        System.out.println("---------------------------");

        //using hashMap

        HashMap<Integer,Integer> dupCount = new HashMap<Integer,Integer>();

        for(int a : arr){

            dupCount.put(a,dupCount.getOrDefault(a,0)+1);
        }

        System.out.println(dupCount);

        for(HashMap.Entry<Integer,Integer> entry : dupCount.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey());
            }
        }

        //Sorting the array using bubble sort
        int temp;
        for(int i=0;i<arr.length; i++){
            for(int j=0;j<arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    temp=arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = arr[j];
                }
            }
        }




    }
    
}
