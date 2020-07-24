package acm;

import java.util.*;
import java.io.*;

public class Main2822 {
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
		for (int i = 1; i <= 8; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr.add(Pair.of(Integer.parseInt(st.nextToken()), i));
		}
		Collections.sort(arr, new Comparator<Pair>() {
			@Override
			public int compare(Pair a, Pair b) {
				return (a.left < b.left) ? -1 : 1;
			}
		});
		ArrayList<Integer> tmp = new ArrayList<>();
		int sum = 0;
		for (int i = 3; i < 8; i++) {
			sum+=arr.get(i).left;
			tmp.add(arr.get(i).right);
		}
		System.out.println(sum);
		Collections.sort(tmp);
		for(int i = 0;i<tmp.size();i++)
			bw.write(String.valueOf(tmp.get(i))+" ");
		bw.flush();
	}
}