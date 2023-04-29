// Intersection of two arrays

/* Given two arrays a[] and b[] respectively of size n and m, the task is to print the count of elements in the intersection (or common elements) of the two arrays.

For this question, the intersection of two arrays can be defined as the set containing distinct common elements between the two arrays. 

Example 1:

Input:
n = 5, m = 3
a[] = {89, 24, 75, 11, 23}
b[] = {89, 2, 4}

Output: 1

Explanation: 
89 is the only element 
in the intersection of two arrays.
Example 2:

Input:
n = 6, m = 5
a[] = {1, 2, 3, 4, 5, 6}
b[] = {3, 4, 5, 6, 7} 

Output: 4

Explanation: 
3 4 5 and 6 are the elements 
in the intersection of two arrays.

*/

class IntersectionofTwoArrays 
{
	public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
        // Your code here
        int count=0;
        HashSet<Integer> hs=new HashSet<>();
        for(int i: a){
            hs.add(i);
        }
        for(int j: b){
            if(hs.contains(j)){
                count++;
                hs.remove(j);
            }
        }
        return count;
    }
}

//Expected Time Complexity: O(n + m).
// Expected Auxiliary Space: O(min(n,m)).
