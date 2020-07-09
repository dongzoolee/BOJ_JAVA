package acm;

import java.util.*;

public class Main9498 {
	public static void grade(int sc) {
		if(sc>=90)
			System.out.println("A");
		else if(sc>=80)
			System.out.println("B");
		else if(sc>=70)
			System.out.println("C");
		else if(sc>=60)
			System.out.println("D");
		else
			System.out.println("F");
	}
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	grade(a);
	}
}
