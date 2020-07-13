package acm;

import java.io.*;
import java.util.*;

public class Main2742 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
	
		for(int i =a;i>=1;i--) {
			System.out.println(i);
		}
	}
}
