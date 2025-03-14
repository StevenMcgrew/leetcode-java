import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        output.add(new ArrayList<>());

        for (int num : nums) {
            int innerLoopStop = output.size();
            List<Integer> singleElementList = new ArrayList<>();
            singleElementList.add(num);
            output.add(singleElementList);

            for (int j = 1; j < innerLoopStop; j++) {
                List<Integer> multipleElementList = new ArrayList<>(output.get(j));
                multipleElementList.add(num);
                output.add(multipleElementList);
            }
        }

        return output;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        Solution s = new Solution();
        List<List<Integer>> result = s.subsets(nums);
        System.out.println(result);
    }
}
