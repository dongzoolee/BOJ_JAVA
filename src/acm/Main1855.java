package acm;

import java.util.*;
import java.io.*;

public class Main1855 {
	static int col;
	static String str;
	static BufferedWriter bw;

	static class Pair {
		final int left;
		final int right;

		public Pair(int left, int right) {
			this.left = left;
			this.right = right;
		}

		static Pair of(int left, int right) {
			return new Pair(left, right);
		}
	}

	static ArrayList<Pair> arr = new ArrayList<>();

	static void jjak(int n, int idx) throws IOException {
		bw.write(str.charAt((n - 1) * col + (col - 1 - idx)));
	}

	static void hol(int n, int idx) throws IOException {
		bw.write(str.charAt((n - 1) * col + idx));
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		col = Integer.parseInt(st.nextToken());
		str = br.readLine();

		for (int i = 0; i < col; i++) {
			for (int f = 1; f <= str.length() / col; f++)
				if (f % 2 == 0) {
					jjak(f, i);
				} else
					hol(f, i);
		}
		bw.flush();
	}
}