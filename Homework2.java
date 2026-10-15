import java.util.Scanner;

class Homework2 {
    public static void main(String[] args)
{

 Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        String result = (number % 2 == 0 && number > 10)
                ? "Even and greater than 10"
                : "Does not meet both conditions";

        System.out.println(result);

        sc.close();
    }
}

