package Strings;
import java.util.Arrays;

public class anagram {
    public static void main(String[] args){
        String s1 = "listen";
        String s2 = "silent";
        if(s1.length()!= s2.length()) System.out.println("Not anagram");
        else{
            char[] arr1 = s1.toCharArray();
            char[] arr2 = s2.toCharArray();
            //int count = 0;
            //this does not work for duplicate characters
            // for(char ch: arr1){
            //     for(char ch2: arr2){
            //         if(ch==ch2){
            //             count++;
            //             break;
            //         }
            //     }
            // }
            // if(count==s1.length()){
            //     System.out.println("Anagram");
            // }
            // else{
            //     System.out.println("Not anagram");
            // }

            //better approach- looks out for dublicate characters
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            if(Arrays.equals(arr1, arr2))
                System.out.println("Anagram");
            else
                System.out.println("Not Anagram");
        }
    }
}
