package acm;

import java.util.*;
import java.io.*;

public class Main10773 {
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
	static Stack<Integer> stk=new Stack<>();
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		for(int i = 0;i<n;i++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st1.nextToken());
			if(a == 0) {
				stk.pop();
			}
			else {
				stk.add(a);
			}
		}
		int sum = stk.stream().mapToInt(Integer::intValue).sum();
		System.out.println(sum);
	}
}