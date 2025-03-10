package easy;

import java.util.HashMap;
import java.util.Map;

public class ClimbingStairs {
    private final Map<Integer, Integer> map = new HashMap<>();

    public int climbStairs(int n) {
        return helper(n);
    }

    private int helper(int n) {

        int res = 0;

        if (map.containsKey(n)) return map.get(n);

        if (n == 1) return 1;
        if (n == 2) return 2;

        res = helper(n - 1) + helper(n - 2);
        map.put(n, res);

        return res;
    }
}
