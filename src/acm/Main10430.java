package acm;

import java.util.*;
public class Main10430 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a, b;
	a=sc.nextInt();
	b=sc.nextInt();

	int temp = b;
	
	System.out.println(a*(temp%10));
	temp/=10;
	System.out.println(a*(temp%10));
	temp/=10;
	System.out.println(a*(temp%10));
	System.out.println(a*b);
}
}
