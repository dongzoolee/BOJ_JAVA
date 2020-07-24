package acm;

import java.util.*;
import java.io.*;

public class Main3009 {
	
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

	static ArrayList<Integer> x = new ArrayList<>();
	static ArrayList<Integer> y = new ArrayList<>();
	static ArrayList<Pair> arr = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < 3; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr.add(Pair.of(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken())));
			// x.add(Integer.parseInt(st.nextToken()));
			// y.add(Integer.parseInt(st.nextToken()));
		}
		
			boolean[] chk = new boolean[3];
			boolean[] chk2 = new boolean[3];
			for (int f = 0; f < 2; f++) {
				for (int h = f + 1; h < 3; h++) {
					if (arr.get(f).left == arr.get(h).left) {
						chk[f] = chk[h] = true;
					}
					if(arr.get(f).right == arr.get(h).right) {
						// int == primitive 자료형 & 산술연산이 가능
						chk2[f] = chk2[h] = true;
					}
				}
			}
			for(int z = 0;z<3;z++)
				if(chk[z]==false)
			System.out.print(arr.get(z).left + " ");
			for(int z = 0;z<3;z++)
				if(chk2[z]==false)
			System.out.print(arr.get(z).right);
		}
	}