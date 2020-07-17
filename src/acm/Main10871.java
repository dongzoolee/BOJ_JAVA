package acm;

import java.util.*;
import java.io.*;

public class Main10871 {
	static List lst = new ArrayList();

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n, x;
		n = Integer.parseInt(st.nextToken());
		x = Integer.parseInt(st.nextToken());

		StringTokenizer st1 = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			int a = Integer.parseInt(st1.nextToken());
			if (a < x)
				System.out.print(a + " ");
		}
	}
}
