class Question2{
public static void main(String[] args){
    int n=123456;
    int Sum=0;
    while(n>0){
        int digit=n%10;
        Sum+=digit;
        n=n/10;

    }
System.out.println(Sum);
}
}