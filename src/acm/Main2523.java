package acm;

import java.io.*;
import java.util.*;

public class Main2523 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		
		for(int i = 1;i<=a;i++) {
			for(int f = 0;f<i;f++)
				System.out.print("*");
			System.out.print("\n");
		}
		for(int i = a-1;i>=1;i--) {
			for(int f = 0;f<i;f++)
				System.out.print("*");
			System.out.print("\n");
		}
	}
}
