package acm;

import java.util.*;
import java.io.*;

public class Main8958 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int tc = Integer.parseInt(st.nextToken());
		for (int i = 0; i < tc; i++) {
			int sum = 0, adj = 0;
			String str = br.readLine();
			for (int f = 0; f < str.length(); f++) {
				if (str.charAt(f) == 'O') {
					sum += ++adj;
				} else
					adj = 0;
			}
			System.out.println(sum);
		}
	}
}
