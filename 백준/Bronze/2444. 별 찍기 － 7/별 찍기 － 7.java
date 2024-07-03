import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner sc= new Scanner(System.in);
		
		num= sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			for(int k=(num-i);k>0;k--) {
				System.out.print(" ");
			}
			for (int j=0;j<i+(i-1);j++) {
				
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		for(int i=num-1;i>0;i--) {
			for(int j=0;j<(num-i);j++) {
				System.out.print(" ");
			}
			for (int k=i+(i-1);k>0;k--) {
				
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		
		
	}

}