import java.util.Scanner;

public class MonthlyPayment {
    public static void main(String[] args) {
        int principle,years,r,Rate,payment=0;
        System.out.println("Calculate monthly payments");
        int n=12;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Principle amt:");
        principle= sc.nextInt();
        System.out.println("Enter rate per cent");
        Rate= sc.nextInt();
        r=Rate/(12*100);
        System.out.println(r);
        payment=principle*r/(1-(1+r)^(-n));
        System.out.println(payment);

    }
}
