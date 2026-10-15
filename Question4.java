import java.util.Scanner;

class Question4 {
    public static void main(String[] args) {
        Scanner mikasa = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = mikasa.nextLine();

        System.out.println("Enter your roll number:");
        int regNo = mikasa.nextInt();

        System.out.println("Enter your age:");
        int age = mikasa.nextInt();
        mikasa.nextLine(); 

        System.out.println("Enter your department:");
        String department = mikasa.nextLine();

        System.out.println("Enter your email:");
        String email = mikasa.nextLine();

        System.out.println("\nYour details:");
        System.out.println(name);
        System.out.println(regNo);
        System.out.println(age);
        System.out.println(department);
        System.out.println(email);

        mikasa.close();
    }
}