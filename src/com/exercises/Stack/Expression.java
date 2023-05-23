import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Expression {

    private final List<Character> leftBrackets = Arrays.asList('(', '<', '[', '{');
    private final List<Character> rightBrackets = Arrays.asList(')', '>', ']', '}');
    private final List<Character> mathExpression = Arrays.asList('+', '-', '*', '%', '/', '=', '.');
    public boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();
        for (char ch : input.toCharArray()) {
            if(leftBrackets.contains(ch)){
                stack.push(ch);
            }
            if(rightBrackets.contains(ch)){
                if(stack.empty()){
                    return false;
                }
                var top = stack.pop();
                if(!check(top, ch)){
                    return false;
                }
            }
        }
        return stack.empty();
    }

    private boolean check(char top, char ch) {
        return leftBrackets.indexOf(top) == rightBrackets.indexOf(ch);
    }
    public void findBrackets(String input) {
        Map<Integer, Character> map = new HashMap<>();
        for (char ch : input.toCharArray()) {
            if(!leftBrackets.contains(ch) && !rightBrackets.contains(ch) && !mathExpression.contains(ch)){
                System.out.println(ch);
                int count = 0;
                int cut = input.indexOf(ch);
                String str = input.substring(0, cut);
                for (char m : str.toCharArray()) {
                    if(leftBrackets.contains(m)){
                        count++;
                    }
                    if(rightBrackets.contains(m)){
                        count--;
                    }
                    map.put(count, m);
                }
            }
        }
        int max = 0;
        for (int x : map.keySet()) {
            if(x > max){
                max = x;
            }
        }
        System.out.println(max);
    }

}
