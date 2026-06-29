package FAQs;
// public class PrimeNumbers {
//     public static void findPrimes(int start, int end){
//         System.out.println("Prime numbers between "+start+" to "+end+" :");
//         for(int i=start; i<=end; i++){
//             if (!(i<=1||i%2==0 || i%3==0 || i%5==0 || i%7==0)) System.out.print(i+" ");
//         }
//     }

//     public static void main(String[] args){
//         findPrimes(0, 100);
//     }
// }


public class PrimeNumbers {
    // Helper method to check if a single number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true; // 2 is the only even prime
        if (n % 2 == 0) return false; // Exclude all other even numbers
        
        // Check odd numbers up to the square root of n
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void findPrimes(int start, int end) {
        System.out.println("Prime numbers between " + start + " to " + end + " :");
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        findPrimes(0, 100);
    }
}
