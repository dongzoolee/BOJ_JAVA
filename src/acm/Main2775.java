package acm;

import java.io.*;
import java.util.*;

public class Main2775 {
	static int[][] arr = new int[15][15];

	public static void ipju() {
		for (int i = 0; i < 15; i++) {
			for (int f = 1; f < 15; f++) {
				if (i == 0)
					arr[i][f] = f;
				else
					for (int h = 1; h <= f; h++)
						arr[i][f] += arr[i-1][h];
			}
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		ipju();
		for (int i = 0; i < a; i++) {
			StringTokenizer sti = new StringTokenizer(br.readLine());
			int k = Integer.parseInt(sti.nextToken());
			StringTokenizer stiz = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(stiz.nextToken());

			System.out.println(arr[k][n]);
		}
	}
}
