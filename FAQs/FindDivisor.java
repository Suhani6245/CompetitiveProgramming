package FAQs;
public class FindDivisor {

    public static void findDivisor(int num) {
        System.out.println("Divisors of " + num + " are: ");
        // for (int i = 1; i <= num; i++) {
        //     if (num % i == 0) {
        //         System.out.print(i + " ");
        //     }
        // }

        for(int i=1; i<=Math.sqrt(num);i++){
            if(num%i==0) {
                System.out.println(i);
                if(i!=num/i) System.out.println(num/i);
            }

        }
    }
    public static void main(String[] args) {
        findDivisor(36);
        findDivisor(10);
    }
}
