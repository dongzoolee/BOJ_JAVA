package acm;

import java.util.*;
import java.io.*;

public class Main11720 {
	static ArrayList<Integer> lst = new ArrayList<>();
	static ArrayList<Integer> save = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
	
		int n = Integer.parseInt(st.nextToken());
		long sum = 0;
		String str = br.readLine();
		for(int i = 0;i<str.length();i++)
			sum+=str.charAt(i)-'0';
		System.out.println(sum);
	}
}
