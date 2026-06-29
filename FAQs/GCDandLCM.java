package FAQs;
public class GCDandLCM {
    public static int gcd(int num1,int num2){
        while(num2!=0){
            int temp = num2;
            num2 = num1%num2;
            num1=temp;
        }
        return num1;
    }

    public static int lcm(int num1, int num2){
        return (num1*num2)/gcd(num1,num2);
    }

    public static void main(String[] args){
        System.out.println("GCD of 10 and 17 is "+gcd(10,17));
        System.out.println("LCM of 10 and 17 is "+lcm(10,17));
    }
}
