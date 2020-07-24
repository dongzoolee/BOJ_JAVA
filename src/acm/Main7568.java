package acm;

import java.util.*;
import java.io.*;

public class Main7568 {
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

	static ArrayList<Integer> arr = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		for(int i = 0;i<n;i++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			arr.add(Integer.parseInt(st1.nextToken()));
		}
		Collections.sort(arr);
		for(int i = 0;i<n;i++)
			bw.write(String.valueOf(arr.get(i))+'\n');
		bw.flush();
	}
}