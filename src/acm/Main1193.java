package acm;

import java.io.*;
import java.util.*;

public class Main1193 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken()), temp = a, save_i, rem;
		for(int i = 1;;i++) {
			if(temp-i >0) {
				temp-=i;
			}
			else {
				save_i=i; // save_i + 1 == 분자 분모 합
				rem = temp; // 해당 줄에서 몇번째인지
				break;
			}
		}
		
		if(save_i%2==0) {// 분모 큰 순으로
			System.out.println(rem+"/"+(save_i+1-rem));
		}
		else { // 분자 큰 순으로
			System.out.println((save_i+1-rem)+"/"+rem);
		}
	}
}
