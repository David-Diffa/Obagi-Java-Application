import java.util.Scanner;

public class NumberCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

                for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

                int sum6to8 = numbers[5] + numbers[6] + numbers[7];

        
        int sum4to9 = numbers[3] + numbers[4] + numbers[5] + numbers[6] + numbers[7] + numbers[8];

        
        int result = sum4to9 - sum6to8;

        
        System.out.println("(" + sum4to9 + ") - (" + sum6to8 + ") = " + result);

        scanner.close();
    }
}
		