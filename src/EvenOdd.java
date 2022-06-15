import java.util.Scanner;

public class EvenOdd {

    public static void main(String[]arg){
        Scanner input= new Scanner(System.in);
        int num;
        System.out.println("Enter A NUm");
        num=input.nextInt();
        if(num%2==0)
            System.out.println("Enter Num Is Even");
            else
            System.out.println("Enter Num is ODD");

        }

    }

