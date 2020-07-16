package acm;

import java.util.*;
import java.io.*;

public class Main2839 {
	static int n;
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		int[] dp = new int[n+1];
		dp[0]=0; dp[1] = 0; dp[2] = 0; dp[3]=1;
		if(n>=5) dp[5]=1;
		for(int i = 6;i<=n;i++) {
			if(dp[i-3]!=0 && dp[i-5]!=0)
			dp[i]=Math.min(dp[i-3]+1, dp[i-5]+1);
			else if(dp[i-3]!=0 && dp[i-5]==0)
				dp[i]=dp[i-3]+1;
			else if(dp[i-3]==0 && dp[i-5]!=0)
				dp[i]=dp[i-5]+1;
		}
		if(dp[n]==0)
			System.out.println(-1);
		else
			System.out.println(dp[n]);
	}
}
