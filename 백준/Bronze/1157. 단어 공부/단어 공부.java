import java.util.Scanner;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word;
		Scanner sc= new Scanner(System.in);
		String qu="?";
		
		word= sc.next();
		word= word.toUpperCase();
		
		String[] arr=word.split("");
		int[] count = new int[26];
		Arrays.fill(count,0);
		
		
		for(int i=0;i<word.length();i++) {
			int a=(int)word.charAt(i)-65;
			count[a]=count[a]+1;
		}
				
		int max_word=0;
		int max_num=0;
		int check=0;
		
		for(int i=0;i<26;i++) {
			if(max_num<count[i]) {
				max_word=i;
				max_num=count[i];
			}
		}
		
		for(int i=0;i<26;i++) {
			if(max_num==count[i]) {
				check++;
			}
		}
		if(check>=2) {
			System.out.println(qu);
		}
		else {
			System.out.println((char)(max_word+65));

		}
	}

}
