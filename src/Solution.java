import java.util.ArrayList;

public class Solution {
    public static void maxSlidingWindow(int[] nums, int k) {


        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> d = new ArrayList<>();

        int maximum=0;

        while (k < nums.length) {
            for (int i = 0; i < nums.length - k; i++) {
                for (int j = i; j < k + i; j++) {
                    a.add(nums[i]);
                }
                maximum = a.get(0);
                for (int b = 1; b < a.size(); b++) {
                    if (maximum < a.get(b))
                        maximum = a.get(b);
                }

                a.clear();
            }
            d.add(maximum);
            k++;
        }

        for (int e=0;e<d.size();e++){
            System.out.print(d.get(e));
        }
//        Integer[] arr = new Integer[d.size()];
//        arr = d.toArray(arr);
//        return arr;
    }

    public static void main(String[] args) {
        int [] nums ={1,5,4,6,7,8,9,7};

        maxSlidingWindow(nums,3);
    }

}