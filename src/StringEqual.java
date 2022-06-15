import java.util.Scanner;

public class StringEqual {

    public static  void main (String[]arg){
        String S1,S2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entering First String");
        S1=sc.nextLine();
        System.out.println("Entering 2nd String");
        S2=sc.nextLine();
        if(S1.equals(S2))
           System.out.println("Strings Are Equal");
        else
            System.out.println("Strings are not Equal");
    }
}
