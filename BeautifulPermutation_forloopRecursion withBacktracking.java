
// Time Complexity :O(n^n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
// using forloop recursion along with backtracking
// 1. there will be total n choices for each number ( but combination with self won't be valid)
// run for loop from 1 to n choices and for keeping track maintain a boolean visited array
 

class Solution {
    int result =0;
    public int countArrangement(int n) {
        
        boolean[] visited = new boolean[n+1];
        dfs(n, 1, visited);
            return result;
    }
    
    private void dfs(int n , int index, boolean[] visited)
    {
        if( index > n)
        result++; 
        
        for(int i = 1; i <= n ; i++)
        {
            if( (i %index == 0 || index % i ==0 ) && visited[i] == false )
            { 
                // action
                visited[i] = true;
                //recursion
                dfs(n,index+1, visited);
                // backtracking
                visited[i] = false;
            }
        }
    }
}