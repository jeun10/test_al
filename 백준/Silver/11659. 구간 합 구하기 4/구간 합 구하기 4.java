
import java.io.*;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int size = Integer.parseInt(st.nextToken());
		int repeat = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[size];
		int[] sum = new int[size+1];
		int[] result = new int[repeat];
		st = new StringTokenizer(br.readLine());
		sum[0]=0;
		for(int i=0;i<size;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			sum[i+1] = sum[i]+arr[i];
		}

		
		for(int i=0; i< repeat ; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			
			result[i] = sum[end] - sum[start-1];
		}
		for(int i : result) {
			bw.write(String.valueOf(i)+"\n");

		}
		
		bw.flush();
		bw.close();
		br.close();
		
	}

}
