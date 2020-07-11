package acm;

import java.io.*;
import java.util.*;

public class Main10817 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int arr[] = new int[3], max_ = 0;

		for (int i = 0; i < 3; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i < 3; i++)
			for (int f = 0; f < 3 - (i + 1); f++)
				if (arr[f] > arr[f + 1]) {
					int tmp = arr[f + 1];
					arr[f + 1] = arr[f];
					arr[f] = tmp;
				}
		System.out.println(arr[1]);
	}
}
