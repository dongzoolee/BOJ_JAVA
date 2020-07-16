package acm;

import java.util.*;
import java.io.*;

public class Main4344 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int tc = Integer.parseInt(st.nextToken());
		for(int i = 0;i<tc;i++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st1.nextToken()), cnt = 0;
			double avg;
			
			int[] arr = new int[a];
			for(int f = 0;f<a;f++)
				arr[f] = Integer.parseInt(st1.nextToken());
			
			avg = Arrays.stream(arr).average().getAsDouble();
			int sum = Arrays.stream(arr).sum();
			double averg = sum/arr.length;
			for(int h = 0;h<arr.length;h++)
				if(averg < arr[h]) cnt++;
			
			System.out.printf("%.3f%%\n",(double)cnt/arr.length*100);
		}
			
	}
}
