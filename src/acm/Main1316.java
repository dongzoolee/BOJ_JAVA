package acm;

import java.util.*;
import java.io.*;

public class Main1316 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int tc = Integer.parseInt(st.nextToken()), cnt = 0;
		for (int i = 0; i < tc; i++) {
			String str = br.readLine();
			boolean[] chk = new boolean[26];
			boolean isAns = true;
			chk[str.charAt(0) - 'a'] = true;
			for (int f = 1; f < str.length(); f++) {
				if (str.charAt(f) != str.charAt(f - 1)) {
					if (chk[str.charAt(f) - 'a'] == true) {
						isAns = false;
						break;
					} else
						chk[str.charAt(f) - 'a'] = true;
				}
			}
			if (isAns)
				cnt++;
		}

		System.out.println(cnt);
	}
}
