package acm;

import java.util.*;
import java.io.*;
import java.lang.*;

public class Main1152 {
	static List lst = new ArrayList();

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		int cnt = 0; 
		Boolean bol=false;
		for(int i = 0;i<str.length();i++) {
			if(str.charAt(i) != ' ')
				bol = true;
			if(str.charAt(i) == ' ' && bol == true) {
				cnt++;
				bol = false;
			}
		}
		if(cnt == 0 && bol == true)
			System.out.println(1);
		else if(cnt == 0 && bol == false)
			System.out.println(0);
		else if(bol == false)
			System.out.println(cnt);
		else if(bol == true)
			System.out.println(cnt+1);
	}
}
