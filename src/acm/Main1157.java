package acm;

import java.util.*;
import java.io.*;
import java.lang.*;

public class Main1157 {
	static int[] arr = new int[26];

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();

		for (int i = 0; i < str.length(); i++) {
			if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z')
				arr[str.charAt(i) - 'A']++;
			else
				arr[str.charAt(i) - 'a']++;
		}
		// Array INT MAX
		int max_ = Arrays.stream(arr).max().getAsInt();
		int save = 0, cnt = 0;
		for (int i = 0; i < 26; i++) {
			if (max_ == arr[i]) {
				save = i;
				cnt++;
			}
		}
		if (cnt >= 2)
			System.out.println("?");
		else
			System.out.println((char) (save + 'A'));
	}
}
