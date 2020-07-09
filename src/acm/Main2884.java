package acm;

import java.util.*;
public class Main2884 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a, b;
	a=sc.nextInt();
	b=sc.nextInt();

	if(b-45<0) {
		if(a>=1) {
			System.out.print(a-1);
			System.out.print(" ");
			System.out.print(60+b-45);
		}
		else {
			System.out.print("23 ");
			System.out.print(60+b-45);
		}
		
	}
	else { // °Á Ãâ·Â°¡´É		
			System.out.print(a);
			System.out.print(" ");
			System.out.print(b-45);
	}
}
}
