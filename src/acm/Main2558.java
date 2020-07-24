package acm;

import java.util.*;
import java.io.*;

public class Main2558 {
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

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		int b = Integer.parseInt(st1.nextToken());
		int sum = a+b;
		bw.write(String.valueOf(sum));
		// bufferedwriter 쓰레기값
		bw.flush();
	}
}