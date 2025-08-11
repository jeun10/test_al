
import java.io.*;

import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        int money = sc.nextInt();
	        sc.nextLine();
	        String juga = sc.nextLine();
	        
	        int jMoney = money;
	        int sMoney = money;
	        int jJusic=0;
	        int sJusic=0;
	        
	        int up = 0, down = 0;
	        
	        int[] arr = Stream.of(juga.split(" ")).mapToInt(Integer::parseInt).toArray();
	        
	        for(int i=0;i<arr.length;i++) {
	        	
	        	if(i < arr.length-1) {
	        		if(arr[i]<arr[i+1]) {
	        			up +=1;
	        			down = 0;
	        		}
	        		else if(arr[i]>arr[i+1]) {
	        			up=0;
	        			down+=1;
	        		}
	        		else {
	        			up=0;
	        			down=0;
	        		}
	        		
	        		if(up==3) {
		        		sMoney += arr[i]*sJusic;
		        	}
		        	if(down==3) {
		        		sJusic = sMoney/arr[i];
		        		sMoney = sMoney%arr[i];
		        	}
		        	if(jMoney>=arr[i]) {
		        		jJusic = jMoney/arr[i];
		        		jMoney = jMoney%arr[i];
		        	}
	        	} else if(i == arr.length-1) {
	        		sMoney = sMoney + (sJusic*arr[i]);
	        		jMoney = jMoney + (jJusic*arr[i]);
	        		
	        	}
	        	
	        }
	        if(sMoney==jMoney) {
	        	System.out.println("SAMESAME");
	        }
	        else if(jMoney > sMoney) {
	        	System.out.println("BNP");

	        }
	        else if(jMoney<sMoney) {
	        	System.out.println("TIMING");

	        }

	    }

}
