package acm;

import java.util.*;
import java.io.*;

public class Main2577 {
	static long[] chk = new long[10];

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st1 = new StringTokenizer(br.readLine());
		long a = Long.parseLong(st1.nextToken());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		long b = Long.parseLong(st2.nextToken());
		StringTokenizer st3 = new StringTokenizer(br.readLine());
		long c = Long.parseLong(st3.nextToken());
		long tmp = a*b*c;
		while (tmp != 0) {
			chk[(int) (tmp % 10)]++;
			tmp /= 10;
		}
		for(int i = 0;i<10;i++)
			System.out.println(chk[i]);
	}
}
