import java.util.*;

class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        List<Integer> res = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        int length = nums.length;

        for (int i = length - 1; i >= 0; i--) {
            stack.push(nums[i]);
        }

        while (!stack.isEmpty()) {
            int a = stack.pop();

            // if no elements left further → must also merge with res
            if (stack.isEmpty()) {
                while (!res.isEmpty()) {
                    int last = res.get(res.size() - 1);
                    int g = gcd(last, a);
                    if (g == 1) break;
                    res.remove(res.size() - 1);
                    a = (int)((long)last / g * a);
                }
                res.add(a);
            } else {
                int b = stack.peek();
                int GCD = gcd(a, b);

                if (GCD > 1) {
                    // keep merging on stack side
                    stack.pop();
                    a = (int)((long)a / GCD * b);
                    while (!stack.isEmpty()) {
                        int top = stack.peek();
                        int g = gcd(a, top);
                        if (g == 1) break;
                        stack.pop();
                        a = (int)((long)a / g * top);
                    }
                    stack.push(a);
                } else {
                    // merge with res side
                    while (!res.isEmpty()) {
                        int last = res.get(res.size() - 1);
                        int g = gcd(last, a);
                        if (g == 1) break;
                        res.remove(res.size() - 1);
                        a = (int)((long)last / g * a);
                    }
                    res.add(a);
                }
            }
        }
        return res;
    }

    static int gcd(int a, int b) {
        if (a == 0) return b;
        return gcd(b % a, a);
    }
}
