package acm;

import java.util.*;
import java.io.*;

// EOF MIN MAX
public class Main2562 {
	static int[] arr = new int[9];
	static List lst = new ArrayList();

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int i = 0; i < 9; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			lst.add(Integer.parseInt(st.nextToken()));
		}
		int max_ = (int) Collections.max(lst);
		System.out.println(max_);
		System.out.println(lst.indexOf(max_)+1);
	}
}
