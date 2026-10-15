import java.util.Scanner;
public class Project12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("payment method ");
        System.out.println("Payment methods available: 1. Cash \n"+ "2. Card \n" + "3. UPI");
        int paymentMethod=sc.nextInt();
        if(1 == paymentMethod){
            System.out.println("Cash method");
        }
        System.out.println("Enter the billing amount and customer cash");
        int billingAmount=sc.nextInt();
        System.out.println("Enter the customer cash");
        int Customercash=sc.nextInt();
        int total=billingAmount-Customercash;
        System.out.println("Total amount to be paid: " + total);
        sc.close();

    }

}
