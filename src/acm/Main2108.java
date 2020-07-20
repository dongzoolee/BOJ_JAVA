package acm;

import java.util.*;
import java.io.*;

public class Main2108 {
	static ArrayList<Integer> lst = new ArrayList<>();
	static ArrayList<Integer> save = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		ArrayList<Integer> arr = new ArrayList<>();
		for (int i = 0; i <= 8001; i++) // arraylist는 크기 지정 불가능
			arr.add(0);
		for (int i = 0; i < n; i++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			int tmp = Integer.parseInt(st1.nextToken());
			arr.set(tmp + 4000, arr.get(tmp + 4000) + 1);
			lst.add(tmp);
		}
		
		// array value 총합구하기
		int sum = lst.stream().mapToInt(Integer::intValue).sum();
		if ((double) sum / n < 0)
			System.out.println((int) ((double) sum / n - 0.5));
		else
			System.out.println((int) ((double) sum / n + 0.5));
		Collections.sort(lst);
		System.out.println(lst.get(n / 2));
		int cnt = 1, max_ = Collections.max(arr);
		for (int i = 0; i <= 8001; i++) {
			if (arr.get(i) == max_)
				save.add(i - 4000);
		}
		if (save.size() == 1)
			System.out.println(save.get(0));
		else
			System.out.println(save.get(1));
		System.out.println(lst.get(n - 1) - lst.get(0));
	}
}
