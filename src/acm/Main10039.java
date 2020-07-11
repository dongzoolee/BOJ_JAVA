package acm;

import java.io.*;
import java.util.*;

public class Main10039 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			//StringTokenizer st = new StringTokenizer(br.readLine());
			int a, sum = 0;
			for(int i = 0;i<5;i++) {
				a=Integer.parseInt(br.readLine());
				if(a<40) a=40;
				sum+=a;
			}
			System.out.println(sum/5);
	}
}
