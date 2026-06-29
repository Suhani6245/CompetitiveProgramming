package FAQs;
public class PalindromeMethods {
    //half reverse method - most optimal
    public static void halfReverse(int num){
        if(num<0 || num%10==0 && num!=0) {
            System.out.println("Not palindrome"); 
            return;
        }
        int reversed = 0;
        while(num>reversed){
            int rem = num%10;
            reversed = reversed*10 + rem;
            num/=10;
        }
        if(num==reversed || num==reversed/10){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }


    }

    //full reverse method
    public static void fullReverse(int num){
        int revNum = 0;
        int temp = num;
        while(temp!=0){
            int rem=temp%10;
            revNum = revNum*10+rem;
            temp/=10;
        }
        if(revNum==num) System.out.println("Palindrome");
        else System.out.println("Not Palindrome");
    }

    //string palindrome- full reverse method
    public static void fullReverse(String str){
        String revStr="";
        char[] arr = str.toCharArray();
        for(int i=arr.length-1; i>=0; i--){
            revStr+=arr[i];
        }
        //removing case sensitivity
        if((revStr.toLowerCase()).equals(str.toLowerCase())) System.out.println("String is palindrome");
        else System.out.println("String is not palindrome");
    }

    public static void main(String[] args){
        halfReverse(121);
        halfReverse(-121);
        halfReverse(10);
        fullReverse(12321);
        fullReverse(123321);
        fullReverse("Hello");
        fullReverse("MOm");
    }
}
