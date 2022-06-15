import java.util.Scanner;

public class Mul {
    public static void main(String[]arg){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("Multiplication table "+n+"is");
        //logic
        for(int i=1;i<=10;i++) {
            System.out.println(n+"*"+i+"="+(n*i));
        }

    }
}
