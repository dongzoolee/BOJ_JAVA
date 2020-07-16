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
			StringTokenizer sst = new StringTokenizer(br.readLine());
			int h = Integer.parseInt(sst.nextToken());
			int w = Integer.parseInt(sst.nextToken());
			int n = Integer.parseInt(sst.nextToken());

			if (n / h == 0)
				System.out.println(n % h + "01");
			else if (n % h == 0 && n / h < 10)
				System.out.println(h + "0" + n / h);
			else if (n % h == 0)
				System.out.println(h +""+ n / h);
			else if (n / h < 10)
				System.out.println(n % h + "0" + (n / h+1));
			else
				System.out.println(n % h + "" + (n / h+1));

		}

	}
}
