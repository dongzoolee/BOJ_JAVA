package acm;

import java.util.*;
import java.io.*;

public class Main2751 {
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
		int tc = Integer.parseInt(st.nextToken());
		for (int i = 0; i < tc; i++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			arr.add(Pair.of(Integer.parseInt(st1.nextToken()), Integer.parseInt(st1.nextToken())));
		}
		/*Collections.sort(arr, new Comparator<Pair>() {
			@Override
			public int compare(Pair a, Pair b) {
				if (a.left == b.left)
					return a.right < b.right ? -1 : 1;
				else
					return a.left < b.left ? -1 : 1;
			}
		});*/
		for(int i = 0;i<tc;i++) {
			int cnt = 0;
			for(int f = 0;f<tc;f++) {
				if(f!=i) {
					if(arr.get(i).left<arr.get(f).left && arr.get(i).right < arr.get(f).right)
						cnt++;
				}
			}
			bw.write((cnt+1)+"\n");
		}
		bw.flush();
	}
}