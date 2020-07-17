package acm;

import java.util.*;
import java.io.*;
import java.lang.*;

public class Main1427 {
	static List lst = new ArrayList();

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), nlen = (int)Math.log10(n)+1;
		
		while(n!=0) {
			lst.add(n%10);
			n/=10;
		}
		Collections.sort(lst, Collections.reverseOrder());
		for(int i = 0;i<lst.size();i++) {
			System.out.print(lst.get(i));
		}
	}
}
