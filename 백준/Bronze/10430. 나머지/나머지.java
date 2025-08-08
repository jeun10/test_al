import java.util.Scanner;

public class Main    {
    
    public static void main(String args[])    {
        
        Scanner scn = new Scanner(System.in);
        
        long A = scn.nextInt();
        long B = scn.nextInt();
        long C = scn.nextInt();
        
        System.out.println((A+B)%C);
        System.out.println(((A%C)+(B%C))%C);
        System.out.println((A*B)%C);
        System.out.println(((A%C)*(B%C))%C);

    }
 
}