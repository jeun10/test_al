import java.util.Scanner;

public class Main    {
    
    public static void main(String args[])    {
        
        Scanner sc = new Scanner(System.in);
        
        int num1 = sc.nextInt();
        sc.nextLine();
        String num2= sc.nextLine();
        
        int sum = 0;
        
        for(int i = 0;i<num1;i++){
             sum += num2.charAt(i)-'0';
        }
        System.out.println(sum);


    }
 
}