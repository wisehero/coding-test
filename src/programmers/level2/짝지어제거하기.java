package programmers.level2;

import java.util.ArrayDeque;
import java.util.Deque;

public class 짝지어제거하기 {
    public int solution(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peekLast() == c) {
                stack.pollLast();
            } else {
                stack.addLast(c);
            }
        }
        return stack.isEmpty() ? 1 : 0;
    }
}
