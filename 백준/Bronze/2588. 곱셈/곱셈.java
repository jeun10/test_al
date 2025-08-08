import java.util.Scanner;

public class Main    {
    
    public static void main(String args[])    {
        
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
        int b = sc.nextInt();
        int c = b;
        int mul = 0;
        
        for(int i=1;i<=3;i++){
            
        	if(i!=3) {

            	 mul = b%10;
            }
            else {
            	 mul = b;
            }
            
            System.out.println(a*mul);
            b = b/10;
        }
 
        System.out.println(a*c);
    }
}