import java.util.Scanner;

public class Pow2 {
    public static void main(String args[]){
        int flag=0;
        int n;
        System.err.println("Enter the number : ");
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();
        if(n>0 && (n & (n-1))==0){
            flag=1;
        }
        if(flag==1){
            System.out.println("It is power of TWO");
        }else{
            System.out.println("It is not a power of TWO");
        }
    }
}
