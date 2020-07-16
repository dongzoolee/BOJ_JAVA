package boj;

import java.util.*;
import java.io.*;

public class Main10950 {
	static int n;
	static int[] arr;
	static void findmm() {	
		int min_=Integer.MAX_VALUE, max_=Integer.MIN_VALUE;
		for(int i = 0;i<n;i++){
			if(arr[i]<min_)min_=arr[i];
			if(arr[i]>max_)max_=arr[i];
		}
		System.out.print(min_ + " "+max_);
	}
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		arr = new int[n];
		StringTokenizer sst = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(sst.nextToken());
		}
		findmm();
	}
}
