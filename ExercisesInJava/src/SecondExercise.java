import java.util.Scanner;

public class SecondExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Choose one of them(M or I): ");
        String choosed = sc.nextLine();

        if(choosed.equalsIgnoreCase("m")){
            System.out.print("Enter the number:");
            double meters = sc.nextDouble();

            System.out.println("Result: "+(meters / 0.0254));
        }else if(choosed.equalsIgnoreCase("i")){
            System.out.print("Enter the number:");
            double inch = sc.nextDouble();

            System.out.println("Result: "+(inch * 0.0254));
        }else{
            System.out.println("There are no option like that");
        }
    }
}
