package acm;

import java.util.*;
import java.io.*;

public class Main1002 {
	static ArrayList<Integer> lst = new ArrayList<>();
	static ArrayList<Integer> save = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int tc = Integer.parseInt(st.nextToken());

		for (int i = 0; i < tc; i++) {
			ArrayList<Double> dlst = new ArrayList<>();
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st1.nextToken());
			int y1 = Integer.parseInt(st1.nextToken());
			int r1 = Integer.parseInt(st1.nextToken());
			int x2 = Integer.parseInt(st1.nextToken());
			int y2 = Integer.parseInt(st1.nextToken());
			int r2 = Integer.parseInt(st1.nextToken());

			if(x1 == x2 && y1 == y2 && r1 == r2) {System.out.println(-1); continue;}
			// 거리구하기
			dlst.add((double) Math.pow((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2), 0.5));
			dlst.add((double) r1);
			dlst.add((double) r2);
			Collections.sort(dlst, Comparator.reverseOrder());
			if (dlst.get(0) < dlst.get(1) + dlst.get(2)) {
				System.out.println(2);
			} else if (dlst.get(0) == dlst.get(1) + dlst.get(2)) {
				System.out.println(1);
			} else
				System.out.println(0);
		}
	}
}
