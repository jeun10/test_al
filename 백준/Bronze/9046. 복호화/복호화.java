
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();
        
        int n = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < n; i++) {
            String line = br.readLine(); // 한 줄 입력
            sb.append(line+"\n");
        }
        
        String sbtostr = sb.toString();
        
        for(int i=0;i<sbtostr.length();i++) {
        	if(sbtostr.charAt(i)!='\n') {
            	if(map.containsKey(sbtostr.charAt(i))) {
            		map.put(sbtostr.charAt(i),((Integer)map.get(sbtostr.charAt(i)))+1);
            	}
            	else {
                	map.put(sbtostr.charAt(i), 1);
            	}

        	}
        	else {
        		findMax(map);
        	}

        	
        }
        
	}
public static void findMax(Map<Character, Integer> m) {
		int cnt = 0;
		int maxValue = 0;
		char maxKey = '.';
		
		for(Character key : m.keySet()) {
			if(key != ' ' && maxValue< m.get(key)) {
				maxValue= m.get(key);
				maxKey = key;
			}
		}
		
		for(Character key : m.keySet()) {
			if(key != ' ' && maxValue == m.get(key) && maxKey != key) {
				cnt++;
			}
		}
		
		if(cnt == 0) {
			System.out.println(maxKey);
		}
		else {
			System.out.println("?");
		}
		m.clear();
	}
}
