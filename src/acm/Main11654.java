package acm;

import java.util.*;
import java.io.*;
import java.lang.*;

public class Main11654 {
static List lst = new ArrayList();
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String c = st.nextToken();
		
		System.out.println((int)c.charAt(0));
	}
}
