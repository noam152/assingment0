import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.print("please enter a even number:");
        //long time = System.currentTimeMillis();
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int a = 0;
        System.out.println(isPrime(number));
        int [] array = new int [number];
            for (int i = 3; i < number; i = i + 2) {
                if ( isPrime(i)) {
                    array[i-3] = i;
                    if(isPrime(number-array[i-3])) {
                        a = number - array[i - 3];
                    }
                }
                if(number == a + array[i - 3]) {
                    System.out.println(number + "=" + a + "+" + array[i - 3]);
                    break;
                }
            }

        //long second = System.currentTimeMillis() - time0 / 1000;
    }

    public static boolean isPrime(int number) {
        boolean isPrime = false;
        if (number <= 1)
            return false;
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
