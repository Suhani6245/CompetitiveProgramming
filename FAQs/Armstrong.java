package FAQs;
//also called narcissist number

public class Armstrong {
    public static int countDigits(int num){
        int temp = num;
        int count=0;
        while(temp!=0){
            count++;
            temp/=10;
        }

        return count;
    }

    public static void checkArmstrong(int num){
        int len = countDigits(num);
        int temp = num;
        int sum = 0;
        while(temp!=0){
            int rem = temp%10;
            sum+=Math.pow(rem, len);
            temp/=10;
        }

        if(sum==num){
            System.out.println(num + " is an Armstrong number.");
        } else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }

    public static void ArmstrongInARange(int start, int end){
        System.out.println("Armstrong numbers in the range "+start+" to "+end+": ");
        for(int i=start; i<=end; i++){
            int len = countDigits(i);
            int temp = i;
            int sum = 0;
            while(temp!=0){
                int rem = temp%10;
                sum+=Math.pow(rem, len);
                temp/=10;
            }

            if(sum==i) System.out.println(i);
        }
    }
    public static void main(String[] args){
        // checkArmstrong(370);
        // checkArmstrong(371);
        // checkArmstrong(407);
        // checkArmstrong(100);
        ArmstrongInARange(1, 500);
    }
}
