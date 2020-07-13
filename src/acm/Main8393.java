package acm;

import java.io.*;
import java.util.*;

public class Main8393 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken()), sum = 0;
	
		for(int i = 1;i<=a;i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
}
