import java.util.*;
class Solution {
    public static int longestConsecutive(int[] nums,int n) {
        HashSet<Integer>st=new HashSet<>();
        for(int s:nums){
            st.add(s);
        }
        int arr[]=new int[st.size()];
        int i=0;
        for(int k:st){
            arr[i++]=k;
        }
        if(arr.length==0){
            return 0;
        }
        Arrays.sort(arr);
        int cnt=1;
        int mxc=1;
        for(i=1;i<arr.length;i++){
          if(arr[i-1]==arr[i]-1){
              cnt++;
          }else{
             cnt=1;
        
          }
          mxc=Math.max(mxc,cnt);
        }
        return mxc;
    }
  
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int nums[]=new int[n];
    for(int i=0;i<n;i++){
      nums[i]=sc.nextInt();
    }
    System.out.println(longestConsecutive(nums,n));
  }
}
