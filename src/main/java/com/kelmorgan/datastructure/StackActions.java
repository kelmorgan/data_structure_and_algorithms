package com.kelmorgan.datastructure;

import java.util.List;

public class StackActions {


    private final List<Character> rightBrackets = List.of(')', '>', ']', '}');
    private final List<Character> leftBrackets = List.of('(', '<', '[', '{');

    public boolean isBalanced(String expression) {
        java.util.Stack<Character> characterStack = new java.util.Stack<>();

        for (var ch : expression.toCharArray()) {
            if (isLeftBracket(ch))
                characterStack.push(ch);

            if (isRightBracket(ch)) {
                if (characterStack.isEmpty()) return false;

                if (bracketNotMatch(characterStack.pop(), ch)) return false;
            }
        }

        return characterStack.isEmpty();
    }

    private boolean isRightBracket(char ch) {
        return rightBrackets.contains(ch);
    }

    private boolean isLeftBracket(char ch) {
        return leftBrackets.contains(ch);
    }

    private boolean bracketNotMatch(char left, char right) {
        return leftBrackets.indexOf(left) != rightBrackets.indexOf(right);
    }

    public String reverse(String message) {
        java.util.Stack<Character> stack = new java.util.Stack<>();

        for (var c : message.toCharArray()) {
            stack.push(c);
        }

        System.out.println(stack);
        var reverse = new StringBuilder();

        while (!stack.isEmpty()) {
            reverse.append(stack.pop());
        }

        return reverse.toString();
    }
}
