import java.io.*;

import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int top = -1;

		int stackSize = sc.nextInt();
		int[] arr = new int[stackSize];
		int[] result = new int[stackSize];
		int j=0;
		sc.nextLine();
		
		for (int i = 0; i < stackSize; i++) {
			String input = sc.nextLine();
			String[] chArr = input.split(" ");
			if (chArr.length == 2) {
				if (chArr[0].equals("push")) {
					if (top < stackSize) {
						top++;
						arr[top] = Integer.parseInt(chArr[1]);
					}
				}
			} else {
				switch (chArr[0]) {
				case "pop":
					if(top>-1) {
						result[j] = arr[top];
						top--;
						
					}else {
						result[j] =-1;
					}
					j++;
					break;
					
				case "size":
					result[j]=top+1;
					j++;
					break;
				case "empty":
					if(top>-1) {
						result[j]=0;
					}else {
						result[j]=1;
					}
					j++;
					break;
				case "top":
					if(top>-1) {
						result[j]=arr[top];
					}
					else {
						result[j]=-1;
					}
					j++;
					break;					

				}
			}
		}
		
		for(int i=0;i<j;i++) {
			System.out.println(result[i]);
		}

	}

}
