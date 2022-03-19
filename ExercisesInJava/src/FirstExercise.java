import java.util.Scanner;

public class FirstExercise {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Choose one of them(F or C): ");
        String choosed = sc.nextLine();

        if(choosed.equalsIgnoreCase("c")){
            System.out.print("Enter the number:");
            double celcius = sc.nextDouble();

            System.out.println("Result: "+((celcius * 9/5) + 32));
        }else if(choosed.equalsIgnoreCase("f")){
            System.out.print("Enter the number:");
            double faranheit = sc.nextDouble();

            System.out.println("Result: "+((faranheit - 32) * 5/9));
        }else{
            System.out.println("There are no option like that");
        }
    }
}
