import java.util.Scanner;
class Homework3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        double marks = sc.nextDouble();

        System.out.print("Enter attendance percentage: ");
        double attendance = sc.nextDouble();

        String result = (marks >= 40 && attendance >= 75)
                ? "Pass"
                : "Fail";

        System.out.println(result);

        sc.close();
    }
}
 

