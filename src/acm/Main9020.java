package acm;

import java.util.*;
import java.io.*;

public class Main9020 {
	static ArrayList<Integer> lst = new ArrayList<>(Collections.nCopies(300000, 0));
	// arraylist assign
	static ArrayList<Integer> save = new ArrayList<>();

	static void arith() {
		lst.set(1, 1);
		for (int i = 2; i <= 250000; i++) {
			if (lst.get(i) == 0)
				for (int f = i + i; f <= 250000; f += i) {
					lst.set(f, 1);
				}
		}
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		arith();
		int tc = Integer.parseInt(st.nextToken());
		for(int i = 0;i<tc;i++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st1.nextToken());
			
			for(int f = a/2;f>=2;f--) {
				if(lst.get(f) == 0 && lst.get(a-f) == 0) {
					System.out.println(f +" "+ (a-f));
					break;
				}
			}
		}
	}
}
