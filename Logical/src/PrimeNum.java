import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        boolean isPrime = false;
        int num,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number : ");
        num=sc.nextInt();

        i=1;
        //
        while(num/2>=i) {
            if(num%i==0) {
                isPrime = false;
                break;
            }
        }i++;

        if(isPrime){
            System.out.println(+num+" is a Prime number");
        }
        else {
            System.out.println(+num+" is a not a Prime number");
        }
    }
}