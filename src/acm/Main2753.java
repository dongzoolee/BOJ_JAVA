package acm;

import java.util.*;

public class Main2753 {
	public static void is_yun(int yr) {
		if(yr%400 == 0 || (yr%100!=0 && yr%4==0)) {
			System.out.println(1);
		}
		else {
			System.out.println(0);
		}
	}
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	is_yun(a);
	}
}
