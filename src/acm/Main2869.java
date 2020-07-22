package acm;

import java.util.*;
import java.io.*;

public class Main2869 {
	static ArrayList<Integer> lst = new ArrayList<>();
	static ArrayList<Integer> save = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long a, b, v;
		a = Long.parseLong(st.nextToken());
		b = Long.parseLong(st.nextToken());
		v = Long.parseLong(st.nextToken());

		if (v == a)
			System.out.println(1);
		else if (v == a - b)
			System.out.println(1);
		else if ((v - a) % (a - b) == 0) {
			System.out.println((v - a) / (a - b) + 1);
		} else {
			System.out.println((v - a) / (a - b) + 2);
		}
	}
}
