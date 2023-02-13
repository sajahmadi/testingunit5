import java.util.Stack;

public class DataStructures {
    public static boolean isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[' || c == '<') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']' || c == '>') {
                if (stack.isEmpty()) {
                    return false;
                }
                char opener = stack.pop();
                if (!((c == ')' && opener == '(') || (c == '}' && opener == '{') || (c == ']' && opener == '[') || (c == '>' && opener == '<'))) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static int missingNumber(int[] nums, int maxNum) {
        int expectedSum = maxNum * (maxNum + 1) / 2;
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }

}
