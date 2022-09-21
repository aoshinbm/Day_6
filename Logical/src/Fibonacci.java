import java.util.Scanner;

class Fibonacci {
    public static void main(String[] args) {
        int n, first=0, second=1, sum, next = 0 ;
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter number: ");
        n=sc.nextInt();

        System.out.println("Fibonacci series till " +n+ " are :");
        for(int i=0; i<n; i++)
        {
            sum = first+second;
            System.out.print(" "+sum);
            first=second;
            second=sum;
        }
    }
}