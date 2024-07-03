import java.util.Scanner;
 
public class Main {
   public static void main(String args[]){
String word;
		String[] array_word;
		
		int wordlen;
		int flag=1;
		
		Scanner sc = new Scanner(System.in);
		word=sc.next();
		array_word=word.split("");
		
		wordlen=word.length();

		
		for(int i=0;i<wordlen/2;i++) {
			Object e1=array_word[i];
			Object e2=array_word[wordlen-(i+1)];
			
			if(e1.equals(e2))
			{
				flag=1;
				
			}
			else {
				flag=0;
				break;
			}
		}
		
		System.out.println(flag);
   }
}