package acm;

import java.util.*;
import java.io.*;
import java.lang.*;

public class Main2908 {
	static List lst = new ArrayList();

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
			int tmp = a%10;
			a-=tmp;
			a=a-a/100*100+a/100;
			a+=tmp*100;
			
			int tmp1 = b%10;
			b-=tmp1;
			b=b-b/100*100+b/100;
			b+=tmp1*100;
		
			System.out.println(Math.max(a, b));
	}
}
