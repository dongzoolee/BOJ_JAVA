package acm;

import java.util.*;
import java.io.*;

public class Main1712 {
	static ArrayList<Integer> lst = new ArrayList<>();
	static ArrayList<Integer> save = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long a, b, c;
		a = Long.parseLong(st.nextToken());
		b = Long.parseLong(st.nextToken());
		c = Long.parseLong(st.nextToken());

		if(c-b<=0)
			System.out.println(-1);
		else {
			System.out.println(a/(c-b)+1);
		}
	}
}
