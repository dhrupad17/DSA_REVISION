/*
Subarrays with equal 1s and 0s

Given an array containing 0s and 1s. Find the number of subarrays having equal number of 0s and 1s.

Example 1:

Input:
n = 7
A[] = {1,0,0,1,0,1,1}
Output: 8
Explanation: The index range for the 8 
sub-arrays are: (0, 1), (2, 3), (0, 3), (3, 4), 
(4, 5) ,(2, 5), (0, 5), (1, 6)
Example 2:

Input:
n = 5
A[] = {1,1,1,1,0}
Output: 1
Explanation: The index range for the 
subarray is (3,4).
Your Task:
You don't need to read input or print anything. Your task is to complete the function countSubarrWithEqualZeroAndOne() which takes the array arr[] and the size of the array as inputs and returns the number of subarrays with equal number of 0s and 1s.

Expected Time Complexity: O(n).
Expected Auxiliary Space: O(n).
*/
class Solution
{
    //Function to count subarrays with 1s and 0s.
    static int countSubarrWithEqualZeroAndOne(int arr[], int n)
    {
        // add your code here
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<n;i++){
            if(arr[i]==0)
                arr[i]=-1;
        }
        int ans=0;
        int sum=0;
        hm.put(0,1);
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(hm.containsKey(sum)){
                ans+=hm.get(sum);
            }
            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        return ans;
    }
}