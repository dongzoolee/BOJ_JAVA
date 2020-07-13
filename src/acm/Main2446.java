package acm;

import java.io.*;
import java.util.*;

public class Main2446 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		
		for(int i = 0;i<a;i++) {
			for(int f = 0;f<a;f++) {
				if(f%2==0)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.print("\n");
			for(int f = 0;f<a;f++) {
				if(f%2==0)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}
