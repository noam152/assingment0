import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.print("please enter a even number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        long time = System.currentTimeMillis();
        int a = 0;
        int a1 = 0;
        int b = 0;
        int c = 0;
        int d = 2;
            for (int i = 3; i < number; i = i + 2) {
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
        for (int i = 3; i < number; i = i + 2) {
            if (isPrime(i)) {
                b = number + i;
                if (isPrime(b) && number == b - i) {
                    System.out.println(number + "=" + b + "-" + i);
                    break;
                }
            }

        }
        for (int i = 3; i < number; i = i + 2) {
            if (isPrime(i)) {
                c++;
            }
        }
        System.out.println(c + " prime numbers in [" + 2 + "," + number + ")");
        System.out.print(number + "=" + 2);
        number = number / 2;
        while (number != 1){
            if (isPrime(d) && number % d == 0) {
                System.out.print("*" + d);
                number = number / d;
            }
            else
                d++;
        }
        long second = (System.currentTimeMillis() - time )/ 1000;
        System.out.println();
        System.out.println(second + " seconds");
        System.out.println("my ID is 211884077");
    }

    public static boolean isPrime(int number) {
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
