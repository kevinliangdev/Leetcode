import java.util.HashMap;

public class TwoSum {
//
//    public static int[] twoSum(int[] nums, int target) {
//
//        int[] array = new int[2];
//
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target) {
//                    array[0] = i;
//                    array[1] = j;
//
//                }
//            }
//        }
//
//        return array;
//
//
//
//    }

    public static int[] twoSum(int[] nums, int target) {


            HashMap <Integer, Integer> map
                    = new HashMap<Integer, Integer>();
            int complement;
            //loop to check every element in the array
            for (int i = 0; i<nums.length; i++) {
                complement = target - nums[i];
                //if we already have the complement in HashMap,
                //return an array that contains indices of them.
                if (map.containsKey(complement)) {
                    return new int[] {i, map.get(complement)};
                }
                //if its complement is not in HashMap but in the array,
                //they will be matched when the complement is
                //regarded as current element.
                //add current element into HashMap.
                map.put(nums[i], i);
            }
            //Exception which says it is unavailable to find solution
            //with these arguments.
            throw new IllegalArgumentException("No solution");






    }
}
