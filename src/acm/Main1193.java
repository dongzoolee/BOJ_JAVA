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
				save_i=i; // save_i + 1 == ���� �и� ��
				rem = temp; // �ش� �ٿ��� ���°����
				break;
			}
		}
		
		if(save_i%2==0) {// �и� ū ������
			System.out.println(rem+"/"+(save_i+1-rem));
		}
		else { // ���� ū ������
			System.out.println((save_i+1-rem)+"/"+rem);
		}
	}
}
