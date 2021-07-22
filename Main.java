package Solution;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		System.out.println("Enter n");
//		int n= in.nextInt();
//		int vx=0,vy=0,vz=0;
//		int[][] vec = new int[n][3]; 
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<3;j++) {
//				vec[i][j]=in.nextInt();
//				if(j==0) {
//					vx+=vec[i][j];
//				}
//				else if(j==1) {
//					vy+=vec[i][j];
//				}
//				else if(j==2) {
//					vz+=vec[i][j];
//				}
//			}
//		}
//			
////		for(int i=0;i<n;i++) {
////			for(int j=0;j<3;j++) {
////				System.out.print(vec[i][j]+" ");
////			}
////			System.out.println();
////		}
//		if(vx==0 && vy==0 && vz==0) {
//			System.out.println("Yes");
//		}
//		else {
//			System.out.println("No");
//		}
		
//		<-------MaximumSubsetSum------->
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] arr = new long[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextLong();
		}
		ArrayList<Long> ans = MaximumSubsetSum.MaximumSum(n, arr);
		for (Long long1 : ans) {
			System.out.print(long1+" ");
		}
		
	}

}
