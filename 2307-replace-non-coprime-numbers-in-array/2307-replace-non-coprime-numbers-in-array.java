import java.util.*;

class Solution {
    public List<Integer> replaceNonCoprimes(int[] nums) {
        List<Integer> stack = new ArrayList<>();

        for (int x : nums) {
            stack.add(x);

            // keep merging while last two are non-coprime
            while (stack.size() > 1) {
                int a = stack.get(stack.size() - 2);
                int b = stack.get(stack.size() - 1);
                int g = gcd(a, b);
                if (g == 1) break;
                stack.remove(stack.size() - 1);
                stack.remove(stack.size() - 1);
                long lcm = (long)a / g * b;
                stack.add((int) lcm);
            }
        }

        return stack;
    }

    // ✅ your gcd version
    static int gcd(int a, int b) {
        if (a == 0) return b;
        return gcd(b % a, a);
    }
}
