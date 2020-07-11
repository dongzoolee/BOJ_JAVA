package acm;

import java.io.*;
import java.math.*;
import java.util.*;

public class Main10872 {
	static long[] arr = new long[91];
	static int n;
	
	static void fibo(int n) {
		arr[0]=0; arr[1]=1; arr[2]=1;
		
		for(int i = 3;i<=n;i++) {
			arr[i]=arr[i-1]+arr[i-2];
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		
		fibo(n);
		System.out.println(arr[n]);
	}
}
