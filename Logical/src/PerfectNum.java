import java.util.Scanner;

class PerfectNum {
    public static void main(String[] args) {
        int num,i,sum=0;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number : ");
        num=sc.nextInt();

        for(i=1;i<=num;i++){
            if(num%i==0){
                System.out.println(" "+i);
                sum=sum+i;
            }
        }
        System.out.println("Sum is :"+sum);

        if(sum==num){
            System.out.println(num+" is a Perfect number");
        }
        else{
            System.out.println(num+" is not a Perfect number");
        }
    }
}