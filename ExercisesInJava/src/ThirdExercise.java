import java.util.Scanner;

public class ThirdExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int number = sc.nextInt();

        if(number > 0 && number < 1000){
            int firstDigit = number % 10;
            int remainingNumber = number / 10;
            int secondDigit = remainingNumber % 10;
            remainingNumber = remainingNumber / 10;
            int thirdDigit = remainingNumber % 10;
            remainingNumber = remainingNumber / 10;

            int sum = firstDigit + secondDigit + thirdDigit;

            System.out.println("Result: "+sum);
        }
    }
}
