package Solution;

import java.util.ArrayList;

public class MaximumSubsetSum {
// www.hackerearth.com/practice/algorithms/searching/linear-search/practice-problems/algorithm/maximum-sum-4-f8d12458/

//	Main method code
//	Scanner sc = new Scanner(System.in);
//	int n = sc.nextInt();
//	long[] arr = new long[n];
//	for(int i=0;i<n;i++) {
//		arr[i]=sc.nextLong();
//	}
public static ArrayList<Long> MaximumSum(int n,long[] arr){
	
	long max = arr[0];
	long sum=arr[0];
	long count=1;
	for(int i=1;i<n;i++){
		sum+=arr[i];
		if(sum>max) {
			max=sum;
			count++;
		}
		else {
			sum-=arr[i];
			
		}
		
	}
	ArrayList<Long> ans = new ArrayList<>();
	ans.add(max);
	ans.add(count);
	
	return ans;
		
		
}
	
	

}
