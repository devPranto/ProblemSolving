package BackendEngineering.src.ProblemSolving.LeetCode;
public class Search {

    public static int search(int[] nums, int target) {
        int start=0;
        int end= nums.length-1;
        int mid = (start+end)/2;
        int iteration=nums.length/2;
        while(iteration>0){
            if(target==nums[mid]){
                return mid;
            } else if (target>nums[mid]) {
                start=mid;
            }else if (target<nums[mid]){
                end=mid;
            }
            mid=(start+end)/2;
            iteration--;
        }
        return -1;

    }

    public static void main(String[] args) {
        System.out.println(search(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 10},4));
    }

}
