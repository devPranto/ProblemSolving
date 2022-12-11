package ProblemSolving;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr= new int []{-1,0,1,2,-1,-4};
        List<List<Integer>> result=threeSum(arr);
       System.out.println(result); 
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> output = new LinkedList<>();
        for(int i=0 ; i<nums.length-2 ;i++){
            if(i==0 || (i>0 && nums[i]!=nums[i-1])){ //if both values are same then the solution will be redundant 
                int low=i+1;
                int highest=nums.length-1;
                int sum= 0-nums[i];
                while(low<highest){
                    if(nums[low]+nums[highest]==sum){
                       // System.out.println(nums[i]);
                        output.add(Arrays.asList(nums[i],nums[low],nums[highest]));
                        while(low<highest && nums[low]==nums[low+1]) low++;//eliminating identical lower values
                        while(low<highest && nums[highest]==nums[highest-1]) highest--;// eliminating higher identical values
                        low++;
                        highest--;
                    }
                    else if(nums[low]+nums[highest]>sum){
                        highest--;
                    }else{
                        low++;
                    }
                }
            }
        }
        return output;
        
    }
}
