import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /** this program receive number from the user and return few checks on this number. at the first step, the program return two prime numbers that their connection equal to the
         * user's number. at the second step, the program return the 2 smallest numbers that their subtraction bring the user's number. in the third step, the program count
         * all the prime numbers between 2 to the user's number. in the forth step, the program divided the user's number into prime decomposition and print them.  the program
         * compute the program's runtime and print this. in the end the program print my ID.
         */
        System.out.print("please enter a even number:");// ask for number from the user
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        long time = System.currentTimeMillis();//start to count the time of the progress
        int a = 0;
        int a1 = 0;
        int b = 0;
        int c = 0;
        int d = 2;
            for (int i = 3; i < number; i = i + 2) {// loop that find 2 prime numbers that their connection equal to the user's number
                if ( isPrime(i)) {
                    a1 = i;
                    if(isPrime(number - a1)) {
                        a = number - a1;
                    }
                }
                if(number == a + a1) {
                    System.out.println(number + "=" + a + "+" + a1);
                    break;
                }
            }
        for (int i = 3; i < number; i = i + 2) { //loop that bring the two smallest numbers that their subtraction equal to the user's number
            if (isPrime(i)) {
                b = number + i;
                if (isPrime(b) && number == b - i) {
                    System.out.println(number + "=" + b + "-" + i);
                    break;
                }
            }

        }
        for (int i = 3; i < number; i = i + 2) { // calculate how many prime number there is between 2 to number
            if (isPrime(i)) {
                c++;
            }
        }
        System.out.println(c + " prime numbers in [" + 2 + "," + number + ")");
        System.out.print(number + "=" + 2);
        number = number / 2;
        while (number != 1){ // loop that break the number into prime decomposition
            if (isPrime(d) && number % d == 0) {
                System.out.print("*" + d);
                number = number / d;
            }
            else
                d++;
        }
        System.out.println();
        System.out.println("Time: " + (System.currentTimeMillis() - time) / 1000.0 + " seconds"); //print the runtime of the program. the number represented in second so he divided by 1000.
        System.out.println("my ID is 211884077");
    }

    public static boolean isPrime(int number) { //outside action that check if number is prime or not
        boolean isPrime = false;
        if (number == 2)
            return true;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
