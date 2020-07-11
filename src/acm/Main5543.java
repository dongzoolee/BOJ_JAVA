package acm;

import java.io.*;
import java.util.*;

public class Main5543 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			//StringTokenizer st = new StringTokenizer(br.readLine());
			int[] arr = new int[5];
			int bur_min = 3000, coke_min = 3000;
			
			for(int i = 0;i<5;i++) {
				arr[i]=Integer.parseInt(br.readLine());
				if(i <=2) {
					bur_min=Math.min(bur_min, arr[i]);
				}
				else{
					coke_min=Math.min(coke_min, arr[i]);
				}
			}
			System.out.println(bur_min+coke_min-50);
	}
}
