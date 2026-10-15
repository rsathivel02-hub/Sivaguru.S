import java.util.Scanner;
class Question1 {
    public static void main(String[] args){
        Scanner Mikasa=new Scanner(System.in);
        System.out.println("Enter your name");
        String user_name=Mikasa.nextLine();
        System.out.println("Enter the password");
        String password=Mikasa.nextLine();
        if((user_name.equals("Mikasa"))&&(password.equals("Nothing"))){
            System.out.println("You logged in Successfully");
        }else{
            System.out.println("Login Failed");
            
        }
                Mikasa.close();

    }
    
}
