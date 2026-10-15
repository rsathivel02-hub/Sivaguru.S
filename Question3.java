import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose an operation:");
        System.out.println("1.Add");
        System.out.println("2.Subtract");
        System.out.println("3.Multiply");
        System.out.println("4.Divide");
        System.out.print("Enter your choice:");
        int choice = sc.nextInt();
          System.out.print("Enter the first number: ");
        double first = sc.nextDouble();
          System.out.print("Enter the second number: ");
        double second = sc.nextDouble();
          switch (choice) {
            case 1:
                System.out.println("Result: "+(first+second));
                break;
            case 2:
                System.out.println("Result: "+(first-second));
                break;
            case 3:
                System.out.println("Result: "+(first*second));
                break;
            case 4:
                if (second==0) {
                    System.out.println("Cannot divide by zero.");
                } else {
                    System.out.println("Result: "+(first/second));
                }
                break;
            default:
                System.out.println("Invalid input");
        }

        sc.close();
    }
}