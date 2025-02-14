import java.lang.*;
import java.util.*;
public class CountMaxPairs {
/*

Max Number of K-Sum Pairs

You are given an integer array nums and an integer k.

In one operation, you can pick two numbers from the array whose sum equals k and remove them from the array.

Return the maximum number of operations you can perform on the array.

 

Example 1:

Input: nums = [1,2,3,4], k = 5
Output: 2
Explanation: Starting with nums = [1,2,3,4]:
- Remove numbers 1 and 4, then nums = [2,3]
- Remove numbers 2 and 3, then nums = []
There are no more pairs that sum up to 5, hence a total of 2 operations.

Example 2:

Input: nums = [3,1,3,4,3], k = 6
Output: 1
Explanation: Starting with nums = [3,1,3,4,3]:
- Remove the first two 3's, then nums = [1,4,3]
There are no more pairs that sum up to 6, hence a total of 1 operation.

 

Constraints:

    1 <= nums.length <= 10^5
    1 <= nums[i] <= 10^9
    1 <= k <= 10^9




*/


  public static void main(String[] args) {
    //Integer[] nums = { 2,3,4,1,5,0,6,8,3,0};
    Integer[] nums = {1,2,3,4};
    int k = 5;
    System.out.println(maxPairs(nums, k));
  }

  public static int maxPairs(Integer[] nums, int k) {
    int max = 0, l = 0, r = nums.length-1;
    // code goes here

    // Two pointers approach
    // sort the array
    Arrays.sort(nums);

    while(l < r)
    {
        if(nums[l] + nums[r] > k)
        {
            r--;
        } else if(nums[l] + nums[r] < k)
        {
            l++;
        }
        else{
            max++;
            l++;
            r--;
        }
    }
//    display(nums);
  
    return max;
  }

  public static void display(Integer[] nums) {
    
    for (int i = 0; i< nums.length; i++)
    {
        System.out.print(nums[i]+ "");
    }
    System.out.println();
  }


  public static int maxPairs_OLD(Integer[] nums, int k) {
    int max = 0;
    // code goes here

    for (int i = 0; i < nums.length; i++)
    {
        for (int j = 0; j < nums.length -1 ; j++)
        {
            if((nums[i] + nums[j]) == k)
            {
                max++;
            }
        }
    }
    return max;
  }

}
