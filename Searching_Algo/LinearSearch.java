package Searching_Algo;

import java.util.*;
public class LinearSearch {
    //searches for key in array and counts the number of occurances of key and index of that occurance
    public static void searchOccurances(int arr[], int key){
        if(arr.length==0){
            System.out.println("Empty array passed");
            return;
        }
        int count=0;
        ArrayList<Integer> ind = new ArrayList<>();

        for(int i=0; i<arr.length; i++){
            if(arr[i]==key){
                count++;
                ind.add(i);
            }
        }
        System.out.printf("No of occurances of "+key+" is "+count+ " at indexes : ");
        for(int i=0; i<ind.size(); i++){
            System.out.printf(ind.get(i)+" ");
        }
    }

    //searchs for key in arr
    public static void linearSearch(int arr[], int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==key){
                System.out.println("Key found at index: "+i);
                return;
            }
        }
        System.out.println("Key not found");
    }
    public static void main(String[] args){
        int arr[] = {10, 20, 30, 40, 50,30,30};
        int key = 30;
        //linear search
        linearSearch(arr, key);
        linearSearch(arr,100);
        //occurances count + occurance index 
        searchOccurances(arr, key);
    }
}
