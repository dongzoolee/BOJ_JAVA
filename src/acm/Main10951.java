package acm;

import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.lang.*;

public class Main10951 {
	static List lst = new ArrayList();

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		while(true) {
			String str = br.readLine();
			if(str == null) return;
			StringTokenizer st = new StringTokenizer(str);
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			System.out.println(a+b);
		}
	}
}
