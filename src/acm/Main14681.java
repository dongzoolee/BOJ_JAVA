package acm;

import java.util.*;

public class Main14681 {
	public static void grade(int x, int y) {
		if(x>0 && y>0)
			System.out.println("1");
		else if(x<0&&y>0)
			System.out.println("2");
		else if(x<0&&y<0)
			System.out.println("3");
		else if(x>0&&y<0)
			System.out.println("4");
	}
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt(), b = sc.nextInt();
	grade(a, b);
	}
}
