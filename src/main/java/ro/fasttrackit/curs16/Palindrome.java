package ro.fasttrackit.curs16;

import java.util.Stack;

public class Palindrome {

    public boolean isPalindorme(String string) {
        if (string == null) {
            return false;
        } else if (string.length() <= 1) {
            return true;
        } else {
            String noSpace = eliminateSpaces(string);
            return noSpace.equalsIgnoreCase(reverse(noSpace));
        }
    }

    private String eliminateSpaces(String string) {
        StringBuilder result = new StringBuilder();
        for (char chr : string.toCharArray()) {
            if (!Character.isWhitespace(chr)) {
                result.append(chr);
            }
        }
        return result.toString();
    }

    private String reverse(String string) {
        var stack = new Stack<>();
        for (Character character : string.toCharArray()) {
            stack.push(character);
        }
        String result = "";
        while (!stack.empty()) {
            result += stack.pop();
        }
        return result;
    }
}
