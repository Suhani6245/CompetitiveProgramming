public class stringTraversal {
    public static boolean isVowel(char ch){
        ch = Character.toLowerCase(ch);
        return (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u');
    }

    public static String arrayToString(char[] arr){
        String str = "";
        for(char ch: arr){
            str += ch;
        }
        return str;
    }

    public static void main(String[] args){
        String str = "Hello World";

        //using index
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();

        //using for each loop
        for(char ch: str.toCharArray()){
            System.out.print(ch+" ");
        }
        System.out.println();


        //string reversal
        char[] arr = str.toCharArray();
        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        //palindrome

        //check
    //     String str1 = "madam";
    //     char[] arr1 = str1.toCharArray();
    //     boolean check = false;
    //     char[] revArr = new char[str1.length()];
    //     for(int i=arr1.length-1; i>=0; i--){
    //         revArr[revArr.length-1-i] = str1.charAt(i);
    //     }
    //     for(char ch: str1.toCharArray()){
    //         for(char revChar: revArr){
    //             if(ch==revChar){
    //                 check = true;
    //             }
    //             else{
    //                 check = false;
    //                 break;
    //             }
    //         }
    //         if(!check){
    //             break;
    //         }
    //     }
    //     if(check){
    //         System.out.println("String is palindrome");
    //     }
    //     else{
    //         System.out.println("String is not palindrome");
    //     }

        //reverse words
        System.out.println("Reverse words in a string");
        String str2 = "hello world";
        String[] arr2 = str2.split(" ");
        String revStr = "";
        for(int i=arr2.length-1; i>=0; i--){
            revStr += arr2[i] + " ";
        }
        System.out.println("Original string: " + str2);
        System.out.println("Reversed string: " + revStr);


        //reverse vowels
        System.out.println("Reverse vowels in a string");
        String str3 = "hello";
        char[] arr3 = str3.toCharArray();
        int l=0; int r=arr3.length-1;
        while(l<r){
           if(isVowel(arr3[l]) && isVowel(arr3[r])){
                char temp = arr3[l];
                arr3[l] = arr3[r];
                arr3[r] = temp;
                l++;
                r--;
            }
            else if(!isVowel(arr3[l])){
                l++;
            }
            else if(!isVowel(arr3[r])){
                r--;
            }
        }
        System.out.println("Original string: " + str3);
        System.out.println("Reversed string: "+ arrayToString(arr3));


    }



}
