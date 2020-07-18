package acm;

import java.util.*;
import java.io.*;
import java.lang.*;

public class Main2675 {
	static int[] arr = new int[26];

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		for (int i = 0; i < 26; i++)
			arr[i] = -1;

		for (int i = 0; i < str.length(); i++) {
			if (arr[str.charAt(i) - 'a'] == -1)
				arr[str.charAt(i) - 'a'] = i;
		}

		for (int i = 0; i < 26; i++)
			System.out.print(arr[i] + " ");
	}
}
