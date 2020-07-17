package acm;

import java.util.*;
import java.io.*;

public class Main2750 {
	static List lst = new ArrayList();

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		
		for(int i = 0;i<n;i++) {
			StringTokenizer st1 = new StringTokenizer(br.readLine());
			lst.add(Integer.parseInt(st1.nextToken()));
		}
		Collections.sort(lst);
		
		for(int i = 0;i<lst.size();i++) {
			System.out.print(lst.get(i)+" ");
		}
	}
}
