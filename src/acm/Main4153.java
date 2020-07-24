package acm;

import java.util.*;
import java.io.*;

public class Main4153 {
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

		while (true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			ArrayList<Integer> arr = new ArrayList<>();
			arr.add(Integer.parseInt(st.nextToken()));
			arr.add(Integer.parseInt(st.nextToken()));
			arr.add(Integer.parseInt(st.nextToken()));
			if(arr.get(0) == 0 && arr.get(1) == 0 && arr.get(2) == 0) break;
			Collections.sort(arr);
			if (arr.get(2) * arr.get(2) == arr.get(1) * arr.get(1) + arr.get(0) * arr.get(0))
				bw.write("right\n");
			else
				bw.write("wrong\n");
		}
		bw.flush();
	}
}