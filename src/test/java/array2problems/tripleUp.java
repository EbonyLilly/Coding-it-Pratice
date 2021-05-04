package array2problems;

public class tripleUp {
    public boolean tripleUp(int[] nums) {

        for(int i = 0; i <= nums.length-3; i++){
            int first = nums[i];
            int second = nums[i+1];
            int third = nums[i+2];

            if(first + 1 == second && second + 1 == third){
                return true;
            }
        }
        return false;

    }

}
