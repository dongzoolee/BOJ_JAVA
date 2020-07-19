package acm;

import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.lang.*;

public class Main3052 {
	static List lst = new ArrayList();

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Set hsh = new HashSet();
		Set lkd = new LinkedHashSet();
		for (int i = 0; i < 10; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			//lst.add(Integer.parseInt(st.nextToken()) % 42);
			hsh.add(Integer.parseInt(st.nextToken()) % 42);
		}
		List lstt = new ArrayList();
		lstt = (List) lst.parallelStream().distinct().collect(Collectors.toList());
		// Collections.sort(lst);

		System.out.print(lstt.size());
		
		List lis = new ArrayList(hsh);
		System.out.print(hsh.size());
		// 중복제거 hashset linkedhashset
	}
}
